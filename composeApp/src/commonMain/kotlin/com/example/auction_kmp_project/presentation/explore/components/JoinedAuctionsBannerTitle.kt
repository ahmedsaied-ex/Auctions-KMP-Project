package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun JoinedAuctionsBannerTitle(titleText:String){
    Text(titleText, style = TextStyle(
        color = Color.White,
        fontFamily = readexProFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    ))
}
