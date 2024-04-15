package com.example.pokedexkmp.core.data.remote.api

import de.jensklingenberg.ktorfit.Ktorfit
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

private val ktorClient = HttpClient {
    install(ContentNegotiation) {
        json(Json {
            isLenient = true
            ignoreUnknownKeys = true
        })
    }
    defaultRequest {
        url("")
    }
}

val httpClient = Ktorfit.Builder().httpClient(ktorClient).build()