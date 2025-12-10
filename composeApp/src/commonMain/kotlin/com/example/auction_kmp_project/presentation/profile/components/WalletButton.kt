package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.ui.theme.WalletCardButtonBackgroundColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily


@Composable
fun WalletButton(onClick:()-> Unit) {
    Button(
        onClick = {onClick()},
        modifier = Modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = WalletCardButtonBackgroundColor,
            contentColor = White
        ),
        content = {
            Text(
                "VIEW WALLET", style = TextStyle(
                    fontFamily = readexProFontFamily(),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = font13,
                )
            )
        },
    )
}
