package com.example.auction_kmp_project.presentation.profile.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.presentation.profile.components.utils.RawType
import com.example.auction_kmp_project.ui.theme.BodyColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun MyProfileCardRow(
    iconBackgroundColor: Color = TimeBottomTextColor,
    textColor: Color = BodyColor,
    img: DrawableResource,
    description: String? = null,
    title: String = "Account info",
    rawType: RawType = RawType.ARROW,
    onClick: () -> Unit = {}
) {
    Row(
        modifier = Modifier.padding(vertical = Size12, horizontal = Size12).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RowCardIcon(img = img, backgroundColor = iconBackgroundColor)
        Spacer(modifier = Modifier.width(Size16))
        CardTextColumn(description = description, title = title, textColor = textColor)
        Spacer(modifier = Modifier.weight(1f))
        CostumeRowType(rawType = rawType, onClick = onClick)
    }
}

