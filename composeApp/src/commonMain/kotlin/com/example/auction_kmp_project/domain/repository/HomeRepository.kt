package com.example.auction_kmp_project.domain.repository

import com.example.auction_kmp_project.domain.models.AuctionCard

interface HomeRepository {
    suspend fun getLiveAuctions(): List<String>
    suspend fun getUpcomingAuctions(): List<AuctionCard>
    suspend fun getOngoingAuctions(): List<AuctionCard>
    suspend fun getCategories(): List<String>

}