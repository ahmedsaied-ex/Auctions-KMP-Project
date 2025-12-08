package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.auction_kmp_project.helpers.FontSizes.font14
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun JoinedAuctionsBannerButton(buttonText:String,onClick : ()-> Unit){
    Button(
        onClick = {onClick()},
        modifier = Modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,   // Background color
            contentColor = PrimaryBlueColor         // Text/Icon color
        ),
        content = { Text(buttonText , style = TextStyle(
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.SemiBold,
            fontSize = font14,
        )) },
    )
}
