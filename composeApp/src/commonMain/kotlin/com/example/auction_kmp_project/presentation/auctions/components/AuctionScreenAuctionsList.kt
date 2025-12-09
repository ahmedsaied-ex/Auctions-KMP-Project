package com.example.auction_kmp_project.presentation.auctions.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size6
import com.example.auction_kmp_project.presentation.explore.components.AuctionCard
import com.example.auction_kmp_project.ui.theme.MainBackgroundColor

@Composable
 fun AuctionScreenAuctionsList(auctions: List<AuctionCardModel>) {
    LazyColumn(modifier = Modifier.background(MainBackgroundColor)) {
        items(auctions) { item ->
            Box(modifier = Modifier.padding(horizontal = Size16, vertical = Size6)) {
                AuctionCard(item = item)
            }
        }
    }
}