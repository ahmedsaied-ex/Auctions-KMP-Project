package com.example.auction_kmp_project.presentation.items.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.car1
import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size220
import com.example.auction_kmp_project.helpers.Sizes.Size80
import com.example.auction_kmp_project.presentation.explore.components.TimeCard
import com.example.auction_kmp_project.ui.theme.AuctionItemCardBackgroundColor
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.Black
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun AuctionItemCard(item: AuctionItemCardModel) {
    Card(
        modifier = Modifier.fillMaxWidth().height(Size220),
        shape = RoundedCornerShape(Size10),

        ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(item.imageUrl),
                    contentDescription = item.title,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }

            Column(
                modifier = Modifier.fillMaxHeight().background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            AuctionItemCardBackgroundColor,
                            Black
                        )
                    )
                )
            ) {

                Box(modifier = Modifier.padding(Size16).width(Size80)) {

                    TimeCard(
                        BidStatusText,
                        topTextColor = BodyColor,
                        bottomTextColor = PrimaryBlueColor,
                        bottomBackground = TimeBottomTextColor,
                        topText = item.status,
                        bottomText = item.remainTime
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                AuctionItemCardDetails(item)
            }
        }
    }
}

@Preview
@Composable
fun AuctionCardPreview() {
    val item = AuctionItemCardModel(
        title = "Electric Truck",
        date = "24 May 2023",
        imageUrl = Res.drawable.car1,
        moneyAmount = "500,000",
        remainTime = "4d 8h 49m",
        status = "Starts in",
        startTime = "12:00 PM - 01:00 Pm",
    )
    AuctionItemCard(
        item
    )
}

