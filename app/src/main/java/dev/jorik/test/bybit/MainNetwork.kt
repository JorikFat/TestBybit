package dev.jorik.test.bybit

import io.ktor.client.HttpClient
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.logging.DEFAULT
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.Logging
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class MainNetwork(): MainRepository.Network {
    private val client = HttpClient(){
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.ALL
        }
    }

    val endpoint = "https://api.bybit.com/v5/announcements/index"

    override suspend fun getItems(): Response {
        return client.get(endpoint){
            parameter("locale", "en-US")
            parameter("limit", 10)
        }
    }
}