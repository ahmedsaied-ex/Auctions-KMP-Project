package com.example.auction_kmp_project.presentation.auctions.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.useCase.CategoriesUseCase
import com.example.auction_kmp_project.domain.useCase.CompletedAuctions
import com.example.auction_kmp_project.domain.useCase.OngoingAuctions
import com.example.auction_kmp_project.domain.useCase.TabsUseCase
import com.example.auction_kmp_project.domain.useCase.UpComingAuctions
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuctionsViewModel(
    private val getOngoingAuctions: OngoingAuctions,
    private val getUpComingAuctions: UpComingAuctions,
    private val getCompletedAuctions: CompletedAuctions,
    private val getCategories: CategoriesUseCase,
    private val getTabs: TabsUseCase
) : ViewModel() {
    private val _categoryList =MutableStateFlow<List<String>>(emptyList())
    val categoryList: StateFlow<List<String>> = _categoryList
    private val _auctionsBar =MutableStateFlow<List<String>>(emptyList())
    val auctionsBar: StateFlow<List<String>> = _auctionsBar

    private val _currentList= MutableStateFlow<List<AuctionCardModel>>(emptyList())
    val currentList: StateFlow<List<AuctionCardModel>> = _currentList

    init {
        loadAll()
    }
    private fun loadAll() {
        upComingAuctions()

    }

    fun upComingAuctions(){
        viewModelScope.launch {
            _currentList.value = getUpComingAuctions()
            _categoryList.value = getCategories()
            _auctionsBar.value = getTabs()
        }
    }
    fun onGoingAuctions(){
        viewModelScope.launch {
            _currentList.value = getOngoingAuctions()
        }
    }
    fun completedAuctions(){
        viewModelScope.launch {
            _currentList.value = getCompletedAuctions()
        }
    }

    fun onTabSelected(index: Int){
        when (index) {
            0 -> upComingAuctions()
            1 -> onGoingAuctions()
            2 -> completedAuctions()
        }

    }
}