package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.auction_kmp_project.helpers.FontSizes.font10
import com.example.auction_kmp_project.helpers.FontSizes.font8
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size18
import com.example.auction_kmp_project.helpers.Sizes.Size6
import com.example.auction_kmp_project.ui.theme.readexProFontFamily


@Composable
fun TimeCard(
    topBackground: Color,
    topTextColor: Color,
    bottomTextColor: Color,
    bottomBackground: Color,
    topText: String,
    bottomText: String
) {
    Column(
        modifier = Modifier.wrapContentHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth().height(Size12)
                .background(
                    topBackground,
                    shape = RoundedCornerShape(topStart = Size6, topEnd = Size6)
                ),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = topText ,
                color = topTextColor,
                fontSize = font8,
                lineHeight = font8,
                fontWeight = FontWeight.Light,
                fontFamily = readexProFontFamily(),
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth().height(Size18)
                .background(
                    color = bottomBackground,
                    shape = RoundedCornerShape(bottomStart = Size6, bottomEnd = Size6)
                ),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = bottomText,
                color = bottomTextColor,
                fontSize = font10,
                lineHeight = font10,

                fontWeight = FontWeight.SemiBold,
                fontFamily = readexProFontFamily(),
            )
        }
    }
}