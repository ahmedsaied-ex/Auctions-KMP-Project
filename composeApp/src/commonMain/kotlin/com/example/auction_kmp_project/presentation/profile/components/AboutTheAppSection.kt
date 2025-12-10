package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.*
import org.jetbrains.compose.resources.stringResource

@Composable
fun AboutTheAppSection(aboutTheAppOnClick: () -> Unit={}){
    ProfileDepartment(stringResource(Res.string.about)) {
        CostumeProfileCard {
            Column {
                MyProfileCardRow(
                    title = stringResource(Res.string.about_the_app),
                    img = Res.drawable.ic_about_app,
                ) {
                    aboutTheAppOnClick()
                }
            }
        }
    }
}
