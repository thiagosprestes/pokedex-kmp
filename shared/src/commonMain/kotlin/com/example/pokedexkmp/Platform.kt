package com.example.pokedexkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform