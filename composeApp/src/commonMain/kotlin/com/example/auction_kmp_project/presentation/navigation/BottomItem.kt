package com.example.auction_kmp_project.presentation.navigation

import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_auctions_active
import auctionkmpproject.composeapp.generated.resources.ic_auctions_inactive
import auctionkmpproject.composeapp.generated.resources.ic_explore_home_active
import auctionkmpproject.composeapp.generated.resources.ic_explore_home_inactive
import auctionkmpproject.composeapp.generated.resources.ic_items_active
import auctionkmpproject.composeapp.generated.resources.ic_items_inactive
import auctionkmpproject.composeapp.generated.resources.ic_profile_active
import auctionkmpproject.composeapp.generated.resources.ic_profile_inactive
import com.example.auction_kmp_project.domain.models.BottomNavItem

val bottomNavItems = listOf(
    BottomNavItem(
        MainGraphRoutes.Explore,
        "Explore",
        Res.drawable.ic_explore_home_active,
        Res.drawable.ic_explore_home_inactive
    ),
    BottomNavItem(MainGraphRoutes.Auctions, "Auctions", Res.drawable.ic_auctions_active,Res.drawable.ic_auctions_inactive),
    BottomNavItem(MainGraphRoutes.Items, "Items", Res.drawable.ic_items_active,Res.drawable.ic_items_inactive),
    BottomNavItem(MainGraphRoutes.Profile, "Profile", Res.drawable.ic_profile_active,Res.drawable.ic_profile_inactive )
)
