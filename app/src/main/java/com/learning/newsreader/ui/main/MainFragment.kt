package com.learning.newsreader.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learning.newsreader.NewsReaderApp
import com.learning.newsreader.R
import com.learning.newsreader.databinding.FragmentMainBinding
import com.learning.newsreader.di.component.DaggerFragmentComponent
import com.learning.newsreader.di.module.FragmentModule
import com.learning.newsreader.ui.MainActivity
import com.learning.newsreader.ui.base.BaseJetpackFragment
import com.learning.newsreader.utils.findNavControllerLazy
import javax.inject.Inject

class MainFragment : BaseJetpackFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    @Inject
    lateinit var viewModel: MainFragmentViewModel

    private val navController by findNavControllerLazy()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        injectDependency()
        setupUi()
        return binding.root
    }

    private fun setupUi() {
        binding.apply {
            btTopHeadlines.setOnClickListener {
                navController.navigate(R.id.action_mainFragment_to_topHeadlineFragment)
            }
            btNewsSources.setOnClickListener {
                navController.navigate(R.id.action_mainFragment_to_newsSourcesFragment)
            }
            btCountries.setOnClickListener {
                navController.navigate(R.id.action_mainFragment_to_countriesFragment)
            }
            btLanguages.setOnClickListener {
                navController.navigate(R.id.action_mainFragment_to_languagesFragment)
            }
            btSearch.setOnClickListener {
                navController.navigate(R.id.action_mainFragment_to_searchFragment)
            }
        }

    }

    private fun injectDependency() {
        DaggerFragmentComponent.builder()
            .fragmentModule(FragmentModule(this))
            .activityComponent((activity as MainActivity).activityComponent)
            .applicationComponent((requireActivity().application as NewsReaderApp).applicationComponent)
            .build().inject(this)
    }
}