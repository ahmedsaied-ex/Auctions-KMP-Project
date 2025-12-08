package com.example.auction_kmp_project.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.auction_kmp_project.presentation.auctions.AuctionsScreen
import com.example.auction_kmp_project.presentation.explore.components.ExploreScreen
import com.example.auction_kmp_project.presentation.items.ItemsScreen
import com.example.auction_kmp_project.presentation.profile.ProfileScreen


fun NavGraphBuilder.mainGraph(navController: NavController) {
    navigation(
        startDestination = MainGraphRoutes.Explore.route,
        route = MainGraphRoutes.Graph.route
    ) {
        composable(MainGraphRoutes.Explore.route) {
            ExploreScreen(navController)
        }
        composable(MainGraphRoutes.Auctions.route) {
            AuctionsScreen(navController)
        }
        composable(MainGraphRoutes.Items.route) {
            ItemsScreen(navController)
        }
        composable(MainGraphRoutes.Profile.route) {
            ProfileScreen(navController)
        }
    }
}