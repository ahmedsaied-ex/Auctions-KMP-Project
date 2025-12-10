package com.example.auction_kmp_project.presentation.explore.components

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
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.currency_symbol
import auctionkmpproject.composeapp.generated.resources.current_bid
import auctionkmpproject.composeapp.generated.resources.liveBidding
import auctionkmpproject.composeapp.generated.resources.live_auction_card_title
import auctionkmpproject.composeapp.generated.resources.your_bid
import com.example.auction_kmp_project.helpers.FontSizes.font10
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.helpers.FontSizes.font20
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size19
import com.example.auction_kmp_project.helpers.Sizes.Size2
import com.example.auction_kmp_project.helpers.Sizes.Size20
import com.example.auction_kmp_project.helpers.Sizes.Size6
import com.example.auction_kmp_project.helpers.Sizes.Size76
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.DeletedColor
import com.example.auction_kmp_project.ui.theme.LiveAuctionCardBidTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.stringResource

@Composable
fun BidPart() {
    Column(
        modifier = Modifier.padding(horizontal = Size8),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.width(Size76).height(Size19)
                .background(DeletedColor, shape = RoundedCornerShape(Size20)),
            contentAlignment = Alignment.Center


        ) {
            Text(
                text = stringResource(Res.string.liveBidding),
                color = Color.White,
                fontSize = font10,
                lineHeight = font10,

                fontFamily = readexProFontFamily(),
            )
        }


        Spacer(modifier = Modifier.height(Size6))

        Text(
            text = stringResource(Res.string.live_auction_card_title),
            lineHeight = font16,
            color = Color.White,
            fontSize = font16,
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(Size6))

        Row {
            Text(
                text = stringResource(Res.string.your_bid),
                fontWeight = FontWeight.Light,

                color = BidStatusText,
                fontSize = font10, lineHeight =font10,
                fontFamily = readexProFontFamily(),

                )
            Text(
                text = "SR 230,000",
                color = Color.White,
                fontSize = font10, lineHeight =font10,
                fontWeight = FontWeight.Normal,
                fontFamily = readexProFontFamily(),

                )
        }


        Spacer(modifier = Modifier.height(Size12))

        Text(
            text = stringResource(Res.string.current_bid),
            color = BidStatusText,
            fontSize = font10,
            lineHeight = font10,
            fontWeight = FontWeight.Light,

            fontFamily = readexProFontFamily(),

            )
        Spacer(modifier = Modifier.height(Size2))

        Row {
            Text(
                text = stringResource(Res.string.currency_symbol),
                color = Color(0xFFF6BC9F),
                fontSize = font20,
                lineHeight = font20,

                fontWeight = FontWeight.Light
            )
            Text(
                text = "230,100",
                color = LiveAuctionCardBidTextColor,
                fontSize = font20,
                lineHeight = font20,

                fontWeight = FontWeight.Bold,
                fontFamily = readexProFontFamily(),

                )
        }


    }
}

