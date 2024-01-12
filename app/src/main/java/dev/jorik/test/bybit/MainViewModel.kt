package dev.jorik.test.bybit

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import java.net.UnknownHostException

class MainViewModel(
    private val domain :MainDomain
) : ViewModel() {
    private val flow = MutableStateFlow<State>(State.Loading)
    val items : StateFlow<State> get() = flow

    init {
        load()
    }

    fun retry(){
        flow.tryEmit(State.Loading)
        load()
    }

    private fun load(){
        viewModelScope.launch {
            try {
                flow.emit(State.Data(domain.getItems()))
            } catch (exception :UnknownHostException){
                flow.emit(State.Error(Exception("Нет подключения"), true))
            } catch (exception :Exception){
                flow.emit(State.Error(exception))
            }
        }
    }
}