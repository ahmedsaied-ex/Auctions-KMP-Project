package com.example.auction_kmp_project.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.auction_kmp_project.presentation.auctions.AuctionsScreen
import com.example.auction_kmp_project.presentation.explore.components.ExploreScreen
import com.example.auction_kmp_project.presentation.items.components.ItemsScreen
import com.example.auction_kmp_project.presentation.profile.ProfileScreen

@Composable
fun MainNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = MainGraphRoutes.Graph ,
        modifier = modifier
    ) {
        mainGraph(
            navController = navController
        )
    }
}
