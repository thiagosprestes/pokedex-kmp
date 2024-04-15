package com.example.pokedexkmp.android

import android.app.Application
import com.example.pokedexkmp.android.core.di.homeViewModelModule
import com.example.pokedexkmp.core.di.sharedModule
import org.koin.core.context.startKoin

class PokedexKmpApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(sharedModule, homeViewModelModule)
        }
    }
}