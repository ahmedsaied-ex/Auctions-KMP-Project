package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.*
import org.jetbrains.compose.resources.stringResource

@Composable
fun LegalAndSecuritySection(changePassOnClick: () -> Unit={},privacyPolicyOnClick: () -> Unit={},termsConditionsOnClick: () -> Unit={}) {
    ProfileDepartment(stringResource(Res.string.legal_security)) {
        CostumeProfileCard {
            Column {
                MyProfileCardRow(
                    title = stringResource(Res.string.change_password),
                    img = Res.drawable.ic_password,
                ) {
                    changePassOnClick()
                }
                MyProfileCardRow(
                    title = stringResource(Res.string.privacy_policy),
                    img = Res.drawable.ic_privacy_policy,
                ) {
                    privacyPolicyOnClick()
                }
                MyProfileCardRow(
                    title = stringResource(Res.string.terms_conditions),
                    img = Res.drawable.ic_terms_conditions,
                ) {
                    termsConditionsOnClick()
                }
            }
        }
    }
}

