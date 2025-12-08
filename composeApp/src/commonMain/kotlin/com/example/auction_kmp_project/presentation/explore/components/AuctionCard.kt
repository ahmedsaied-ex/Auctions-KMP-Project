package com.example.auction_kmp_project.presentation.explore.components

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
import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.models.Staus
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun AuctionCard(
    modifier: Modifier = Modifier,
    item: AuctionCardModel
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
                        painter = painterResource(item.imageUrl), // replace with your image
                        contentDescription = "Rounded Image",
                        modifier = Modifier.fillMaxSize()
                            .clip(RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                AuctionTimeBanner(item = item)
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                AuctionCardTitle(
                    modifier = Modifier.fillMaxWidth(),
                    title = item.title
                )
                Spacer(modifier = Modifier.height(6.dp))
                AuctionCardRowInfo(
                    img = Res.drawable.ic_home_calendar_auction_card, text = item.date
                )
                Spacer(modifier = Modifier.height(6.dp))
                AuctionCardRowInfo(
                    img = Res.drawable.ic_items_auction_card, text = "${item.itemCount} items"
                )
                Spacer(modifier = Modifier.height(14.dp))
                AuctionCardMinimumBid(
                    currencySymbol = item.currencySymbol,
                    moneyAmmount = item.moneyAmount
                )

            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun AuctionTimeBanner(item: AuctionCardModel){
    when(item.status){
        Staus.ONGOING -> {
            TimeCard(
                topBackground = Color(0xffE0DDEA),
                topTextColor = BodyColor,
                bottomTextColor = PrimaryBlueColor,
                bottomBackground = Color(0xffEBE9F1),
                topText = "ends in",
                bottomText = item.auctionTime
            )
        }
        Staus.UPCOMING -> {
            TimeCard(
                topBackground = Color(0xffE0DDEA),
                topTextColor = BodyColor,
                bottomTextColor = PrimaryBlueColor,
                bottomBackground = Color(0xffEBE9F1),
                topText = "Start in",
                bottomText = item.auctionTime
            )
        }
        Staus.COMPLETED -> {}
    }

}


