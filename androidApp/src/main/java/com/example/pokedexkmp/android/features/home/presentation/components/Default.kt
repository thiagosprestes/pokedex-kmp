package com.example.pokedexkmp.android.features.home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.pokedexkmp.android.core.presentation.PrimaryBlack
import com.example.pokedexkmp.android.core.presentation.PrimaryRed
import com.example.pokedexkmp.android.core.presentation.PrimaryWhite
import com.example.pokedexkmp.android.core.presentation.pokemonFont
import com.example.pokedexkmp.core.data.remote.model.PokemonResponseItem

@Composable
fun Default(
    pokemons: List<PokemonResponseItem>
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(PrimaryRed)
                .padding(vertical = 26.dp)
        ) {
            Text(
                text = "Pokedex",
                fontFamily = pokemonFont,
                color = PrimaryWhite,
                fontSize = 14.sp
            )
        }
        Row(
            Modifier
                .fillMaxSize()
                .background(PrimaryBlack)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(140.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                contentPadding = PaddingValues(
                    horizontal = 20.dp,
                    vertical = 25.dp
                )
            ) {
                items(pokemons) {
                    Row(
                        Modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color.White)
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxHeight()
                        ) {
                            AsyncImage(
                                model = "https://img.pokemondb.net/sprites/black-white/normal/${it.name}.png",
                                contentDescription = null,
                                modifier = Modifier.size(100.dp),
                                onSuccess = {
                                    it.result.drawable.colorFilter
                                }
                            )
                            Text(
                                text = it.name,
                                fontFamily = pokemonFont,
                                color = PrimaryBlack,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    Default(
        listOf(
            PokemonResponseItem(
                "abc", url = ""
            ),
            PokemonResponseItem(
                "abc", url = ""
            )
        )
    )
}