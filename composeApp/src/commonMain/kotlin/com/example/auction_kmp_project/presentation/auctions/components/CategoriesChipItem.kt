package com.example.auction_kmp_project.presentation.auctions.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.Sizes.Size05
import com.example.auction_kmp_project.helpers.Sizes.Size1
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size25
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.ui.theme.CategoryItemSelectedBackgroundColor
import com.example.auction_kmp_project.ui.theme.CategoryItemSelectedBorderColor
import com.example.auction_kmp_project.ui.theme.CategoryItemSelectedTextColor
import com.example.auction_kmp_project.ui.theme.CategoryItemUnSelectedBackgroundColor
import com.example.auction_kmp_project.ui.theme.CategoryItemUnSelectedBorderColor
import com.example.auction_kmp_project.ui.theme.CategoryItemUnSelectedTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.ui.tooling.preview.Preview


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