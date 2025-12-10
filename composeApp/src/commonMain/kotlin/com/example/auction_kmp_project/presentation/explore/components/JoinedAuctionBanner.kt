package com.example.auction_kmp_project.presentation.explore.components

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
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.joined_auctions
import auctionkmpproject.composeapp.generated.resources.view
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size30
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun JoinedAuctionBanner(onClick:()-> Unit) {
    Card(
        modifier = Modifier.padding(horizontal = Size16, vertical = Size30).fillMaxWidth(),
        shape = RoundedCornerShape(Size16),            // Rounded corners
        colors = CardDefaults.cardColors(
            containerColor = PrimaryBlueColor      // Background color
        ),
        elevation = CardDefaults.cardElevation(Size8
        )
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier.align(Alignment.CenterEnd),
                painter = painterResource(Res.drawable.joined_auctions),
                contentDescription = "joined auctions"
            )
            JoinedAuctionBannerDataColumn(
                joinedAuctionsTitle = stringResource(Res.string.joined_auctions),
                joinedAuctionsNumber = "5",
                buttonText = stringResource(Res.string.view),
            ) {onClick()}
        }


    }
}




