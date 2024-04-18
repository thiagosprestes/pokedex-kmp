package com.example.pokedexkmp.android.features.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedexkmp.core.domain.model.ComponentState
import com.example.pokedexkmp.features.home.repository.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel(
    private val pokemonRepository: PokemonRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow(HomeScreenState())
    val uiState = _uiState.asStateFlow()

    suspend fun getPokemons() {
        viewModelScope.launch {
            try {
                val response = pokemonRepository.getPokemons()

                _uiState.update { currentState ->
                    currentState.copy(
                        state = ComponentState.DEFAULT,
                        pokemons = response
                    )
                }
            } catch (error: Exception) {
                _uiState.update { currentState ->
                    currentState.copy(
                        state = ComponentState.ERROR,
                    )
                }
            }
        }
    }
}