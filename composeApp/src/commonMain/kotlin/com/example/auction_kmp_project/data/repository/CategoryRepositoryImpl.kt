package com.example.auction_kmp_project.data.repository

import com.example.auction_kmp_project.data.dummyData.Categories
import com.example.auction_kmp_project.domain.repository.CategoryRepository

class CategoryRepositoryImpl : CategoryRepository {
    override suspend fun getCategories(): List<String> {
        return Categories.categoriesList

    }
}