package com.example.pokedexkmp.android.features.home.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.pokedexkmp.android.core.presentation.Loading
import com.example.pokedexkmp.android.features.home.presentation.components.Default
import com.example.pokedexkmp.core.data.remote.model.ComposableState
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
        ComposableState.DEFAULT -> Default()
        ComposableState.LOADING -> Loading()
        ComposableState.ERROR -> Loading()
    }
}

@Preview
@Composable
fun HomePreview() {
    HomeScreen(viewModel = koinViewModel())
}