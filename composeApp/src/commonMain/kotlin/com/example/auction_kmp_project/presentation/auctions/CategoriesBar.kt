package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_category
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.Sizes.Size05
import com.example.auction_kmp_project.helpers.Sizes.Size1
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size24
import com.example.auction_kmp_project.helpers.Sizes.Size25
import com.example.auction_kmp_project.helpers.Sizes.Size5
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.ui.theme.CategoryItemSelectedBackgroundColor
import com.example.auction_kmp_project.ui.theme.CategoryItemSelectedBorderColor
import com.example.auction_kmp_project.ui.theme.CategoryItemSelectedTextColor
import com.example.auction_kmp_project.ui.theme.CategoryItemUnSelectedBackgroundColor
import com.example.auction_kmp_project.ui.theme.CategoryItemUnSelectedBorderColor
import com.example.auction_kmp_project.ui.theme.CategoryItemUnSelectedTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun CategoryChipsRow(
    categories: List<String>,
    selectedCategory: String,
    onCategorySelected: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth().background(Color(0xffF1EFF5)).padding(horizontal = Size16, vertical =Size8 ),
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


@Preview
@Composable
fun CategoriesBarItem(isSelected: Boolean, item: String, onCategorySelected: (String) -> Unit) {  Box(
    modifier = Modifier
        .clip(RoundedCornerShape(Size25))
        .background(
            if (isSelected) CategoryItemSelectedBackgroundColor
            else CategoryItemUnSelectedBackgroundColor
        )
        .border(
            width = if (isSelected) Size1
            else Size05,
            color = if (isSelected)CategoryItemSelectedBorderColor
            else CategoryItemUnSelectedBorderColor,
            shape = RoundedCornerShape(Size25)
        )
        .clickable { onCategorySelected(item) }
        .padding(horizontal = Size16, vertical = Size8)
) {
    Text(
        text = item,
        color = if (isSelected) CategoryItemSelectedTextColor else CategoryItemUnSelectedTextColor,
        fontSize = font13,
        fontFamily = readexProFontFamily()
    )
}}

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


