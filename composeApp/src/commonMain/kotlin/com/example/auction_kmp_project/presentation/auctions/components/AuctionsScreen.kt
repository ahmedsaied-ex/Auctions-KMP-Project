package com.example.auction_kmp_project.presentation.auctions.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.presentation.auctions.viewModel.AuctionsViewModel
import org.koin.compose.koinInject

@Composable
fun AuctionsScreen(
    navController: NavController, auctionsViewModel: AuctionsViewModel = koinInject()
) {
    val auctions by auctionsViewModel.currentList.collectAsState()
    val categoriesList by auctionsViewModel.categoryList.collectAsState()
    val auctionsList by auctionsViewModel.auctionsBar.collectAsState()
    var searchedText by remember { mutableStateOf("") }
    var selectedTab by remember { mutableStateOf(0) }
    val focusRequester = remember { FocusRequester() }
    var selected by remember { mutableStateOf(categoriesList[0]) }
    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current

    Column(modifier = Modifier.background(Color.White).fillMaxSize(),) {
        SearchBar(
            focusRequester = focusRequester,
            searchedText = searchedText,
            onTextChanged = { newText -> searchedText = newText },
            onSearch = {
                focusManager.clearFocus()
                keyboardController?.hide()
            }
        )
        Spacer(modifier = Modifier.height(Size12))
        AuctionTabBar(
            selectedTabIndex = selectedTab, tabs = auctionsList
        ){ index ->
            focusManager.clearFocus()
            keyboardController?.hide()
            selectedTab = index
            selected = categoriesList[0]
            auctionsViewModel.onTabSelected(index)
        }
        Spacer(modifier = Modifier.height(Size8))
        CategoryChipsRow(
            categories = categoriesList,
            selectedCategory = selected,
            onCategorySelected = { selected = it
                focusManager.clearFocus()
                keyboardController?.hide()
            }
        )
        AuctionScreenAuctionsList(auctions = auctions)
    }
}









