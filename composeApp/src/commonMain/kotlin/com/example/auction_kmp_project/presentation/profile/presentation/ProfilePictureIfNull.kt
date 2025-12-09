package com.example.auction_kmp_project.presentation.profile.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.auction_kmp_project.helpers.FontSizes.font20
import com.example.auction_kmp_project.helpers.Sizes.Size1_5
import com.example.auction_kmp_project.helpers.Sizes.Size60
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.JoinedBannerText
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun ProfilePictureIfNull(firstCharsOfName: String) {
    Box(
        contentAlignment = Alignment.Center, modifier = Modifier.size(Size60) // circle size
            .background(color = BidStatusText, shape = CircleShape) // background color
            .border(width = Size1_5, color = JoinedBannerText, shape = CircleShape)
    ) {
        Text(
            text = firstCharsOfName, style = TextStyle(
                fontSize = font20,
                fontFamily = readexProFontFamily(),
                fontWeight = FontWeight.SemiBold,
                color = PrimaryBlueColor
            )
        )
    }
}
