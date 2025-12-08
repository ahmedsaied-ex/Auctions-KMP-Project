package com.example.auction_kmp_project.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.auction_kmp_project.presentation.auctions.AuctionsScreen
import com.example.auction_kmp_project.presentation.explore.components.ExploreScreen
import com.example.auction_kmp_project.presentation.items.ItemsScreen
import com.example.auction_kmp_project.presentation.profile.ProfileScreen

@Composable
fun MainNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = MainGraphRoutes.Explore.route,
        modifier = modifier
    ) {
        composable(MainGraphRoutes.Explore.route) { ExploreScreen(navController) }
        composable(MainGraphRoutes.Auctions.route) { AuctionsScreen(navController) }
        composable(MainGraphRoutes.Items.route) { ItemsScreen(navController) }
        composable(MainGraphRoutes.Profile.route) { ProfileScreen(navController) }
    }
}
