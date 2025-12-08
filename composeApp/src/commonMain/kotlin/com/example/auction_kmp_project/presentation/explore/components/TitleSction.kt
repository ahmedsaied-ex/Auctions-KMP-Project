package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.PrimaryOrangeColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun TitleSection(title: String ) {
    Row(
        Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            title,
            color = PrimaryBlueColor,
            fontSize = 16.sp,
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.Medium
        )

        Text(
            "View All",
            color = PrimaryOrangeColor,
            fontSize = 13.sp,
            fontFamily = readexProFontFamily()
        )
    }
}
