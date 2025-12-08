package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size20
import com.example.auction_kmp_project.helpers.Sizes.Size40


@Composable
fun ExploreScreen(navController: NavController) {
    LazyColumn (
        modifier = Modifier.fillMaxSize(),
    ) {
        item { ExploreAppBar() }
        item { LiveAuctionCardList() }
        item { Spacer(modifier = Modifier.height(Size40)) }
        item { TitleSection("Categories") }
        item { Spacer(modifier = Modifier.height(Size12)) }
        item{ CategoryCardsList() }
        item { Spacer(modifier = Modifier.height(Size40)) }
        item { TitleSection("Upcoming Auctions") }
        item { Spacer(modifier = Modifier.height(Size14)) }
        item { UpcomingAuctionBanner() }
        item { Spacer(modifier = Modifier.height(Size20)) }



    }
}