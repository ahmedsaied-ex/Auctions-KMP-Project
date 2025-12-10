package com.example.auction_kmp_project.presentation.items.components

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
import com.example.auction_kmp_project.data.dummyData.Categories.categoriesList
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.presentation.auctions.components.CategoryChipsRow
import com.example.auction_kmp_project.presentation.auctions.components.SearchBar
import com.example.auction_kmp_project.presentation.items.viewModel.ItemsViewModel
import org.koin.compose.koinInject


@Composable
fun ItemsScreen(
    navController: NavController,
    auctionItemCardViewModel: ItemsViewModel = koinInject()
) {
    val items by auctionItemCardViewModel.item.collectAsState()
    val focusRequester = remember { FocusRequester() }
    var searchedText by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current
    var selected by remember { mutableStateOf(categoriesList[0]) }

    Column(modifier = Modifier.background(Color.White).fillMaxSize()) {
        SearchBar(
            focusRequester = focusRequester,
            searchedText = searchedText,
            onTextChanged = { newText -> searchedText = newText },
            onSearch = {
                focusManager.clearFocus()
                keyboardController?.hide()
            }
        )
        Spacer(modifier = Modifier.height(Size8))
        CategoryChipsRow(
            categories = categoriesList,
            selectedCategory = selected,
            onCategorySelected = {
                selected = it
                focusManager.clearFocus()
                keyboardController?.hide()
            }
        )
        AuctionItemCardList (items)
    }

}


