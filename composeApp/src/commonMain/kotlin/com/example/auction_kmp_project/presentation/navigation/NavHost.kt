package com.example.auction_kmp_project.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = MainGraphRoutes.Graph ,
        modifier = modifier
    ) {
        mainGraph(
            navController = navController,
        )
    }
}
