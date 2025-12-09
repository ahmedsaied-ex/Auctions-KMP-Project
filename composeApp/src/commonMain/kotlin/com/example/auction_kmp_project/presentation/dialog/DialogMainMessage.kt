package com.example.auction_kmp_project.presentation.dialog

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun DialogMainMessage(body: String) {
    Text(
        body,
        textAlign = TextAlign.Center,
        style = TextStyle(
            color = BodyColor,
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.Normal,
            fontSize = font13
        )
    )
}
