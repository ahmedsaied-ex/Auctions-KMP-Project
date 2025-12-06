package com.example.auction_kmp_project.presentation.navigation


import kotlinx.serialization.Serializable

sealed interface MainGraphRoutes {
    val route: String
    @Serializable
    data object Graph : MainGraphRoutes {
        override val route = "graph"
    }

    @Serializable
    data object Explore : MainGraphRoutes {
        override val route = "explore"
    }

    @Serializable
    data object Auctions : MainGraphRoutes {
        override val route = "auctions"
    }

    @Serializable
    data object Items : MainGraphRoutes {
        override val route = "items"
    }

    @Serializable
    data object Profile : MainGraphRoutes {
        override val route = "profile"
    }
}









