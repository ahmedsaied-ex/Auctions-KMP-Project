package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.wallet_image
import com.example.auction_kmp_project.helpers.Sizes.Size130
import com.example.auction_kmp_project.helpers.Sizes.Size140
import com.example.auction_kmp_project.helpers.Sizes.Size150
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size5
import com.example.auction_kmp_project.ui.theme.PrimaryOrangeColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun WalletCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(start = Size16, end = Size16,top = Size150).fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = PrimaryOrangeColor),
        elevation = CardDefaults.cardElevation(defaultElevation = Size5)
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier.height(Size140).width(Size130).align(Alignment.CenterEnd),
                painter = painterResource(Res.drawable.wallet_image),
                contentDescription = "wallet image"
            )
            WalletLeftPart()
        }

    }
}