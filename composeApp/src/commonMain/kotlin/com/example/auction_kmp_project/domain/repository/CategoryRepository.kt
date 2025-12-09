package com.example.auction_kmp_project.domain.repository

interface CategoryRepository {
    suspend fun getCategories(): List<String>

}