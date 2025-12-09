package com.example.auction_kmp_project.presentation.navigation


import kotlinx.serialization.Serializable

sealed interface MainGraphRoutes {
    @Serializable
    data object Graph : MainGraphRoutes
    @Serializable
    data object Explore : MainGraphRoutes
    @Serializable
    data object Auctions : MainGraphRoutes
    @Serializable
    data object Items : MainGraphRoutes
    @Serializable
    data object Profile : MainGraphRoutes
}









