package com.learning.newsreader.ui.languages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learning.newsreader.databinding.FragmentLangaugesBinding
import com.learning.newsreader.ui.base.BaseJetpackFragment

class LanguagesFragment: BaseJetpackFragment<FragmentLangaugesBinding>(FragmentLangaugesBinding::inflate) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}