package com.learning.newsreader.utils

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

fun AppCompatActivity.findNavControllerLazy(@IdRes id: Int) = lazy {
    val navHostFragment = supportFragmentManager.findFragmentById(id) as NavHostFragment
    navHostFragment.navController
}

fun Fragment.findNavControllerLazy(@IdRes id: Int) = lazy {
    val navHostFragment = childFragmentManager.findFragmentById(id) as NavHostFragment
    navHostFragment.navController
}

fun Fragment.findNavControllerLazy() = lazy { findNavController() }
