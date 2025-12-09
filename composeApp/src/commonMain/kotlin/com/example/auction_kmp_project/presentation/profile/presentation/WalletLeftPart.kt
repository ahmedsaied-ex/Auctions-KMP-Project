package com.example.auction_kmp_project.presentation.profile.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size20

@Composable
fun WalletLeftPart() {
    Column(modifier = Modifier.padding(Size20)) {
        CardInfo()
        Spacer(modifier = Modifier.height(Size14))
        WalletButton{}
    }
}
