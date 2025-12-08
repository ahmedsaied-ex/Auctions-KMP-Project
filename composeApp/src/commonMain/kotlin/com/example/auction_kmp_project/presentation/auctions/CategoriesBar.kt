package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.ui.tooling.preview.Preview






@Preview
@Composable
fun CategoriesBar() {
    var selected by remember { mutableStateOf("All") }
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
        onCategorySelected = { selected = it }
    )
}


