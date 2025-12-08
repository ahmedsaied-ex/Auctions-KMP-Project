package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.car
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size20
import com.example.auction_kmp_project.helpers.Sizes.Size5
import com.example.auction_kmp_project.helpers.Sizes.Size80
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
import com.example.auction_kmp_project.ui.theme.TimeCardTopBackgroundColor
import com.example.auction_kmp_project.ui.theme.TimeCardbottomBackgroundColor
import com.example.auction_kmp_project.ui.theme.TimeTopTextColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun LiveAuctionCard(modifier: Modifier) {
    val gradientColors = listOf(
        BodyColor,
        PrimaryBlueColor,
        BodyColor
    )
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = Size5),
        shape = RoundedCornerShape(Size10)

    ) {
        Box(
            modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        colors = gradientColors
                    )
                )
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Size20),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.width(Size80)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth().height(Size80)
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.car),
                            contentDescription = "car",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(Size10))

                        )

                    }

                    Spacer(modifier = Modifier.height(Size12))


                    TimeCard(
                        topBackground = TimeCardTopBackgroundColor,
                        topTextColor = TimeTopTextColor,
                        bottomTextColor = TimeBottomTextColor,
                        bottomBackground = TimeCardbottomBackgroundColor,
                        topText = "Ends in",
                        bottomText = "49m 33s"
                    )

                }
                BidPart()


            }
        }
    }
}
