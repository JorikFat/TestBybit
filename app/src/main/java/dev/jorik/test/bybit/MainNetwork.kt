package dev.jorik.test.bybit

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class MainNetwork(
    private val client: HttpClient
) : MainRepository.Network {
    private val endpoint = "https://api.bybit.com/v5/announcements/index"

    override suspend fun getItems(): Response =
        client.get(endpoint) {
            parameter("locale", "en-US")
            parameter("limit", 10)
        }
}