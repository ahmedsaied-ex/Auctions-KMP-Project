package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.*
import com.example.auction_kmp_project.presentation.profile.components.utils.RawType
import org.jetbrains.compose.resources.stringResource

@Composable
fun PrivacySection(onClickHideYourName: () -> Unit={}){
    ProfileDepartment(stringResource(Res.string.preferences)) {
        CostumeProfileCard {
            Column {
                MyProfileCardRow(
                    title = stringResource(Res.string.hide_your_name),
                    img = Res.drawable.ic_hide_name,
                    rawType = RawType.Switch,
                    description = stringResource(Res.string.hide_your_name_description)
                ) {
                    onClickHideYourName()
                }
            }
        }
    }
}
