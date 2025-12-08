package com.example.auction_kmp_project.presentation.explore

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.auction_card_image_test
import auctionkmpproject.composeapp.generated.resources.ic_home_calendar_auction_card
import auctionkmpproject.composeapp.generated.resources.ic_items_auction_card
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun AuctionCard(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(0.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row(modifier = modifier.padding(20.dp).fillMaxWidth()) {
            Column(modifier = Modifier.width(80.dp)) {
                Box(Modifier.size(80.dp)) {
                    Image(
                        painter = painterResource(Res.drawable.auction_card_image_test), // replace with your image
                        contentDescription = "Rounded Image",
                        modifier = Modifier.fillMaxSize()
                            .clip(RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                TimeCard(
                    topBackground =Color(0xffE0DDEA) ,
                    topTextColor = BodyColor,
                    bottomTextColor = PrimaryBlueColor,
                    bottomBackground = Color(0xffEBE9F1),
                    topText = "Start in",
                    bottomText = "4d 8h 49m"
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                AuctionCardTitle(
                    modifier = Modifier.fillMaxWidth(),
                    title = "Mazad Mogan"
                )
                Spacer(modifier = Modifier.height(6.dp))
                AuctionCardRowInfo(
                    img = Res.drawable.ic_home_calendar_auction_card, text = "2 Jun 2023"
                )
                Spacer(modifier = Modifier.height(6.dp))
                AuctionCardRowInfo(
                    img = Res.drawable.ic_items_auction_card, text = "1 items"
                )
                Spacer(modifier = Modifier.height(14.dp))
                AuctionCardMinimumBid(
                    currencySymbol = "SR",
                    moneyAmmount = "1,050,000"
                )

            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}




