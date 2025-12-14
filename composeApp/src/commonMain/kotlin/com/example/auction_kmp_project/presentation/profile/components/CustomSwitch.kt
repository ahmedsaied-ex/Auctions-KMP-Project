package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.runtime.Composable

@Composable
fun CustomSwitch(
    checked: Boolean, onCheckedChange: (Boolean) -> Unit
) {
    AuctionCostumeSwitch(
        checked = checked,
        onCheckedChange = { newValue ->
            onCheckedChange(newValue)
        }
    )

}

