package com.example.auction_kmp_project.presentation.dialog

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun DialogCancelButton(onClick: () -> Unit) {
    Text(
        "CANCEL",
        modifier = Modifier.clickable { onClick()},
        style = TextStyle(
            color = PrimaryBlueColor,
            fontWeight = FontWeight.SemiBold,
            fontSize = font13,
            fontFamily = readexProFontFamily()
        )
    )
}
