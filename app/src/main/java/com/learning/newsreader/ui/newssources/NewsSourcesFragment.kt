package com.learning.newsreader.ui.newssources

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.newsreader.databinding.FragmentNewsSourceBinding
import com.learning.newsreader.ui.base.BaseJetpackFragment

class NewsSourcesFragment :
    BaseJetpackFragment<FragmentNewsSourceBinding>(FragmentNewsSourceBinding::inflate) {
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
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}