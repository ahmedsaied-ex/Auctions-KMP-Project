package com.example.auction_kmp_project.presentation.explore

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
import androidx.compose.ui.unit.dp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.car
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
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        shape = RoundedCornerShape(10.dp)

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
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.width(80.dp)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth().height(80.dp)
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.car),
                            contentDescription = "car",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(10.dp))

                        )

                    }

                    Spacer(modifier = Modifier.height(6.dp))


                    TimeCard(
                        topBackground = TimeCardTopBackgroundColor,
                        topTextColor = TimeTopTextColor,
                        bottomTextColor =TimeBottomTextColor,
                        bottomBackground = TimeCardbottomBackgroundColor,
                        topText = "Ends in",
                        bottomText ="49m 33s"
                    )

                }
                BidPart()


            }
        }
    }
}
