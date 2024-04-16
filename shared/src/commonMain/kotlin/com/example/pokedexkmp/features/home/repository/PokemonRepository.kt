package com.example.pokedexkmp.features.home.repository

import com.example.pokedexkmp.core.data.remote.api.ApiResponse
import com.example.pokedexkmp.core.data.remote.model.PokemonResponseItem
import com.example.pokedexkmp.features.home.datasource.PokemonDatasource
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface PokemonRepository {
    suspend fun getPokemons(): Flow<ApiResponse<List<PokemonResponseItem>>>
}

class PokemonRepositoryImpl(
    private val pokemonDatasource: PokemonDatasource
) : PokemonRepository {
    override suspend fun getPokemons(): Flow<ApiResponse<List<PokemonResponseItem>>> = flow {
        try {
            val response = pokemonDatasource.getPokemons()
            emit(ApiResponse.Success(response.results))
        } catch (exception: IOException) {
            exception.printStackTrace()
            emit(ApiResponse.Error(exception.cause.toString()))
        }
    }
}
