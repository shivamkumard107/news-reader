package com.learning.newsreader.di.module

import android.app.Application
import android.content.Context
import com.learning.newsreader.di.BaseUrl
import dagger.Module
import dagger.Provides
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideGsonConvertorFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Provides
    @BaseUrl
    fun provideBaseUrl() = "https://newsapi.org/v2/"
}