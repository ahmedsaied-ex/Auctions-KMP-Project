package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.current_wallet_balance
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.FontSizes.font25
import com.example.auction_kmp_project.helpers.Sizes.Size4
import com.example.auction_kmp_project.ui.theme.WalletCardTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.stringResource


@Composable
fun CardInfo(currencySymbol: String = "SR" , amount: Int = 500) {
    Row {
        Text(
            currencySymbol, style = TextStyle(
                fontSize = font25,
                fontWeight = FontWeight.Light,
                color = White,
                fontFamily = readexProFontFamily()
            )
        )
        Spacer(modifier = Modifier.width(Size4))
        Text(
            amount.toString(), style = TextStyle(
                fontSize = font25,
                fontWeight = FontWeight.Bold,
                color = White,
                fontFamily = readexProFontFamily()
            )
        )
    }
    Text(
        stringResource(Res.string.current_wallet_balance), style = TextStyle(
            fontSize = font13,
            color = WalletCardTextColor,
            fontFamily = readexProFontFamily()
        )
    )
}