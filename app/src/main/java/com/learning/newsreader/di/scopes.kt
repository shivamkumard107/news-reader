package com.learning.newsreader.di

import javax.inject.Scope

@Retention(AnnotationRetention.BINARY)
@Scope
annotation class ActivityScope

@Retention(AnnotationRetention.BINARY)
@Scope
annotation class FragmentScope