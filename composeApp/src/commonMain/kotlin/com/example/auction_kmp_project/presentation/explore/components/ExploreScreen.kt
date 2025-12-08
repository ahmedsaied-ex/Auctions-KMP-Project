package com.example.auction_kmp_project.presentation.explore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.auction_kmp_project.ui.theme.MainBackgroundColor


@Composable
fun ExploreScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier.background(MainBackgroundColor).fillMaxSize(),
    ) {
        item { ExploreAppBar() }
        item { LiveAuctionCardList() }
        item { Spacer(modifier = Modifier.height(20.dp)) }
        item { TitleSection("Categories") }
        item { Spacer(modifier = Modifier.height(20.dp)) }
        item { TitleSection("Upcoming Explore") }
        item { Spacer(modifier = Modifier.height(14.dp)) }
        item { UpcomingAuctionBanner() }
        item { Spacer(modifier = Modifier.height(40.dp)) }
        item { TitleSection("Ongoing Explore") }
        item { Spacer(modifier = Modifier.height(14.dp)) }
        item { UpcomingAuctionBanner() }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { JoinedAuctionBanner() }



    }
}