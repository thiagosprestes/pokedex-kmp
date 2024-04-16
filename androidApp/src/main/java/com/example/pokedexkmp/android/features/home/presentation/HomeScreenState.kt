package com.example.pokedexkmp.android.features.home.presentation

import com.example.pokedexkmp.core.data.remote.model.ComposableState
import com.example.pokedexkmp.core.data.remote.model.PokemonResponseItem

data class HomeScreenState(
    val state: ComposableState = ComposableState.LOADING,
    val pokemons: List<PokemonResponseItem> = emptyList()
)