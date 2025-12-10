package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.*
import org.jetbrains.compose.resources.stringResource

@Composable
fun PaymentSection(savedCardsOnClick: () -> Unit={}){
    ProfileDepartment(stringResource(Res.string.payments)) {
        CostumeProfileCard {
            Column {
                MyProfileCardRow(
                    title = stringResource(Res.string.payments),
                    img = Res.drawable.ic_payment_cards,
                ) {
                    savedCardsOnClick()
                }
            }
        }
    }
}
