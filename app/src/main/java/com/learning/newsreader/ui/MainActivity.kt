package com.learning.newsreader.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learning.newsreader.NewsReaderApp
import com.learning.newsreader.databinding.ActivityMainBinding
import com.learning.newsreader.di.component.ActivityComponent
import com.learning.newsreader.di.component.DaggerActivityComponent
import com.learning.newsreader.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainActivityViewModel

    lateinit var activityComponent: ActivityComponent

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependency()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
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