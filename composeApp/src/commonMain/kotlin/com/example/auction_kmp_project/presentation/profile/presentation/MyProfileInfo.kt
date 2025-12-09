package com.example.auction_kmp_project.presentation.profile.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size40
import com.example.auction_kmp_project.helpers.Sizes.Size86
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor

@Composable
fun MyProfileInfo() {
    Column(
        modifier = Modifier.background(TimeBottomTextColor).fillMaxWidth()
            .padding(top = Size40, bottom = Size86),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfilePictureIfNull(firstCharsOfName = "AS")
        Spacer(modifier = Modifier.height(Size10))
        ProfileName(
            name = "Ahmed Saied"
        )
    }
}