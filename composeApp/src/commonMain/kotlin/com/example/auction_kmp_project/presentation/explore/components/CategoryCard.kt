package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.electronics
import com.example.auction_kmp_project.domain.models.CategoryCardModel
import com.example.auction_kmp_project.helpers.FontSizes.font16
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size140
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size166
import com.example.auction_kmp_project.helpers.Sizes.Size4
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun CategoryCard(category: CategoryCardModel) {

    Box(
        modifier = Modifier.width(Size140).height(Size166)
            .background(
                shape = RoundedCornerShape(Size10),
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        TimeBottomTextColor,
                        BidStatusText,)
                )
            )
    )
    {
        Text(
            category.title,
            fontFamily = readexProFontFamily(),
            color = PrimaryBlueColor,
            fontWeight = FontWeight.Medium,
            fontSize = font16,
            modifier = Modifier
                .align(Alignment.TopStart).padding(horizontal = Size14, vertical = Size16)
        )
        Spacer(modifier = Modifier.height(Size4))
        Image(
            modifier = Modifier.align(Alignment.BottomEnd),
            painter = painterResource(category.image),
            contentDescription = "notification"
        )


    }
}