package com.example.auction_kmp_project.presentation.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.auction_kmp_project.helpers.Sizes.Size20

@Composable
fun DialogButtonsRow(showDialog: MutableState<Boolean>,onClick:()->Unit={}) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        DialogCancelButton(
            onClick = {
                onClick()
            }
        )
        Spacer(Modifier.width(Size20))
        DialogConfirmationButton(
            onClick = {
                onClick()
            }
        )
    }
}