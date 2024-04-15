package com.example.pokedexkmp.core.di

import org.koin.dsl.module
import com.example.pokedexkmp.core.data.remote.api.httpClient
import com.example.pokedexkmp.features.home.datasource.PokemonDatasourceImpl
import com.example.pokedexkmp.features.home.repository.PokemonRepositoryImpl

val httpClientModule = module {
    single { httpClient }
}

val pokemonDataSourceModule = module {
    single { PokemonDatasourceImpl(get()) }
}

val pokemonRepositoryModule = module {
    single { PokemonRepositoryImpl(get()) }
}

fun appModule() = listOf(
    httpClientModule,
    pokemonDataSourceModule,
    pokemonRepositoryModule
)