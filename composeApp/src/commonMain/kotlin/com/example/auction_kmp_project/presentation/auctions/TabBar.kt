package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun AuctionsScreen() {
    var selectedTab by remember { mutableStateOf(0) }
    AuctionTabBar(
        selectedTabIndex = selectedTab, tabs = listOf("Upcoming", "Ongoing", "Completed")
    ) { index ->
        selectedTab = index // <-- update the selected tab
    }
}



