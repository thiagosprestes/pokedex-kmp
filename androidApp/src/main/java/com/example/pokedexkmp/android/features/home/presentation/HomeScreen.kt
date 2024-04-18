package com.example.pokedexkmp.android.features.home.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.pokedexkmp.android.core.presentation.components.Error
import com.example.pokedexkmp.android.core.presentation.components.Loading
import com.example.pokedexkmp.android.features.home.presentation.components.Default
import com.example.pokedexkmp.core.domain.model.ComponentState
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(key1 = true) {
        viewModel.getPokemons()
    }

    when (uiState.state) {
        ComponentState.DEFAULT -> Default(uiState.pokemons)
        ComponentState.LOADING -> Loading()
        ComponentState.ERROR -> Error(onRetry = {})
    }
}

@Preview
@Composable
fun HomePreview() {
    HomeScreen(viewModel = koinViewModel())
}