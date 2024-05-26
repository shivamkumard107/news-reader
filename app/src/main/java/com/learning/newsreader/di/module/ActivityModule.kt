package com.learning.newsreader.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.learning.newsreader.di.ActivityContext
import com.learning.newsreader.ui.MainActivityViewModel
import com.learning.newsreader.ui.topheadline.TopHeadlineAdapter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityContext
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideMainActivityViewModel(): MainActivityViewModel {
        return ViewModelProviders.of(activity)[MainActivityViewModel::class.java]
    }

    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())
}