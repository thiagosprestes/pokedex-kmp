package com.example.pokedexkmp.core.di

import org.koin.dsl.module
import com.example.pokedexkmp.core.data.remote.api.httpClient
import com.example.pokedexkmp.core.data.remote.service.PokemonService
import com.example.pokedexkmp.core.data.remote.service.PokemonServiceImpl
import com.example.pokedexkmp.core.domain.usecase.GetPokemonsUseCase
import com.example.pokedexkmp.features.home.datasource.PokemonDatasource
import com.example.pokedexkmp.features.home.datasource.PokemonDatasourceImpl
import com.example.pokedexkmp.features.home.repository.PokemonRepository
import com.example.pokedexkmp.features.home.repository.PokemonRepositoryImpl

val sharedModule = module {
    single { httpClient }
    single<PokemonService> { PokemonServiceImpl(get()) }
    single<PokemonDatasource> { PokemonDatasourceImpl(get()) }
    single<PokemonRepository> { PokemonRepositoryImpl(get()) }
    factory { GetPokemonsUseCase() }
}