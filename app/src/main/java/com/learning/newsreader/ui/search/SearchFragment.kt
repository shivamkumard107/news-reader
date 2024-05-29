package com.learning.newsreader.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.newsreader.databinding.FragmentSearchBinding
import com.learning.newsreader.ui.base.BaseJetpackFragment

class SearchFragment : BaseJetpackFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        setupUi()
        return binding.root
    }

    private fun setupUi() {

    }
}