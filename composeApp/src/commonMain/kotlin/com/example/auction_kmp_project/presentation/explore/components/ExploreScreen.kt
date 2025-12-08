package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.auction_kmp_project.presentation.explore.viewModel.ExploreViewModel
import com.example.auction_kmp_project.ui.theme.MainBackgroundColor
import org.koin.compose.koinInject


@Composable
fun ExploreScreen(navController: NavController,categoryCardViewModel: ExploreViewModel= koinInject()) {
    val categories by categoryCardViewModel.category.collectAsState()
    val upComingAuctions by categoryCardViewModel.upComingAuctions.collectAsState()
    val ongoingAuctions by categoryCardViewModel.ongoingAuctions.collectAsState()


    LazyColumn(
        modifier = Modifier.background(MainBackgroundColor).fillMaxSize(),
    ) {
        item { ExploreAppBar() }
        item { LiveAuctionCardList() }
        item { Spacer(modifier = Modifier.height(40.dp)) }
        item { TitleSection("Categories") }
        item { Spacer(modifier = Modifier.height(12.dp)) }
        item { CategoryCardsList(categories) }
        item { Spacer(modifier = Modifier.height(40.dp)) }
        item { TitleSection("Upcoming Explore") }
        item { Spacer(modifier = Modifier.height(14.dp)) }
        item { AuctionsList(
            auctions = upComingAuctions
        ) }
        item { Spacer(modifier = Modifier.height(40.dp)) }
        item { TitleSection("Ongoing Explore") }
        item { Spacer(modifier = Modifier.height(14.dp)) }
        item { AuctionsList(
            auctions = ongoingAuctions
        ) }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { JoinedAuctionBanner(){} }



    }
}