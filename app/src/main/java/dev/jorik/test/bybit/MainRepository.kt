package dev.jorik.test.bybit

class MainRepository(
    private val network :Network
) :MainDomain{
    override suspend fun getItems(): List<Item> {
        return network.getItems().result.list
    }

    interface Network {
        suspend fun getItems() :Response
    }
}