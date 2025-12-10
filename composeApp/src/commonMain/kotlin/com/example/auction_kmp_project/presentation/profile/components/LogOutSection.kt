package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.*
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size5
import com.example.auction_kmp_project.presentation.profile.components.utils.RawType
import com.example.auction_kmp_project.ui.theme.LogoutTextColor
import org.jetbrains.compose.resources.stringResource

@Composable
fun LogOutSection(logOutOnClick: () -> Unit={}){
    Box(modifier = Modifier.padding(vertical = Size5, horizontal = Size16)) {
        MyProfileCardRow(
            title = stringResource(Res.string.log_out),
            img = Res.drawable.ic_log_out,
            iconBackgroundColor = Red.copy(alpha = 0.05f),
            textColor = LogoutTextColor,
            rawType = RawType.NOTHING
        ) {
            logOutOnClick()
        }
    }

}