package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size15
import com.example.auction_kmp_project.helpers.Sizes.Size16

@Composable
fun SearchBar(
    searchedText: String,
    onTextChanged: (String) -> Unit,
    onSearch: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = Size15, vertical = Size12),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SearchTextField(
            modifier = Modifier.weight(1f),
            searchedText = searchedText,
            onChanged = onTextChanged,
            onSearch = onSearch
        )
        Spacer(modifier = Modifier.width(Size16))
        FilterButton()
    }
}
