package com.example.auction_kmp_project.presentation.profile.presentation


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.ic_about_app
import auctionkmpproject.composeapp.generated.resources.ic_auctions_inactive
import auctionkmpproject.composeapp.generated.resources.ic_hide_name
import auctionkmpproject.composeapp.generated.resources.ic_language
import auctionkmpproject.composeapp.generated.resources.ic_log_out
import auctionkmpproject.composeapp.generated.resources.ic_notification_app_bar
import auctionkmpproject.composeapp.generated.resources.ic_password
import auctionkmpproject.composeapp.generated.resources.ic_payment_cards
import auctionkmpproject.composeapp.generated.resources.ic_privacy_policy
import auctionkmpproject.composeapp.generated.resources.ic_settings_profile
import auctionkmpproject.composeapp.generated.resources.ic_terms_conditions
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size5
import com.example.auction_kmp_project.presentation.profile.presentation.utils.RawType
import com.example.auction_kmp_project.ui.theme.MainBackgroundColor
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun TopProfilePart() {
    LazyColumn(modifier = Modifier.background(MainBackgroundColor).fillMaxSize()) {
        item {
            Box {
                MyProfileInfo()
                WalletCard(modifier = Modifier.align(Alignment.BottomCenter))
            }
        }
        item {
            ProfileDepartment() {
                CostumeProfileCard {
                    Column {
                        MyProfileCardRow(
                            title = "Account info",
                            img = Res.drawable.ic_settings_profile,
                        ) {}
                        MyProfileCardRow(
                            img = Res.drawable.ic_auctions_inactive,
                            title = "Joined auctions",
                        ) {}
                    }
                }
            }
        }
        item {
            ProfileDepartment("Preferences") {
                CostumeProfileCard {
                    Column {
                        MyProfileCardRow(
                            title = "Language",
                            img = Res.drawable.ic_language,
                            rawType = RawType.Raw
                        ) {}
                        MyProfileCardRow(
                            img = Res.drawable.ic_notification_app_bar,
                            title = "Push Notifications",
                            rawType = RawType.Switch
                        )
                    }
                }
            }
        }
        item {
            ProfileDepartment("Preferences") {
                CostumeProfileCard {
                    Column {
                        MyProfileCardRow(
                            title = "Hide your name?",
                            img = Res.drawable.ic_hide_name,
                            rawType = RawType.Switch,
                            description = "Keep your name hidden from other bidders in auctions."
                        ) {}
                    }
                }
            }
        }
        item {
            ProfileDepartment("Payments") {
                CostumeProfileCard {
                    Column {
                        MyProfileCardRow(
                            title = "Payments",
                            img = Res.drawable.ic_payment_cards,
                        ) {}
                    }
                }
            }
        }
        item {
            ProfileDepartment("Legal & Security") {
                CostumeProfileCard {
                    Column {
                        MyProfileCardRow(
                            title = "Change password",
                            img = Res.drawable.ic_password,
                        ) {}
                        MyProfileCardRow(
                            title = "Privacy policy",
                            img = Res.drawable.ic_privacy_policy,
                        ) {}
                        MyProfileCardRow(
                            title = "Terms and conditions",
                            img = Res.drawable.ic_terms_conditions,
                        ) {}
                    }
                }
            }
        }
        item {
            ProfileDepartment("About") {
                CostumeProfileCard {
                    Column {
                        MyProfileCardRow(
                            title = "About the App",
                            img = Res.drawable.ic_about_app,
                        ) {}
                    }
                }
            }
        }
        item {
            Box(modifier = Modifier.padding(vertical = Size5, horizontal = Size16)) {
                MyProfileCardRow(
                    title = "Log out",
                    img = Res.drawable.ic_log_out,
                    iconBackgroundColor = Red.copy(alpha = 0.05f),
                    textColor = Color(0xFFC70000),
                    rawType = RawType.NOTHING
                ) {}
            }

        }

    }
}


