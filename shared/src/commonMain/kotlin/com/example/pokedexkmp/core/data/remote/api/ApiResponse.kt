package com.example.pokedexkmp.core.data.remote.api

sealed class ApiResponse<out T> {
    data class Error<T>(val message: String) : ApiResponse<T>()
    data class Success<T>(val data: T) : ApiResponse<T>()
}