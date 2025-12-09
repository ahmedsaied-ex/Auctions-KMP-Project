package com.example.auction_kmp_project.presentation.auctions.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.auction_kmp_project.helpers.FontSizes.font14
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size3
import com.example.auction_kmp_project.helpers.Sizes.Size46
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.UnselectedColor


@Composable
fun AuctionTabBar(
    tabs: List<String> = listOf("Upcoming", "Ongoing", "Completed"),
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit
) {
    val selectedColor = PrimaryBlueColor
    val unSelectedColor = UnselectedColor

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        tabs.forEachIndexed { index, title ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) { onTabSelected(index) }
            ) {
                Text(
                    text = title,
                    color = if (selectedTabIndex == index) selectedColor else unSelectedColor,
                    fontWeight = FontWeight.Medium,
                    fontSize = font14
                )
                Spacer(modifier = Modifier.height(Size12))
                if (selectedTabIndex == index) {
                    Box(
                        modifier = Modifier
                            .height(Size3)
                            .width(Size46)
                            .background(
                                color = selectedColor,
                                shape = RoundedCornerShape(
                                    topStart = 4.dp,
                                    topEnd = 4.dp
                                )
                            )
                    )
                }
            }
        }
    }
}
