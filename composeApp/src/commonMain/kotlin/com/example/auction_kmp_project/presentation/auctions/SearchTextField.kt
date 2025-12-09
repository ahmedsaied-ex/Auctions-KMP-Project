package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.search
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size40
import com.example.auction_kmp_project.helpers.Sizes.Size8
import com.example.auction_kmp_project.helpers.Sizes.Size9
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.TextSectionBackgroundColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
import com.example.auction_kmp_project.ui.theme.TimeCardTopBackgroundColor
import com.example.auction_kmp_project.ui.theme.TimeCardbottomBackgroundColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
@Composable
fun SearchTextField(
    searchedText: String,
    modifier: Modifier = Modifier,
    onChanged: (String) -> Unit,
    onSearch: (String) -> Unit,
    focusRequester: FocusRequester = remember { FocusRequester() }
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current

    CompositionLocalProvider(
        LocalTextSelectionColors provides TextSelectionColors(
            handleColor = TimeCardbottomBackgroundColor,
            backgroundColor = TextSectionBackgroundColor
        )
    ) {
        BasicTextField(
            modifier = modifier
                .height(Size40)
                .background(
                    color = TimeBottomTextColor,
                    shape = RoundedCornerShape(Size9)
                )
                .focusRequester(focusRequester),
            value = searchedText,
            onValueChange = { newText -> onChanged(newText) },
            singleLine = true,
            textStyle = TextStyle(
                color = TimeCardbottomBackgroundColor,
                fontSize = font13,
                fontFamily = readexProFontFamily()
            ),
            cursorBrush = SolidColor(PrimaryBlueColor),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = {
                    onSearch(searchedText)
                    keyboardController?.hide()
                    focusManager.clearFocus()
                }
            ),
            decorationBox = { innerTextField ->
                val bgColor = TimeBottomTextColor
                Row(
                    modifier = modifier
                        .height(Size40)
                        .background(
                            color = bgColor,
                            shape = RoundedCornerShape(Size9)
                        )
                        .padding(horizontal = Size12),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // LEADING ICON
                    Image(
                        painter = painterResource(Res.drawable.search),
                        contentDescription = "Search"
                    )

                    Spacer(modifier = Modifier.width(Size8))

                    Box(
                        modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.CenterStart
                    ) {

                        // PLACEHOLDER
                        if (searchedText.isEmpty()) {
                            Text(
                                "Search for auctions",
                                style = TextStyle(
                                    fontSize = font13,
                                    color = TimeCardTopBackgroundColor,
                                    fontFamily = readexProFontFamily()
                                )
                            )
                        }

                        innerTextField()
                    }
                }
            }
        )
    }
}
