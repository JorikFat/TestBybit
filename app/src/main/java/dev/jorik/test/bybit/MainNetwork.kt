package dev.jorik.test.bybit

import com.google.gson.Gson

class MainNetwork(
    //todo add client
): MainRepository.Network {

    override suspend fun getItems(): Response {
        return Gson().fromJson(stubJson, Response::class.java)
    }
}