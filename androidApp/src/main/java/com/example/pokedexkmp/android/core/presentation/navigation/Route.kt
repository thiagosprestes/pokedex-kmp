package com.example.pokedexkmp.android.core.presentation.navigation

sealed class Route(
    val routeName: String
) {
    object HomeScreen : Route("HomeScreen")
}