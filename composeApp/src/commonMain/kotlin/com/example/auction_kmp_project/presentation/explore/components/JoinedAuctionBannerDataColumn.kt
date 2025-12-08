package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size15
import com.example.auction_kmp_project.helpers.Sizes.Size20

@Composable
fun JoinedAuctionBannerDataColumn(
    modifier: Modifier = Modifier,
    joinedAuctionsTitle: String,
    joinedAuctionsNumber:String,
    buttonText:String,
    onClick: () -> Unit
){
    Column(modifier = Modifier.padding(Size20)) {
        JoinedAuctionsBannerTitle(titleText = joinedAuctionsTitle)
        Spacer(Modifier.height(Size10))
        JoinedAuctionsBannerAuctionsRaw(numberOfAuctions = joinedAuctionsNumber)
        Spacer(Modifier.height(Size15))
        JoinedAuctionsBannerButton(
            buttonText = buttonText
        ){
            onClick()
        }
    }

}