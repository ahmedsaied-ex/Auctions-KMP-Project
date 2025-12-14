package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size20
import com.example.auction_kmp_project.helpers.Sizes.Size34
import com.example.auction_kmp_project.helpers.Sizes.Size6
import com.example.auction_kmp_project.ui.theme.*

@Composable
fun AuctionCostumeSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    width: Dp = Size34,
    thumbSize: Dp = Size20,
    trackWidth: Dp = Size34,
    trackHeight: Dp = Size14,
    activeColor: Color = LiveAuctionCardBidTextColor,
    inactiveColor: Color =SwitchOffButtonTracker,
    thumbColor: Color = Color.White
) {
    val thumbOffset by animateDpAsState(
        targetValue = if (checked) width - thumbSize else 0.dp,
        label = "thumbOffset"
    )

    val trackColor by animateColorAsState(
        targetValue = if (checked) activeColor else inactiveColor,
        label = "trackColor"
    )
    val changeThumbColor by animateColorAsState(
        targetValue = if (checked) PrimaryOrangeColor else thumbColor,
        label = "thumbColor"
    )

    Box(
        modifier = modifier
            .size(width, thumbSize)
            .clickable { onCheckedChange(!checked) },
        contentAlignment = Alignment.Center
    ) {
        // 🔹 Small track (background)
        Box(
            modifier = Modifier
                .size(trackWidth, trackHeight)
                .clip(RoundedCornerShape(trackHeight / 2))
                .background(trackColor)
        )

        // 🔵 Big thumb (on top)
        Box(
            modifier = Modifier
                .offset(x = thumbOffset)
                .size(thumbSize)
                .shadow(
                    elevation = Size6,
                    shape = CircleShape,
                    clip = false
                )
                .clip(CircleShape)
                .background(changeThumbColor)
                .align(Alignment.CenterStart)
        )
    }
}

