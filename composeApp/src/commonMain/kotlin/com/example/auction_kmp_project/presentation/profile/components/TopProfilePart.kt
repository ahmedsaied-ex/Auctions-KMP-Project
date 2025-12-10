package com.example.auction_kmp_project.presentation.profile.components


import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun TopProfilePart() {
    Box {
        MyProfileInfo()
        WalletCard(modifier = Modifier.align(Alignment.BottomCenter))
    }
}


