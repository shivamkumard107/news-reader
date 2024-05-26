package com.learning.newsreader.di.component

import android.content.Context
import com.learning.newsreader.di.FragmentContext
import com.learning.newsreader.di.FragmentScope
import com.learning.newsreader.di.module.FragmentModule
import com.learning.newsreader.ui.main.MainFragment
import com.learning.newsreader.ui.topheadline.TopHeadlineFragment
import dagger.Component

@FragmentScope
@Component(
    dependencies = [ActivityComponent::class],
    modules = [FragmentModule::class]
)
interface FragmentComponent {

    fun inject(fragment: TopHeadlineFragment)

    fun inject(fragment: MainFragment)

    @FragmentContext
    fun getContext(): Context
}