package com.example.auction_kmp_project.presentation.dialog

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.Top_up_my_wallet
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.stringResource

@Composable
fun DialogConfirmationButton(onClick:()->Unit) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = TimeBottomTextColor,
            contentColor = Color.White
        ),
        contentPadding = PaddingValues(Size16),
        onClick = {
            onClick()
        }
    ) {
        Text(
            stringResource(Res.string.Top_up_my_wallet),
            style = TextStyle(
                color = PrimaryBlueColor,
                fontWeight = FontWeight.SemiBold,
                fontSize = font13,
                fontFamily = readexProFontFamily()
            )
        )
    }
}