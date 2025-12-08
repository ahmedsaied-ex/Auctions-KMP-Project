package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size8
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun AuctionsList(auctions: List<AuctionCardModel>) {
    LazyRow(
        Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = Size16),
        horizontalArrangement = Arrangement.spacedBy(Size8)
    ) {
        items(auctions){ item->
            AuctionCard(modifier = Modifier.fillParentMaxWidth(),item)
        }
    }
}