package com.example.pokedexkmp.features.home.repository

import com.example.pokedexkmp.core.data.remote.model.PokemonResponse
import com.example.pokedexkmp.features.home.datasource.PokemonDatasource

interface PokemonRepository {
    suspend fun getPokemons(): PokemonResponse
}

class PokemonRepositoryImpl(
    private val pokemonDatasource: PokemonDatasource
) : PokemonRepository {
    override suspend fun getPokemons(): PokemonResponse {
        return pokemonDatasource.getPokemons()
    }
}
