package com.example.auction_kmp_project.presentation.items.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ash_sharqiyah
import auctionkmpproject.composeapp.generated.resources.cars
import auctionkmpproject.composeapp.generated.resources.currency_symbol
import auctionkmpproject.composeapp.generated.resources.ic_calendar_auction_card
import auctionkmpproject.composeapp.generated.resources.ic_time_auction_card
import auctionkmpproject.composeapp.generated.resources.mazad
import auctionkmpproject.composeapp.generated.resources.minimumBid
import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.helpers.FontSizes.font10
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.helpers.FontSizes.font20
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size4
import com.example.auction_kmp_project.helpers.Sizes.Size5
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.helpers.Sizes.Size9
import com.example.auction_kmp_project.ui.theme.JoinedBannerText
import com.example.auction_kmp_project.ui.theme.LiveAuctionCardBidTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun AuctionItemCardDetails(item: AuctionItemCardModel) {
    Column(
        modifier = Modifier.padding(Size16).fillMaxWidth().background(
            color = Transparent,
            shape = RoundedCornerShape(Size10),
        )
    ) {
        Text(
            text = item.title,
            fontFamily = readexProFontFamily(),
            fontSize = font16,
            color = White
        )

        Spacer(modifier = Modifier.height(Size4))

        Row {
            Text(
                text = stringResource(Res.string.cars),
                fontSize = font10,
                lineHeight = font10,
                fontFamily = readexProFontFamily(),
                color = JoinedBannerText,
            )
            Text(
                text = " • ",
                fontSize = font10,
                lineHeight = font10,

                fontFamily = readexProFontFamily(),
                color = JoinedBannerText,
                modifier = Modifier.padding(horizontal = Size4)
            )
            Text(
                text = stringResource(Res.string.mazad),
                fontSize = font10,
                lineHeight = font10,

                color = JoinedBannerText,
            )
            Text(
                text = " • ",
                fontFamily = readexProFontFamily(),
                color = JoinedBannerText,
                fontSize = font10,
                lineHeight = font10,

                modifier = Modifier.padding(horizontal = Size4)
            )
            Text(
                text = stringResource(Res.string.ash_sharqiyah),
                fontSize = font10,
                lineHeight = font10,

                fontFamily = readexProFontFamily(),
                color = JoinedBannerText,
            )
        }

        Spacer(modifier = Modifier.height(Size8))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            Column {
                Row {
                    Image(
                        painter = painterResource(Res.drawable.ic_calendar_auction_card),
                        contentDescription = null,
                        modifier = Modifier.size(Size10)
                    )
                    Spacer(modifier = Modifier.width(Size4))
                    Text(
                        text = item.date,
                        lineHeight = font10,

                        fontSize = font10,
                        fontFamily = readexProFontFamily(),
                        color = White
                    )
                }

                Spacer(modifier = Modifier.height(Size5))


                Row {
                    Image(
                        painter = painterResource(Res.drawable.ic_time_auction_card),
                        contentDescription = null,
                        modifier = Modifier.size(Size9)
                    )
                    Spacer(modifier = Modifier.width(Size4))
                    Text(
                        text = item.startTime,
                        fontSize = font10,
                        lineHeight = font10,

                        fontFamily = readexProFontFamily(),
                        color = White
                    )
                }
            }

            Column {
                Text(
                    text = stringResource(Res.string.minimumBid),
                    lineHeight = font10,
                    color = White,
                    fontFamily = readexProFontFamily(),
                    fontSize = font10
                )
                Row {
                    Text(
                        text = stringResource(Res.string.currency_symbol),
                        fontSize = font20,
                        fontFamily = readexProFontFamily(),
                        color = LiveAuctionCardBidTextColor
                    )
                    Text(
                        text = item.moneyAmount,
                        fontWeight = FontWeight.Bold,
                        fontSize = font20,
                        lineHeight = font20,
                        fontFamily = readexProFontFamily(),
                        color = LiveAuctionCardBidTextColor
                    )
                }

            }
        }
    }

}
