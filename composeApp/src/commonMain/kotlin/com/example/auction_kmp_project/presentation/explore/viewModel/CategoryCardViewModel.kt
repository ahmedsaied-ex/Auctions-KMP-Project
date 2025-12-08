package com.example.auction_kmp_project.presentation.explore.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.auction_kmp_project.domain.models.CategoryCardModel
import com.example.auction_kmp_project.domain.useCase.CategoryCardUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CategoryCardViewModel (private val getCategories: CategoryCardUseCase) : ViewModel() {


    private val _category = MutableStateFlow<List<CategoryCardModel>>(emptyList())
    val category: StateFlow<List<CategoryCardModel>> = _category

    init {
        loadAll()
    }

    private fun loadAll() {
        viewModelScope.launch {
            _category.value = getCategories()
        }
    }
}
