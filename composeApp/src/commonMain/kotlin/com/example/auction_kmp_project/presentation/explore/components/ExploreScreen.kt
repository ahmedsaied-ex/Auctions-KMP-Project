package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size40
import com.example.auction_kmp_project.presentation.dialog.SimpleDialogDemo
import com.example.auction_kmp_project.presentation.explore.viewModel.ExploreViewModel
import com.example.auction_kmp_project.ui.theme.MainBackgroundColor
import org.koin.compose.koinInject


@Composable
fun ExploreScreen(navController: NavController, exploreViewModel: ExploreViewModel= koinInject()) {
    val categories by exploreViewModel.category.collectAsState()
    val upComingAuctions by exploreViewModel.upComingAuctions.collectAsState()
    val ongoingAuctions by exploreViewModel.ongoingAuctions.collectAsState()
    val showDialog = remember { mutableStateOf(false) }

    LazyColumn(
        modifier = Modifier.background(MainBackgroundColor).fillMaxSize(),
    ) {
        item { ExploreAppBar() }
        item { LiveAuctionCardList() }
        item { Spacer(modifier = Modifier.height(Size40)) }
        item {
            TitleSection("Categories") {
                showDialog.value = true
            }
            SimpleDialogDemo(showDialog = showDialog){
                showDialog.value = false
            }
        }
        item { Spacer(modifier = Modifier.height(Size12)) }
        item { CategoryCardsList(categories) }
        item { Spacer(modifier = Modifier.height(Size40)) }
        item { TitleSection("Upcoming Explore") }
        item { Spacer(modifier = Modifier.height(Size14)) }
        item { AuctionsList(
            auctions = upComingAuctions
        ) }
        item { Spacer(modifier = Modifier.height(Size40)) }
        item { TitleSection("Ongoing Explore") }
        item { Spacer(modifier = Modifier.height(Size14)) }
        item { AuctionsList(
            auctions = ongoingAuctions
        ) }
        item { Spacer(modifier = Modifier.height(Size10)) }
        item { JoinedAuctionBanner(){} }



    }
}