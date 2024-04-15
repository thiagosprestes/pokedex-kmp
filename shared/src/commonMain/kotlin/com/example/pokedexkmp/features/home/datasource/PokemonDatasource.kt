package com.example.pokedexkmp.features.home.datasource

import com.example.pokedexkmp.core.data.remote.model.PokemonResponse
import com.example.pokedexkmp.core.data.remote.service.PokemonService

interface PokemonDatasource {
    suspend fun getPokemons(): PokemonResponse
}

class PokemonDatasourceImpl(
    private val pokemonService: PokemonService
) : PokemonDatasource {
    override suspend fun getPokemons(): PokemonResponse {
        return pokemonService.getPokemons()
    }
}