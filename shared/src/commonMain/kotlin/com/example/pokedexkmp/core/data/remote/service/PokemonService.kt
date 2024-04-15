package com.example.pokedexkmp.core.data.remote.service

import com.example.pokedexkmp.core.data.remote.model.PokemonResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

interface PokemonService {
    suspend fun getPokemons(): PokemonResponse
}

class PokemonServiceImpl(
    private val httpClient: HttpClient
) : PokemonService {
    override suspend fun getPokemons(): PokemonResponse {
        return httpClient.get("pokemon").body()
    }
}