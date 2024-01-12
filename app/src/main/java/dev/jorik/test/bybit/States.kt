package dev.jorik.test.bybit

import java.lang.Exception

sealed interface State {
    object Loading :State
    class Data(val items :List<Item>) :State
    class Error(val exception: Exception) :State
}