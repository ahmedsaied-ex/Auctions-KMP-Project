package com.example.auction_kmp_project.presentation.explore.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.models.CategoryCardModel
import com.example.auction_kmp_project.domain.useCase.CategoryCardUseCase
import com.example.auction_kmp_project.domain.useCase.OngoingAuctions
import com.example.auction_kmp_project.domain.useCase.UpComingAuctions
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ExploreViewModel(
    private val getCategories: CategoryCardUseCase,
    private val getOngoingAuctions: OngoingAuctions,
    private val getUpComingAuctions: UpComingAuctions,
) : ViewModel() {

    private val _category = MutableStateFlow<List<CategoryCardModel>>(emptyList())
    val category: StateFlow<List<CategoryCardModel>> = _category
    private val _upComingAuctions = MutableStateFlow<List<AuctionCardModel>>(emptyList())
    val upComingAuctions: StateFlow<List<AuctionCardModel>> = _upComingAuctions
    private val _ongoingAuctions = MutableStateFlow<List<AuctionCardModel>>(emptyList())
    val ongoingAuctions: StateFlow<List<AuctionCardModel>> = _ongoingAuctions

    init {
        loadAll()
    }

    private fun loadAll() {
        viewModelScope.launch {
            _category.value = getCategories()
            _upComingAuctions.value = getUpComingAuctions()
            _ongoingAuctions.value = getOngoingAuctions()
        }
    }
}
