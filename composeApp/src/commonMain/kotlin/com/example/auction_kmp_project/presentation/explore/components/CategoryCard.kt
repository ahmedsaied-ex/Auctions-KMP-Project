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
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun CategoryCard(category: CategoryCardModel) {
    val gradientColors = listOf(
        Color(0xffEBE9F1),
        Color(0xffE0DDEA),

        )

    Box(
        modifier = Modifier.width(140.dp).height(166.dp)
            .background(
                shape = RoundedCornerShape(10.dp),
                brush = Brush.horizontalGradient(
                    colors = gradientColors
                )
            )
    )
    {
        Text(
            category.title,
            fontFamily = readexProFontFamily(),
            color = PrimaryBlueColor,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.TopStart).padding(horizontal = 14.dp, vertical = 16.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Image(
            modifier = Modifier.align(Alignment.BottomEnd),
            painter = painterResource(category.image),
            contentDescription = "notification"
        )


    }
}