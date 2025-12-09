package com.example.auction_kmp_project.presentation.items.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import com.example.auction_kmp_project.presentation.explore.viewModel.ExploreViewModel
import com.example.auction_kmp_project.presentation.items.viewModel.ItemsViewModel
import org.koin.compose.koinInject


@Composable
fun ItemsScreen(navController: NavController,auctionItemCardViewModel: ItemsViewModel = koinInject()) {
    val items by auctionItemCardViewModel.item.collectAsState()
    AuctionItemCardList(items)
}


