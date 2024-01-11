package dev.jorik.test.bybit

interface MainDomain {
    suspend fun getItems() :List<Item>
}