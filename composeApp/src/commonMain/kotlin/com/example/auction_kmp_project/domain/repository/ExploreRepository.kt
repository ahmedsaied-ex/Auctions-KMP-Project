package com.example.auction_kmp_project.domain.repository

import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.models.CategoryCardModel

interface ExploreRepository {
    suspend fun getLiveAuctions(): List<String>
    suspend fun getUpcomingAuctions(): List<AuctionCardModel>
    suspend fun getOngoingAuctions(): List<AuctionCardModel>
    suspend fun getCompletedAuctions(): List<AuctionCardModel>
    suspend fun getCategories(): List<CategoryCardModel>

}