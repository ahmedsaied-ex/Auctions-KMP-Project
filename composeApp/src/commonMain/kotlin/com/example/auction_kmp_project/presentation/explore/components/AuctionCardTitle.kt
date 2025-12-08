package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily


@Composable
fun AuctionCardTitle(title: String,modifier: Modifier) {
    Text(
        title, style = TextStyle(
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.Medium,
            fontSize = font16,
            color = PrimaryBlueColor,

        ), modifier = Modifier.fillMaxWidth()
    )
}