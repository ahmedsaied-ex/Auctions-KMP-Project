package com.example.auction_kmp_project.presentation.profile.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun ProfileName(name: String) {
    Text(
        name, style = TextStyle(
            fontSize = font16,
            fontWeight = FontWeight.SemiBold,
            color = PrimaryBlueColor,
            fontFamily = readexProFontFamily()
        )
    )
}