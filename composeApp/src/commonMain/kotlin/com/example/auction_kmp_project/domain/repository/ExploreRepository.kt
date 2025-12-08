package com.example.auction_kmp_project.domain.repository

import com.example.auction_kmp_project.domain.models.AuctionCard
import com.example.auction_kmp_project.domain.models.CategoryCardModel

interface ExploreRepository {
//    suspend fun getLiveAuctions(): List<String>
//    suspend fun getUpcomingAuctions(): List<AuctionCard>
//    suspend fun getOngoingAuctions(): List<AuctionCard>
    suspend fun getCategories(): List<CategoryCardModel>

}