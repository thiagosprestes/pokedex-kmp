package com.example.pokedexkmp.android.features.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedexkmp.features.home.repository.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val pokemonRepository: PokemonRepository
) : ViewModel() {
    val _teste = MutableStateFlow("AQUI")
    val teste = _teste.asStateFlow()

    suspend fun getPokemons() {
        viewModelScope.launch {
            val response = pokemonRepository.getPokemons()
            println(response)
        }
    }
}