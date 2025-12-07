package com.example.auction_kmp_project.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.readex_pro_light
import auctionkmpproject.composeapp.generated.resources.readex_pro_regular
import org.jetbrains.compose.resources.Font

// In your commonMain code

@Composable
fun readexProFontFamily() = FontFamily(
    Font(Res.font.readex_pro_regular, FontWeight.Normal),
)




