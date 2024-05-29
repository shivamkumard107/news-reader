package com.learning.newsreader.di.module

import android.content.Context
import com.learning.newsreader.di.FragmentContext
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.learning.newsreader.data.repository.TopHeadlineRepository
import com.learning.newsreader.di.FragmentScope
import com.learning.newsreader.ui.base.ViewModelProviderFactory
import com.learning.newsreader.ui.main.MainFragmentViewModel
import com.learning.newsreader.ui.topheadline.TopHeadlineViewModel
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private val context: Fragment) {

    @Provides
    @FragmentScope
    fun provideTopHeadlineViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(
            context,
            ViewModelProviderFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            }
        )[TopHeadlineViewModel::class.java]
    }

    @Provides
    @FragmentScope
    fun provideMainFragmentViewModel() =
        ViewModelProviders.of(context)[MainFragmentViewModel::class.java]

    @Provides
    @FragmentContext
    fun provideContext(): Context = context.requireContext()

}