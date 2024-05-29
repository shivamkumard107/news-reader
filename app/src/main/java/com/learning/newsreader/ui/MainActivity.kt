package com.learning.newsreader.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learning.newsreader.NewsReaderApp
import com.learning.newsreader.R
import com.learning.newsreader.databinding.ActivityMainBinding
import com.learning.newsreader.di.component.ActivityComponent
import com.learning.newsreader.di.component.DaggerActivityComponent
import com.learning.newsreader.di.module.ActivityModule
import com.learning.newsreader.utils.findNavControllerLazy
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainActivityViewModel

    lateinit var activityComponent: ActivityComponent

    private lateinit var binding: ActivityMainBinding
    private val navController by findNavControllerLazy(R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependency()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUi()
    }

    private fun setupUi() {
        navController.setGraph(R.navigation.main_nav_graph, intent?.extras)
    }

    private fun injectDependency() {
        activityComponent = DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule(this))
            .applicationComponent((application as NewsReaderApp).applicationComponent)
            .build()
        activityComponent.inject(this)
    }
}