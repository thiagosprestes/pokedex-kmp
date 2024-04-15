package com.example.pokedexkmp.core.data.remote.service

import com.example.pokedexkmp.core.data.remote.model.PokemonResponse
import de.jensklingenberg.ktorfit.http.GET

interface PokemonService {
    @GET("pokemon")
    suspend fun getPokemons(): PokemonResponse
}