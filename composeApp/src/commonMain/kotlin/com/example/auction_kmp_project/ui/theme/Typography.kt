package com.example.auction_kmp_project.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.readex_pro_light
import auctionkmpproject.composeapp.generated.resources.readex_pro_medium
import auctionkmpproject.composeapp.generated.resources.readex_pro_regular
import auctionkmpproject.composeapp.generated.resources.readex_pro_semi_bold
import org.jetbrains.compose.resources.Font

// In your commonMain code

@Composable
fun readexProFontFamily() = FontFamily(
    Font(Res.font.readex_pro_regular, FontWeight.Normal),
    Font(Res.font.readex_pro_light, FontWeight.Light),
    Font(Res.font.readex_pro_medium, FontWeight.Medium),
    Font(Res.font.readex_pro_semi_bold, FontWeight.SemiBold),

)




