package com.example.auction_kmp_project.presentation.dialog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Dialog
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size24
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun SimpleDialogDemo(showDialog: MutableState<Boolean>,onClick:()->Unit) {
    if (showDialog.value) {
        Dialog(onDismissRequest = { showDialog.value = false }) {
            Surface(
                shape = RoundedCornerShape(Size12),
                color = Color.White
            ) {
                Column(
                    modifier = Modifier
                        .padding(Size24)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    DialogImage()
                    Spacer(Modifier.height(Size16))
                    DialogTitle("Insufficient Funds")
                    Spacer(Modifier.height(Size16))
                    DialogMainMessage("You don't have enough funds in your wallet to continue bidding in this auction. To continue bidding, you must add funds to your wallet.")
                    Spacer(Modifier.height(Size24))
                    DialogButtonsRow(
                        showDialog = showDialog
                    ){
                        onClick()
                    }
                }
            }
        }
    }
}









