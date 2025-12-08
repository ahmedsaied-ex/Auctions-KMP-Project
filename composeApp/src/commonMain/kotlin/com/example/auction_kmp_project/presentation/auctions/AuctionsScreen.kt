package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AuctionsScreen(navController: NavController) {
    Column { CategoriesBar() }
    var searchedText by remember { mutableStateOf("") }
    var selectedTab by remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),) {
        SearchBar(
            searchedText = searchedText,
            onTextChanged = { newText -> searchedText = newText },
            onSearch = { query -> }
        )
        AuctionTabBar(
            selectedTabIndex = selectedTab, tabs = listOf("Upcoming", "Ongoing", "Completed")
        ){}



    }
}

@Composable
@Preview(showBackground = true)
fun AuctionsScreenPreview() {
    val navController = rememberNavController() // Fake NavController for preview
    var searchedText by remember { mutableStateOf("") }
    var selectedTab by remember { mutableStateOf(0) }

    Column(modifier = Modifier.background(Color.White).fillMaxSize(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        SearchBar(
            searchedText = searchedText,
            onTextChanged = { newText -> searchedText = newText },
            onSearch = { query -> }
        )
        AuctionTabBar(
            selectedTabIndex = selectedTab,
            tabs = listOf("Upcoming", "Ongoing", "Completed")
        ) { index ->
            selectedTab = index
        }
    }
}





