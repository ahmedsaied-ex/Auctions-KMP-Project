package com.example.auction_kmp_project.presentation.profile.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size15
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun ProfileDepartment(departmentTitle: String = "My Account", content: @Composable () -> Unit) {
    Spacer(modifier = Modifier.height(Size15))
    Column(modifier = Modifier.padding(horizontal = Size16, vertical = Size15).fillMaxWidth()) {
        Text(
            departmentTitle, style = TextStyle(
                color = PrimaryBlueColor, fontSize = font13, fontFamily = readexProFontFamily()
            )
        )
        Spacer(modifier = Modifier.height(Size10))
        content()
    }
}




