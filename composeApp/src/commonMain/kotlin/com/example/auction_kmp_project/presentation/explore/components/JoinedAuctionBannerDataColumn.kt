package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun JoinedAuctionBannerDataColumn(
    modifier: Modifier = Modifier,
    joinedAuctionsTitle: String,
    joinedAuctionsNumber:String,
    buttonText:String,
    onClick: () -> Unit
){
    Column(modifier = Modifier.padding(20.dp)) {
        JoinedAuctionsBannerTitle(titleText = joinedAuctionsTitle)
        Spacer(Modifier.height(10.dp))
        JoinedAuctionsBannerAuctionsRaw(numberOfAuctions = joinedAuctionsNumber)
        Spacer(Modifier.height(15.dp))
        JoinedAuctionsBannerButton(
            buttonText = buttonText
        ){
            onClick()
        }
    }

}