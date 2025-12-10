package com.example.auction_kmp_project.presentation.explore.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.categories
import auctionkmpproject.composeapp.generated.resources.ongoingExplore
import auctionkmpproject.composeapp.generated.resources.upcomingExplore
import com.example.auction_kmp_project.data.dummyData.BottomSheet
import com.example.auction_kmp_project.helpers.Sizes.Size10
import com.example.auction_kmp_project.helpers.Sizes.Size12
import com.example.auction_kmp_project.helpers.Sizes.Size14
import com.example.auction_kmp_project.helpers.Sizes.Size28
import com.example.auction_kmp_project.helpers.Sizes.Size40
import com.example.auction_kmp_project.presentation.bottomSheet.components.BiddersBottomSheet
import com.example.auction_kmp_project.presentation.bottomSheet.viewModel.BottomSheetViewModel
import com.example.auction_kmp_project.presentation.dialog.SimpleDialogDemo
import com.example.auction_kmp_project.presentation.explore.viewModel.ExploreViewModel
import com.example.auction_kmp_project.ui.theme.BottomSheetBackground
import com.example.auction_kmp_project.ui.theme.MainBackgroundColor
import kotlinx.coroutines.launch
import org.koin.compose.koinInject


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen(navController: NavController, exploreViewModel: ExploreViewModel= koinInject(),bottomSheetViewModel: BottomSheetViewModel = koinInject()) {
    val categories by exploreViewModel.category.collectAsState()
    val upComingAuctions by exploreViewModel.upComingAuctions.collectAsState()
    val ongoingAuctions by exploreViewModel.ongoingAuctions.collectAsState()
    val items by bottomSheetViewModel.items.collectAsState()
    val showDialog = remember { mutableStateOf(false) }
    val isSheetVisible = remember { mutableStateOf(false) }

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )

    val scope = rememberCoroutineScope()
    if (isSheetVisible.value) {
        ModalBottomSheet(
            onDismissRequest = {
                scope.launch { sheetState.hide() }
                isSheetVisible.value = false
            },
            dragHandle = null,
            sheetState = sheetState,
            shape = RoundedCornerShape(topStart = Size28, topEnd = Size28),

            containerColor =Transparent
        ) {
            BiddersBottomSheet(
                items = items,

            )
        }
    }
    LazyColumn(
        modifier = Modifier.background(MainBackgroundColor).fillMaxSize(),
    ) {
        item { ExploreAppBar() }
        item { LiveAuctionCardList() }
        item { Spacer(modifier = Modifier.height(Size40)) }
        item {
            TitleSection(Res.string.categories) {
                showDialog.value = true
            }
            SimpleDialogDemo(showDialog = showDialog){
                showDialog.value = false
            }
        }
        item { Spacer(modifier = Modifier.height(Size12)) }
        item { CategoryCardsList(categories) }
        item { Spacer(modifier = Modifier.height(Size40)) }
        item { TitleSection(Res.string.upcomingExplore){ scope.launch {
            isSheetVisible.value = true
            sheetState.show()
        }}
        }
        item { Spacer(modifier = Modifier.height(Size14)) }
        item { AuctionsList(
            auctions = upComingAuctions
        ) }
        item { Spacer(modifier = Modifier.height(Size40)) }
        item { TitleSection(Res.string.ongoingExplore) }
        item { Spacer(modifier = Modifier.height(Size14)) }
        item { AuctionsList(
            auctions = ongoingAuctions
        ) }
        item { Spacer(modifier = Modifier.height(Size10)) }
        item { JoinedAuctionBanner(){} }



    }
}