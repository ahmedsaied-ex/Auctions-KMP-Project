package com.example.auction_kmp_project.presentation.items.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size16

@Composable
fun AuctionItemCardList(items:List<AuctionItemCardModel>) {
    LazyColumn  (
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal =  Size16, vertical = Size12),
        verticalArrangement = Arrangement.spacedBy(Size12)
    ) {
        items(items) { item ->
            AuctionItemCard(item)
        }

}}