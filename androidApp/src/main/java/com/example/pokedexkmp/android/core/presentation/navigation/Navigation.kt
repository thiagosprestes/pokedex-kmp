package com.example.pokedexkmp.android.core.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pokedexkmp.android.features.home.presentation.HomeScreen
import com.example.pokedexkmp.android.features.home.presentation.HomeViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.HomeScreen.routeName) {
        composable(Route.HomeScreen.routeName) {
            val viewModel: HomeViewModel = koinViewModel()
            HomeScreen(viewModel)
        }
    }
}