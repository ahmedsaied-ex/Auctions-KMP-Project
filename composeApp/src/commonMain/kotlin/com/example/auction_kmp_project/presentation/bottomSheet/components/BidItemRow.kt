package com.example.auction_kmp_project.presentation.bottomSheet.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.user
import auctionkmpproject.composeapp.generated.resources.welcome_message
import com.example.auction_kmp_project.domain.models.BottomSheetModel
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size18
import com.example.auction_kmp_project.helpers.Sizes.Size4
import com.example.auction_kmp_project.helpers.Sizes.Size40
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.PrimaryOrangeColor
import com.example.auction_kmp_project.ui.theme.TimeCardTopBackgroundColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun BidItemRow(item: BottomSheetModel) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {


        Box(
            modifier = Modifier
                .size(Size40)
                .clip(CircleShape)
                .background(BidStatusText),
            contentAlignment = Alignment.Center
        ) {
            if (item.isAnonymous) {
                Image(
                    painter = painterResource(Res.drawable.user),
                    contentDescription = null,
                    modifier = Modifier.size(Size18)
                )
            } else {
                Text(
                    text = item.initial ?: "",
                    fontSize = font16,
                    fontFamily = readexProFontFamily(),
                    color = BodyColor
                )
            }
        }


        Spacer(modifier = Modifier.width(Size16))

        Column {
            Text(
                text = item.name,
                fontFamily = readexProFontFamily(),
                fontSize = font16,
                fontWeight = FontWeight.Medium,
                color = PrimaryBlueColor
            )
            Spacer(modifier = Modifier.height(Size4))
            Row {
                Text(
                    text = "SR",
                    fontFamily = readexProFontFamily(),
                    fontSize = font16,
                    color = PrimaryOrangeColor
                )
                Text(
                    text = item.amountMoney,
                    fontFamily = readexProFontFamily(),
                    fontSize = font16,
                    fontWeight = FontWeight.Medium,
                    color = PrimaryOrangeColor
                )
            }


            Spacer(modifier = Modifier.height(Size4))

            Text(
                text = item.time,
                fontSize = font13,
                fontFamily = readexProFontFamily(),
                color = TimeCardTopBackgroundColor
            )
        }
    }
}

@Composable
fun MyScreen() {
    Text(stringResource(Res.string.welcome_message))
}