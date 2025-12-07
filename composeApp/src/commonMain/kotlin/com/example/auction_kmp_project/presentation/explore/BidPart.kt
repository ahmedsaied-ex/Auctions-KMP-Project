package com.example.auction_kmp_project.presentation.explore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.DeletedColor
import com.example.auction_kmp_project.ui.theme.LiveAuctionCardBidTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily

@Composable
fun BidPart() {
    Column(
        modifier = Modifier.padding(horizontal = 8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.width(76.dp).height(19.dp)
                .background(DeletedColor, shape = RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.Center


        ) {
            Text(
                text = "Live bidding",
                color = Color.White,
                fontSize = 10.sp,
                lineHeight = 10.sp,

                fontFamily = readexProFontFamily(),
            )
        }


        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "2021 Ford F-150",
            lineHeight = 16.sp,
            color = Color.White,
            fontSize = 16.sp,
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(6.dp))

        Row {
            Text(
                text = "Your bid: ",
                fontWeight = FontWeight.Light,

                color = BidStatusText,
                fontSize = 10.sp, lineHeight = 10.sp,
                fontFamily = readexProFontFamily(),

                )
            Text(
                text = "SR 230,000",
                color = Color.White,
                fontSize = 10.sp, lineHeight = 10.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = readexProFontFamily(),

                )
        }


        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Current bid",
            color = BidStatusText,
            fontSize = 10.sp,
            lineHeight = 10.sp,
            fontWeight = FontWeight.Light,

            fontFamily = readexProFontFamily(),

            )
        Spacer(modifier = Modifier.height(2.dp))

        Row {
            Text(
                text = "SR ",
                color = Color(0xFFF6BC9F),
                fontSize = 20.sp,
                lineHeight = 20.sp,

                fontWeight = FontWeight.Light
            )
            Text(
                text = "230,100",
                color = LiveAuctionCardBidTextColor,
                fontSize = 20.sp,
                lineHeight = 20.sp,

                fontWeight = FontWeight.Bold,
                fontFamily = readexProFontFamily(),

                )
        }


    }
}

