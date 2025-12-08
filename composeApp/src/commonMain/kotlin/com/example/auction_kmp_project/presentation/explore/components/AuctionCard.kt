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
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size20
import com.example.auction_kmp_project.helpers.Sizes.Size6
import com.example.auction_kmp_project.helpers.Sizes.Size80
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
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
        Row(modifier = modifier.padding(Size20).fillMaxWidth()) {
            Column(modifier = Modifier.width(Size80)) {
                Box(Modifier.size(Size80)) {
                    Image(
                        painter = painterResource(Res.drawable.auction_card_image_test), // replace with your image
                        contentDescription = "Rounded Image",
                        modifier = Modifier.fillMaxSize()
                            .clip(RoundedCornerShape(Size10)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(Size6))

                TimeCard(
                    topBackground = BidStatusText,
                    topTextColor = BodyColor,
                    bottomTextColor = PrimaryBlueColor,
                    bottomBackground = TimeBottomTextColor,
                    topText = "Start in",
                    bottomText = "4d 8h 49m"
                )
            }
            Spacer(modifier = Modifier.width(Size12))
            Column(modifier = Modifier.fillMaxWidth()) {
                AuctionCardTitle(
                    modifier = Modifier.fillMaxWidth(),
                    title = "Mazad Mogan"
                )
                Spacer(modifier = Modifier.height(Size6))
                AuctionCardRowInfo(
                    img = Res.drawable.ic_home_calendar_auction_card, text = "2 Jun 2023"
                )
                Spacer(modifier = Modifier.height(Size6))
                AuctionCardRowInfo(
                    img = Res.drawable.ic_items_auction_card, text = "1 items"
                )
                Spacer(modifier = Modifier.height(Size14))
                AuctionCardMinimumBid(
                    currencySymbol = "SR",
                    moneyAmmount = "1,050,000"
                )

            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}




