package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CostumeProfileCard(content: @Composable () -> Unit) {
    Card(modifier = Modifier, colors = CardDefaults.cardColors(White)) {
        content()
    }
}
