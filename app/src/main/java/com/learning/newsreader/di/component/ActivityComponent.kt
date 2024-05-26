package com.learning.newsreader.di.component

import com.learning.newsreader.di.ActivityScope
import com.learning.newsreader.di.module.ActivityModule
import dagger.Component
import com.learning.newsreader.ui.topheadline.TopHeadlineActivity

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [ApplicationComponent::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)
}