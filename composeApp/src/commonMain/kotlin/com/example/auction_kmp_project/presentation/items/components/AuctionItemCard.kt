package com.example.auction_kmp_project.presentation.items.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_calendar_auction_card
import auctionkmpproject.composeapp.generated.resources.ic_time_auction_card
import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.helpers.FontSizes.font20
import com.example.auction_kmp_project.presentation.explore.components.TimeCard
import com.example.auction_kmp_project.ui.theme.AuctionItemCardBackgroundColor
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.Black
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.JoinedBannerText
import com.example.auction_kmp_project.ui.theme.LiveAuctionCardBidTextColor
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource

@Composable
fun AuctionItemCard(item: AuctionItemCardModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            ,
        shape = RoundedCornerShape(10.dp),

        ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.height(200.dp).fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(item.imageUrl),
                    contentDescription = item.title,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }

            Column(
                modifier = Modifier.background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            AuctionItemCardBackgroundColor,
                            Black
                        )
                    )
                )
            ) {

                Box(modifier = Modifier.padding(16.dp).width(80.dp)) {

                    TimeCard(
                        BidStatusText,
                        bottomTextColor = PrimaryBlueColor,
                        bottomBackground = TimeBottomTextColor,
                        topTextColor = BodyColor,
                        topText = item.status,
                        bottomText = item.remainTime
                    )
                }

                Spacer(modifier = Modifier.height(30.dp))
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = item.title,
                        fontFamily = readexProFontFamily(),
                        fontSize = 16.sp,
                        color = White
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Cars",
                            fontSize = 10.sp,
                            fontFamily = readexProFontFamily(),
                            color = JoinedBannerText,
                        )
                        Text(
                            text = " • ",
                            fontSize = 10.sp,

                            fontFamily = readexProFontFamily(),
                            color = JoinedBannerText,
                            modifier = Modifier.padding(horizontal = 4.dp)
                        )
                        Text(
                            text = "Cars Mazad",
                            fontSize = 10.sp,
                            color = JoinedBannerText,
                        )
                        Text(
                            text = " • ",
                            fontFamily = readexProFontFamily(),
                            color = JoinedBannerText,
                            fontSize = 10.sp,
                            modifier = Modifier.padding(horizontal = 4.dp)
                        )
                        Text(
                            text = "Ash Sharqiyah",
                            fontSize = 10.sp,

                            fontFamily = readexProFontFamily(),
                            color = JoinedBannerText,
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Column {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(Res.drawable.ic_calendar_auction_card),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = item.date,
                                    fontSize = 10.sp,

                                    fontFamily = readexProFontFamily(),
                                    color = White
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(Res.drawable.ic_time_auction_card),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = item.startTime,
                                    fontSize = 10.sp,
                                    fontFamily = readexProFontFamily(),
                                    color = White
                                )
                            }
                        }

                        Column(
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "Minimum bid",
                                color = White,
                                fontFamily = readexProFontFamily(),
                                fontSize = 10.sp
                            )
                            Row {
                                Text(
                                    text = "SR ",
                                    fontSize = font20,
                                    fontFamily = readexProFontFamily(),
                                    color = LiveAuctionCardBidTextColor
                                )
                                Text(
                                    text = item.moneyAmount,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = font20,
                                    fontFamily = readexProFontFamily(),
                                    color = LiveAuctionCardBidTextColor
                                )
                            }

                        }
                    }
                }
            }
        }
    }
}

//@Preview
//@Composable
//fun AuctionCardPreview() {
//    AuctionItemCard(
//        title = "Electric Truck",
//        category = "Cars",
//        location = "Ash Sharqiyah",
//        date = "24 May 2025",
//        time = "01:00 PM - 02:00 PM",
//        minBid = "230,000",
//        timeRemaining = "4d 8h 49m"
//    )
//}
