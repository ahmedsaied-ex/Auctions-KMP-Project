package com.example.auction_kmp_project.domain.repository

import com.example.auction_kmp_project.domain.models.AuctionCardModel

interface HomeRepository {
    suspend fun getLiveAuctions(): List<String>
    suspend fun getUpcomingAuctions(): List<AuctionCardModel>
    suspend fun getOngoingAuctions(): List<AuctionCardModel>
    suspend fun getCategories(): List<String>

}