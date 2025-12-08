package com.example.auction_kmp_project.domain.useCase

import com.example.auction_kmp_project.domain.models.CategoryCardModel
import com.example.auction_kmp_project.domain.repository.ExploreRepository

class CategoryCardUseCase(private val repository: ExploreRepository) {
    suspend operator fun invoke(): List<CategoryCardModel> =repository.getCategories()
}