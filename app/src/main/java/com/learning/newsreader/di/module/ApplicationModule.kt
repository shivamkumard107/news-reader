package com.learning.newsreader.di.module

import android.app.Application
import android.content.Context
import com.learning.newsreader.data.api.NetworkService
import com.learning.newsreader.di.ApplicationContext
import com.learning.newsreader.di.BaseUrl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @ApplicationContext
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

    @Provides
    @Singleton
    fun provideNetworkService(
        @BaseUrl baseUrl: String,
        gsonConvertorFactory: GsonConverterFactory
    ): NetworkService {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(gsonConvertorFactory)
            .build()
            .create(NetworkService::class.java)
    }
}