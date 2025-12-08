package com.example.auction_kmp_project.domain.repository

interface AuctionsRepository {
    suspend fun getAuctions():List<String>

}