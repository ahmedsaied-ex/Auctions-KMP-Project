package com.example.auction_kmp_project.presentation.bottomSheet.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.auction_kmp_project.data.dummyData.BottomSheet
import com.example.auction_kmp_project.domain.models.BottomSheetModel
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size16
import com.example.auction_kmp_project.helpers.Sizes.Size2
import com.example.auction_kmp_project.helpers.Sizes.Size24
import com.example.auction_kmp_project.helpers.Sizes.Size28
import com.example.auction_kmp_project.helpers.Sizes.Size32
import com.example.auction_kmp_project.helpers.Sizes.Size4
import com.example.auction_kmp_project.ui.theme.BidStatusText
import com.example.auction_kmp_project.ui.theme.BottomSheetBackground
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.collections.List


@Composable
fun BiddersBottomSheet(
    items: List<BottomSheetModel>,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                BottomSheetBackground,
                shape = RoundedCornerShape(topStart = Size28, topEnd = Size28)
            )
            .padding(top =  Size16)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = Size28),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .width(Size32)
                    .height(Size4)
                    .clip(RoundedCornerShape(Size2))
                    .background(BidStatusText)
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Size16)
        ) {
            items(items) { item ->
                BidItemRow(item = item)
                Spacer(modifier = Modifier.height(Size24))
            }
        }
    }
}



@Preview
@Composable
fun AuctionBiddersPreview() {
    BiddersBottomSheet(items = BottomSheet.BottomSheetItems)


}