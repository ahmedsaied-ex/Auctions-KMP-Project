package com.example.auction_kmp_project.presentation.explore

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.joined_auctions
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun JoinedAuctionBanner() {
    Card(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 30.dp).fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),            // Rounded corners
        colors = CardDefaults.cardColors(
            containerColor = PrimaryBlueColor      // Background color
        )
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier.align(Alignment.CenterEnd),
                painter = painterResource(Res.drawable.joined_auctions),
                contentDescription = "joined auctions"
            )
            JoinedAuctionBannerDataColumn(
                joinedAuctionsTitle = "Joined Auctions",
                joinedAuctionsNumber = "5",
                buttonText = "VIEW",
            ) {}
        }


    }
}




