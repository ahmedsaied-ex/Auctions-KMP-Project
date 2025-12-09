package com.example.auction_kmp_project.domain.repository

interface AuctionsRepository {
    suspend fun getCategories(): List<String>
    suspend fun getTabs(): List<String>
}