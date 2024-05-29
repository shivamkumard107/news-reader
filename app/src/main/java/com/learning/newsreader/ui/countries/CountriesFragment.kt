package com.learning.newsreader.ui.countries

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.newsreader.databinding.FragmentCountriesBinding
import com.learning.newsreader.ui.base.BaseJetpackFragment

class CountriesFragment : BaseJetpackFragment<FragmentCountriesBinding>(FragmentCountriesBinding::inflate) {

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
        Log.d(TAG, "setupUi: ")
    }
    companion object {
        private const val TAG = "CountriesFragment"
    }
}