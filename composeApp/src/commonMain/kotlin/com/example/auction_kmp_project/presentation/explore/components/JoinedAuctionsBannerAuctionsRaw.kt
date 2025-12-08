package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.example.auction_kmp_project.ui.theme.readexProFontFamily


@Composable
fun JoinedAuctionsBannerAuctionsRaw(
    numberOfAuctions: String,
){

    Row {
        Text(
            numberOfAuctions, style = TextStyle(
                color = Color(0xffD6D2E3),
                fontFamily = readexProFontFamily(),
            )
        )
        Text(
            " auctions", style = TextStyle(
                color = Color(0xffD6D2E3),
                fontFamily = readexProFontFamily(),
            )
        )
    }
}