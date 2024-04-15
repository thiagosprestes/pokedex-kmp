package com.example.pokedexkmp.android.features.home.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen() {
     val viewModel: HomeViewModel = koinViewModel()

    LaunchedEffect(key1 = true) {
        viewModel.getPokemons()
    }

    Text(text = "Hello world!!")
}