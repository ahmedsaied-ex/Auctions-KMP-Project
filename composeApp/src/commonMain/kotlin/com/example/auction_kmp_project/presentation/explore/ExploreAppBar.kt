package com.example.auction_kmp_project.presentation.explore

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
import androidx.compose.ui.unit.sp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_filter_app_bar
import auctionkmpproject.composeapp.generated.resources.ic_hide_name
import auctionkmpproject.composeapp.generated.resources.ic_notification_app_bar
import auctionkmpproject.composeapp.generated.resources.ic_search_app_bar
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun ExploreAppBar() {
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Text("Explore", fontSize = 20.sp, color = PrimaryBlueColor, fontFamily = readexProFontFamily(), fontWeight = FontWeight.SemiBold)
        Row {
            Image(
                painter = painterResource(Res.drawable.ic_search_app_bar),
                contentDescription = "search",

            )
            Spacer(modifier = Modifier.width(24.dp))
            Image(
                painter = painterResource(Res.drawable.ic_notification_app_bar),
                contentDescription = "notification"
            )
        }
    }
}
