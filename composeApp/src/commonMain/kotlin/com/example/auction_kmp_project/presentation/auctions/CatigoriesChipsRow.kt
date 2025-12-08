package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_category
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size24
import com.example.auction_kmp_project.helpers.Sizes.Size5
import com.example.auction_kmp_project.helpers.Sizes.Size8
import org.jetbrains.compose.resources.painterResource

@Composable
fun CategoryChipsRow(
    categories: List<String>,
    selectedCategory: String,
    onCategorySelected: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth().background(Color(0xffF1EFF5)).padding(start = Size16, top =Size8,bottom=Size8 ),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(
                Res.drawable.ic_category,
            ),
            contentDescription = null,
            modifier = Modifier
                .size(Size24)
        )
        Spacer(modifier = Modifier.width(Size14))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(Size5)) {
            items(categories) { item ->
                val isSelected = item == selectedCategory

                CategoriesBarItem(isSelected, item, onCategorySelected)
            }
        }
    }
}