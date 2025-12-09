package com.example.auction_kmp_project.presentation.auctions.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_filter_app_bar
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun FilterButton() {
    Image(
        painter = painterResource(Res.drawable.ic_filter_app_bar),
        contentDescription = "Filter",
        modifier = Modifier.size(24.dp)
    )
}
