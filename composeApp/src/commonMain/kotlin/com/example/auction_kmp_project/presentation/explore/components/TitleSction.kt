package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.PrimaryOrangeColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun TitleSection(title: String ,onClick:()->Unit={} ) {
    Row(
        Modifier.fillMaxWidth().padding(horizontal = Size16),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            title,
            color = PrimaryBlueColor,
            fontSize = font16,
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.Medium
        )

        Text(
            "View All",
            color = PrimaryOrangeColor,
            fontSize = font13,
            fontFamily = readexProFontFamily(),
            modifier = Modifier.clickable{
                onClick()
            }
        )
    }
}
