package com.example.pokedexkmp.features.home.repository

import com.example.pokedexkmp.core.data.remote.model.PokemonResponseItem
import com.example.pokedexkmp.features.home.datasource.PokemonDatasource

interface PokemonRepository {
    suspend fun getPokemons(): List<PokemonResponseItem>
}

class PokemonRepositoryImpl(
    private val pokemonDatasource: PokemonDatasource
) : PokemonRepository {
    override suspend fun getPokemons(): List<PokemonResponseItem> {
        val response = pokemonDatasource.getPokemons()
        return response.results
    }
}
