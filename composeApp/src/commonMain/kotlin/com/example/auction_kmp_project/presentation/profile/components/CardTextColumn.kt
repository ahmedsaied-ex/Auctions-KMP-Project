package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.TimeCardTopBackgroundColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun CardTextColumn(
    textColor: Color = BodyColor,
    description: String? = null,
    title: String = "Account info",
) {
    Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
        Text(
            title, style = TextStyle(
                color = textColor, fontSize = font16, fontFamily = readexProFontFamily()
            )
        )
        description?.let {
            Text(
                it, modifier = Modifier.width(200.dp), style = TextStyle(
                    color = TimeCardTopBackgroundColor,
                    fontSize = font13,
                    fontFamily = readexProFontFamily()
                )
            )
        }

    }
}
