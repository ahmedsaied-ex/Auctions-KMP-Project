package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun AuctionsScreen(navController: NavController) {
    Column { CategoriesBar() }
}