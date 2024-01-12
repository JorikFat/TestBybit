package dev.jorik.test.bybit

import android.app.Application
import io.ktor.client.HttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            module {
            }
            modules(module{
                single<HttpClient> { networkClient }
                single<MainRepository.Network> { MainNetwork(get()) }
                single<MainDomain> { MainRepository(get()) }
                viewModel { MainViewModel(get()) }
            })
        }
    }
}