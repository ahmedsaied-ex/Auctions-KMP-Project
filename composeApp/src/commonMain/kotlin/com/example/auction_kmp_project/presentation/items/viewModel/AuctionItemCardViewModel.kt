package com.example.auction_kmp_project.presentation.items.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.domain.models.CategoryCardModel
import com.example.auction_kmp_project.domain.useCase.AuctionItemsCardsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ItemsViewModel(  private val getItemsCards: AuctionItemsCardsUseCase,): ViewModel() {

    private val _item = MutableStateFlow<List<AuctionItemCardModel>>(emptyList())
    val item: StateFlow<List<AuctionItemCardModel>> = _item

    init {
        loadAll()
    }

    private fun loadAll() {
        viewModelScope.launch {
            _item.value = getItemsCards()

        }
    }
}


