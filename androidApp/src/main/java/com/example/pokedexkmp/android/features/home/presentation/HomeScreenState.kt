package com.example.pokedexkmp.android.features.home.presentation

import com.example.pokedexkmp.core.data.remote.model.PokemonResponseItem
import com.example.pokedexkmp.core.domain.model.ComponentState

data class HomeScreenState(
    val state: ComponentState = ComponentState.LOADING,
    val pokemons: List<PokemonResponseItem> = emptyList()
)