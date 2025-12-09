package com.example.auction_kmp_project.presentation.dialog

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.auction_kmp_project.helpers.FontSizes.font20
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun DialogTitle(title: String) {
    Text(
        title,

        style = TextStyle(
            color = PrimaryBlueColor,
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.SemiBold,
            fontSize = font20
        )
    )
}