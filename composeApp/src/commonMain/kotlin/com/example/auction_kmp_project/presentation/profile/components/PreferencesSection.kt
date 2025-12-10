package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.*
import com.example.auction_kmp_project.presentation.profile.components.utils.RawType
import org.jetbrains.compose.resources.stringResource


@Composable
fun PreferencesSection(
    onClickLanguage: () -> Unit={},onClickPushNotifications: () -> Unit={},
){
    ProfileDepartment(stringResource(Res.string.preferences)) {
        CostumeProfileCard {
            Column {
                MyProfileCardRow(
                    title = stringResource(Res.string.language),
                    img = Res.drawable.ic_language,
                    rawType = RawType.Raw
                ) {
                    onClickLanguage()
                }

                MyProfileCardRow(
                    img = Res.drawable.ic_notification_app_bar,
                    title = stringResource(Res.string.push_notifications),
                    rawType = RawType.Switch
                ){
                    onClickPushNotifications()
                }
            }
        }
    }

}
