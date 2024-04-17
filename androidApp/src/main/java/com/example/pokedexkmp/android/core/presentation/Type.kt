package com.example.pokedexkmp.android.core.presentation

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pokedexkmp.android.R


val pokemonFont = FontFamily(
    Font(R.font.pokemon_font)
)

val customTypography = Typography(
    bodyMedium = TextStyle(
        fontFamily = pokemonFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)
