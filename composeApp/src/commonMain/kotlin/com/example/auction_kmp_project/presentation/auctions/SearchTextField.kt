package com.example.auction_kmp_project.presentation.auctions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.search
import com.example.auction_kmp_project.helpers.FontSizes.font13
import com.example.auction_kmp_project.helpers.Sizes.Size50
import com.example.auction_kmp_project.helpers.Sizes.Size60
import com.example.auction_kmp_project.helpers.Sizes.Size9
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.TextSectionBackgroundColor
import com.example.auction_kmp_project.ui.theme.TimeBottomTextColor
import com.example.auction_kmp_project.ui.theme.TimeCardbottomBackgroundColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource

@Composable
fun SearchTextField(
    searchedText: String,
    modifier: Modifier = Modifier,
    onChanged:(String)->Unit,
    onSearch:(String)->Unit
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current

    TextField(
        value = searchedText,
        onValueChange = { newText ->
            onChanged(newText)
        },
        modifier = modifier.height(Size60),   // APPLY WIDTH FROM PARENT
        placeholder = {
            Text(
                "Search for auctions", style = TextStyle(
                    fontSize = font13,
                    color = TimeCardbottomBackgroundColor,
                    fontFamily = readexProFontFamily()
                ), modifier = Modifier.fillMaxHeight(), textAlign = TextAlign.Center
            )
        },
        leadingIcon = {
            Image(
                painter = painterResource(Res.drawable.search),
                contentDescription = "Search"
            )
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = TimeBottomTextColor,
            unfocusedContainerColor = TimeBottomTextColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            focusedTextColor = TimeCardbottomBackgroundColor,
            unfocusedTextColor = TimeCardbottomBackgroundColor,
            cursorColor = PrimaryBlueColor,
            selectionColors = TextSelectionColors(
                handleColor = TimeCardbottomBackgroundColor,
                backgroundColor = TextSectionBackgroundColor
            ),
        ),
        singleLine = true,
        shape = RoundedCornerShape(Size9),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(
            onSearch = {
                onSearch(searchedText)  // Show all items
                focusManager.clearFocus()
                keyboardController?.hide()
                focusManager.clearFocus()
            }
        ),

    )

}
