package com.learning.newsreader

import android.app.Application
import com.learning.newsreader.di.component.ApplicationComponent
import com.learning.newsreader.di.component.DaggerApplicationComponent
import com.learning.newsreader.di.module.ApplicationModule

class NewsReaderApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependency()
    }

    private fun injectDependency() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}