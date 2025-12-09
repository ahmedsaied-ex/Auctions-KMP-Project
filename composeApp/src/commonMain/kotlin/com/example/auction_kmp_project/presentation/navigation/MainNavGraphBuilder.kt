package com.example.auction_kmp_project.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.auction_kmp_project.presentation.auctions.components.AuctionsScreen
import com.example.auction_kmp_project.presentation.explore.components.ExploreScreen
import com.example.auction_kmp_project.presentation.items.ItemsScreen
import com.example.auction_kmp_project.presentation.profile.presentation.ProfileScreen


fun NavGraphBuilder.mainGraph(navController: NavController) {
    navigation<MainGraphRoutes.Graph>(
        startDestination = MainGraphRoutes.Explore,
    ) {
        composable<MainGraphRoutes.Explore> {
            ExploreScreen(navController)
        }
        composable<MainGraphRoutes.Auctions> {
            AuctionsScreen(navController)
        }
        composable<MainGraphRoutes.Items> {
            ItemsScreen(navController)
        }
        composable<MainGraphRoutes.Profile> {
            ProfileScreen(navController)
        }
    }
}