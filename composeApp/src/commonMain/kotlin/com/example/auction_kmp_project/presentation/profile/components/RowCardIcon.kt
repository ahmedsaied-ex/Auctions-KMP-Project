package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size8
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun RowCardIcon(img: DrawableResource, backgroundColor: Color) {
    Box(
        modifier = Modifier.background(
            color = backgroundColor, shape = RoundedCornerShape(Size10)     // corner radius
        ).padding(Size8),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painterResource(img), contentDescription = "settings"
        )

    }
}