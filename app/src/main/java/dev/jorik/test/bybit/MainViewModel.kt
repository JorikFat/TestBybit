package dev.jorik.test.bybit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(
    private val domain :MainDomain
) : ViewModel() {
    private val flow = MutableStateFlow<List<Item>>(listOf())
    val items : StateFlow<List<Item>> get() = flow

    init {
        viewModelScope.launch {
            flow.emit(domain.getItems())
        }
    }
}