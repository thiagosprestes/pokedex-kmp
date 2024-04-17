package com.example.pokedexkmp.android.core.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedexkmp.android.core.presentation.PrimaryBlack
import com.example.pokedexkmp.android.core.presentation.PrimaryRed
import com.example.pokedexkmp.android.core.presentation.PrimaryWhite
import com.example.pokedexkmp.android.core.presentation.pokemonFont

@Composable
fun Error(onRetry: () -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .background(PrimaryBlack)
            .padding(20.dp)

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Text(
                text = "Ocorreu um erro ao obter a lista de pokemóns, tente novamente",
                fontFamily = pokemonFont,
                color = PrimaryWhite,
                textAlign = TextAlign.Center
            )

        }
        Button(
            onClick = { onRetry() },
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryRed),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                "Tentar novamente",
                fontFamily = pokemonFont,
                color = PrimaryWhite,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun ErrorPreview() {
    Error(onRetry = {})
}
