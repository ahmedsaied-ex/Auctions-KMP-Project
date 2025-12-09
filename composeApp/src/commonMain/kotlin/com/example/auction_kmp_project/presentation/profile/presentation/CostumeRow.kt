package com.example.auction_kmp_project.presentation.profile.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_arrow
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.ui.theme.TimeCardTopBackgroundColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource


@Composable
fun CostumeRow(onClick: () -> Unit = {}) {
    Row(modifier = Modifier.clickable { onClick() }) {
        Text(
            "English", style = TextStyle(
                color = TimeCardTopBackgroundColor,
                fontSize = font16,
                fontFamily = readexProFontFamily()
            )
        )
        Spacer(modifier = Modifier.width(Size14))
        Image(
            painterResource(Res.drawable.ic_arrow),
            contentDescription = "",
        )
    }
}






