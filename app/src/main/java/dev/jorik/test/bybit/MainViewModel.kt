package dev.jorik.test.bybit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val flow = MutableStateFlow<String>("")
    val items : StateFlow<String> get() = flow

    init {
        viewModelScope.launch {
            flow.emit("")
        }
    }
}