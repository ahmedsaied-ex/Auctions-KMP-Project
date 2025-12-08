package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.PrimaryOrangeColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily


@Composable
fun AuctionCardMinimumBid(currencySymbol: String, moneyAmmount: String) {
    Column {
        Text(
            "Minimum bid", style = TextStyle(
                color = BodyColor,
                fontWeight = FontWeight.Light,
                fontFamily = readexProFontFamily(),
                fontSize = 10.sp
            )
        )
        Row {
            Text(
                currencySymbol, style = TextStyle(
                    color = PrimaryOrangeColor,
                    fontWeight = FontWeight.Light,
                    fontFamily = readexProFontFamily(),
                    fontSize = 20.sp
                )
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                moneyAmmount, style = TextStyle(
                    color = PrimaryOrangeColor,
                    fontWeight = FontWeight.Bold,
                    fontFamily = readexProFontFamily(),
                    fontSize = 20.sp
                )
            )

        }
    }
}

