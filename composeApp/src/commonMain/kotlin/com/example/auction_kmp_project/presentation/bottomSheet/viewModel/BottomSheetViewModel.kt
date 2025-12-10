package com.example.auction_kmp_project.presentation.bottomSheet.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.auction_kmp_project.domain.models.BottomSheetModel
import com.example.auction_kmp_project.domain.useCase.AuctionItemsCardsUseCase
import com.example.auction_kmp_project.domain.useCase.BottomSheetUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class BottomSheetViewModel(
    private val getItems: BottomSheetUseCase,
) : ViewModel() {
    private val _items =MutableStateFlow<List<BottomSheetModel>>(emptyList())
    val items: StateFlow<List<BottomSheetModel>> = _items
    init {
        loadAll()
    }

    private fun loadAll() {
        viewModelScope.launch {
            _items.value = getItems()


        }
    }
}
