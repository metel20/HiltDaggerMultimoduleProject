package com.metel20.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.metel20.domain.QuoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: QuoteRepository

) : ViewModel() {
    private val innerLiveData = MutableLiveData<String>()
    val liveData: LiveData<String>
        get() = innerLiveData
    private val viewModelScope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    private var a = 2

    fun load() {
        viewModelScope.launch {
            val quote = repository.loadQuote().second
            innerLiveData.value = quote
        }
    }

}