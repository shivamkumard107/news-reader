package com.learning.newsreader.di.component

import com.learning.newsreader.data.repository.TopHeadlineRepository
import com.learning.newsreader.di.ActivityScope
import com.learning.newsreader.di.module.ActivityModule
import com.learning.newsreader.ui.MainActivity
import com.learning.newsreader.ui.topheadline.TopHeadlineAdapter
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [ApplicationComponent::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun getTopHeadlineAdapter(): TopHeadlineAdapter

    fun getTopHeadlineRepository(): TopHeadlineRepository
}