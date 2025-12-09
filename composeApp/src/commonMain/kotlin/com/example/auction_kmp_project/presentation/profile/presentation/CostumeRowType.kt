package com.example.auction_kmp_project.presentation.profile.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_arrow
import com.example.auction_kmp_project.presentation.profile.presentation.utils.RawType
import org.jetbrains.compose.resources.painterResource

@Composable
fun CostumeRowType(rawType: RawType, onClick: () -> Unit) {
    var isChecked by remember { mutableStateOf(false) }
    when (rawType) {
        RawType.Switch -> {
            // You can make the switch itself trigger parent onClick
            CustomSwitch(
                checked = isChecked, onCheckedChange = {
                    isChecked = it
                    onClick()
                })
        }

        RawType.ARROW -> {
            Image(
                painter = painterResource(Res.drawable.ic_arrow),
                contentDescription = "",
                modifier = Modifier.clickable { onClick() })
        }

        RawType.Raw -> {
            CostumeRow {
                onClick()
            }
        }

        else -> {

        }
    }
}

