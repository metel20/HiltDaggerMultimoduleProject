package com.metel20.hiltdaggermultimoduleproject

import android.app.Application
import com.metel20.data.BaseRepository
import com.metel20.domain.QuoteRepository
import com.metel20.presentation.MainViewModel
import com.metel20.presentation.ProvideViewModel

class AnimeQuoteApp : Application(), ProvideViewModel {

    private lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        val repository: QuoteRepository = BaseRepository()
        viewModel = MainViewModel(repository = repository)
    }

    override fun viewModel(): MainViewModel {
        return viewModel
    }
}