package com.example.auction_kmp_project.presentation.explore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        modifier = Modifier.wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.height(12.dp)
                .background(
                    topBackground,
                    shape = RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp)
                ).padding(horizontal = 26.dp, vertical = 1.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = topText,
                color = topTextColor,
                fontSize = 8.sp,
                lineHeight = 8.sp,
                fontWeight = FontWeight.Light,
                fontFamily = readexProFontFamily(),
            )
        }

        Row(
            modifier = Modifier.height(18.dp)
                .background(
                    color = bottomBackground,
                    shape = RoundedCornerShape(bottomStart = 6.dp, bottomEnd = 6.dp)
                ).padding(horizontal = 21.dp, vertical = 2.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = bottomText,
                color = bottomTextColor,
                fontSize = 10.sp,
                lineHeight = 10.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = readexProFontFamily(),
            )
        }
    }
}