package com.learning.newsreader.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learning.newsreader.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    private lateinit var viewModel: MainActivityViewModel

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}