package com.learning.newsreader.di.component

import android.content.Context
import com.learning.newsreader.NewsReaderApp
import com.learning.newsreader.di.module.ApplicationModule
import dagger.Component
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    // for field injection
    fun inject(application: NewsReaderApp)

    // to pass down dependencies to its children component like activity component
    fun getContext(): Context

    fun getGsonConvertorFactory(): GsonConverterFactory
}