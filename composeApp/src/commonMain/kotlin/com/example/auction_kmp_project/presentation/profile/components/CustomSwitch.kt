package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import com.example.auction_kmp_project.ui.theme.LiveAuctionCardBidTextColor
import com.example.auction_kmp_project.ui.theme.PrimaryOrangeColor
import com.example.auction_kmp_project.ui.theme.SwitchOffButtonTracker


@Composable
fun CustomSwitch(
    checked: Boolean, onCheckedChange: (Boolean) -> Unit
) {
    Switch(
        checked = checked, onCheckedChange = onCheckedChange, colors = SwitchDefaults.colors(
            checkedThumbColor = PrimaryOrangeColor,
            checkedTrackColor = LiveAuctionCardBidTextColor,
            uncheckedThumbColor = White,
            uncheckedTrackColor = SwitchOffButtonTracker,
            disabledCheckedTrackColor = Color.Gray,
            disabledUncheckedTrackColor = Color.LightGray
        )
    )
}

