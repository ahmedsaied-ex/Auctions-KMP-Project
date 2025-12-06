package com.example.auction_kmp_project.domain.models

import com.example.auction_kmp_project.presentation.navigation.MainGraphRoutes
import org.jetbrains.compose.resources.DrawableResource

data class BottomNavItem(
    val route: MainGraphRoutes,
    val label: String,
    val iconActive: DrawableResource, // The file name in composeResources/drawable,
    val iconInActive: DrawableResource // The file name in composeResources/drawable
)
