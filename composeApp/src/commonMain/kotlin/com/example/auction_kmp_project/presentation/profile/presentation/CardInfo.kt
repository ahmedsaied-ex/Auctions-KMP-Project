package com.example.auction_kmp_project.presentation.profile.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.FontSizes.font25
import com.example.auction_kmp_project.ui.theme.WalletCardTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily


@Composable
fun CardInfo() {
    Row {
        Text(
            "SR", style = TextStyle(
                fontSize = font25,
                fontWeight = FontWeight.Light,
                color = White,
                fontFamily = readexProFontFamily()
            )
        )
        Text(
            " 500", style = TextStyle(
                fontSize = font25,
                fontWeight = FontWeight.Bold,
                color = White,
                fontFamily = readexProFontFamily()
            )
        )
    }
    Text(
        "Current wallet balance", style = TextStyle(
            fontSize = font13,
            color = WalletCardTextColor,
            fontFamily = readexProFontFamily()
        )
    )
}