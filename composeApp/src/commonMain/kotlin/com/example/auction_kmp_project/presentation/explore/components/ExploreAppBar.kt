package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_notification_app_bar
import auctionkmpproject.composeapp.generated.resources.ic_search_app_bar
import com.example.auction_kmp_project.helpers.FontSizes.font20
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size24
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun ExploreAppBar() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(Size16),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            "Explore",
            fontSize = font20,
            color = PrimaryBlueColor,
            fontFamily = readexProFontFamily(),
            fontWeight = FontWeight.SemiBold
        )
        Row {
            Image(
                painter = painterResource(Res.drawable.ic_search_app_bar),
                contentDescription = "search",

                )
            Spacer(modifier = Modifier.width(Size24))
            Image(
                painter = painterResource(Res.drawable.ic_notification_app_bar),
                contentDescription = "notification"
            )
        }
    }
}
