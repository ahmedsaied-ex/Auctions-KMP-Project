package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.navigation.NavController
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size6
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.presentation.explore.components.AuctionCard
import com.example.auction_kmp_project.presentation.explore.viewModel.ExploreViewModel
import com.example.auction_kmp_project.ui.theme.MainBackgroundColor
import org.koin.compose.koinInject

@Composable
fun AuctionsScreen(navController: NavController,exploreViewModel: ExploreViewModel= koinInject()) {
    val ongoingAuctions by exploreViewModel.ongoingAuctions.collectAsState()
    var searchedText by remember { mutableStateOf("") }
    var selectedTab by remember { mutableStateOf(0) }
    val focusRequester = remember { FocusRequester() }
    var selected by remember { mutableStateOf("All") }
    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current
    Column(modifier = Modifier.background(Color.White).fillMaxSize(),) {
        SearchBar(
            focusRequester = focusRequester,
            searchedText = searchedText,
            onTextChanged = { newText -> searchedText = newText },
            onSearch = {}
        )
        AuctionTabBar(
            selectedTabIndex = selectedTab, tabs = listOf("Upcoming", "Ongoing", "Completed")
        ){ index ->
            focusManager.clearFocus()
            keyboardController?.hide()
            selectedTab = index
            selected="All"
        }
        Spacer(modifier = Modifier.height(Size8))
        CategoryChipsRow(
            categories = listOf(
                "All",
                "Electronics",
                "Cars",
                "Jewels",
                "Antiques",
                "Real Estate",
                "Vegetables & Fruits"
            ),
            selectedCategory = selected,
            onCategorySelected = { selected = it
                focusManager.clearFocus()
                keyboardController?.hide()
            }
        )
        LazyColumn(modifier = Modifier.background(MainBackgroundColor)){
            items(ongoingAuctions){item->
                Box(modifier = Modifier.padding(horizontal = Size16, vertical = Size6)) {
                    AuctionCard(item = item)
                }
            }
            }
        }



    }








