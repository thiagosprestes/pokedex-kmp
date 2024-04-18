package com.example.pokedexkmp.core.domain.usecase

import com.example.pokedexkmp.core.data.remote.model.PokemonResponseItem
import com.example.pokedexkmp.features.home.repository.PokemonRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetPokemonsUseCase : KoinComponent {
    private val repository: PokemonRepository by inject()

    suspend operator fun invoke(): List<PokemonResponseItem> {
        return repository.getPokemons()
    }
}