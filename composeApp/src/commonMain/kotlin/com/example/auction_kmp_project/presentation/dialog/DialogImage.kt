package com.example.auction_kmp_project.presentation.dialog

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_empty_wallet
import org.jetbrains.compose.resources.painterResource

@Composable
fun DialogImage(){
    Image(
        painter = painterResource(Res.drawable.ic_empty_wallet),
        contentDescription = "Empty Wallet"
    )
}