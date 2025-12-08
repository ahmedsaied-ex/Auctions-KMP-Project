package com.example.auction_kmp_project.presentation.explore

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun ExploreScreen(navController: NavController) {
    LazyColumn (
        modifier = Modifier.fillMaxSize(),
    ) {
        item{ ExploreAppBar() }
        item{ LiveAuctionCardList() }
        item { Spacer(modifier = Modifier.height(20.dp)) }
        item{ UpcomingAuctionBanner() }
        item { Spacer(modifier = Modifier.height(20.dp)) }
    }
}