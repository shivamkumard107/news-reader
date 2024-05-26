package com.learning.newsreader.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.learning.newsreader.data.repository.TopHeadlineRepository
//import com.learning.newsreader.di.FragmentContext
import com.learning.newsreader.ui.base.ViewModelProviderFactory
import com.learning.newsreader.ui.topheadline.TopHeadlineViewModel
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private val context: Fragment) {

    @Provides
    fun provideTopHeadlineViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(
            context,
            ViewModelProviderFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            }
        )[TopHeadlineViewModel::class.java]
    }

//    @Provides
//    @FragmentContext
//    fun provideContext(context: Context) = context

}