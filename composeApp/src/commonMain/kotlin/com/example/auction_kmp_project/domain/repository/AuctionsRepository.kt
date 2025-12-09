package com.example.auction_kmp_project.domain.repository

interface AuctionsRepository {
    suspend fun getTabs(): List<String>
}