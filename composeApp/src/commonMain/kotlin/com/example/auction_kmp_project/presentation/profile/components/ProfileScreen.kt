package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.auction_kmp_project.ui.theme.MainBackgroundColor

@Composable
fun ProfileScreen(navController: NavController) {
    LazyColumn(modifier = Modifier.background(MainBackgroundColor).fillMaxSize()) {
        item {
            TopProfilePart()
        }
        item {
            MyAccountSection(
                accountInfoOnClick = {},
                joinedAuctions = {}
            )
        }
        item {
            PreferencesSection(
                onClickLanguage = {},
                onClickPushNotifications = {}
            )
        }
        item {
            PrivacySection(){}
        }
        item {
            PaymentSection(){}
        }
        item {
            LegalAndSecuritySection(
                changePassOnClick = {},
                privacyPolicyOnClick = {},
                termsConditionsOnClick = {}
            )
        }
        item {
            AboutTheAppSection(){}
        }
        item {
            LogOutSection(){}
        }

    }
}





