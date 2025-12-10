package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.account_info
import auctionkmpproject.composeapp.generated.resources.ic_auctions_inactive
import auctionkmpproject.composeapp.generated.resources.ic_settings_profile
import auctionkmpproject.composeapp.generated.resources.joined_auctions
import org.jetbrains.compose.resources.stringResource

@Composable
fun MyAccountSection(accountInfoOnClick: () -> Unit={}, joinedAuctions: () -> Unit={},){
    ProfileDepartment() {
        CostumeProfileCard {
            Column {
                MyProfileCardRow(
                    title = stringResource(Res.string.account_info),
                    img = Res.drawable.ic_settings_profile,
                ) {
                    accountInfoOnClick()
                }

                MyProfileCardRow(
                    img = Res.drawable.ic_auctions_inactive,
                    title = stringResource(Res.string.joined_auctions),
                ) {joinedAuctions()}
            }
        }
    }
}
