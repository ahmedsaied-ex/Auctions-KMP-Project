package com.example.auction_kmp_project.presentation.explore

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily


@Composable
fun AuctionCardTitle(title: String) {
    Text(
        title, style = TextStyle(
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = PrimaryBlueColor
        )
    )
}