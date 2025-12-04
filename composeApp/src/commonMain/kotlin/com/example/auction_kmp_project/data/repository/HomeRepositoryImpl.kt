package com.example.auction_kmp_project.data.repository

import com.example.auction_kmp_project.domain.models.AuctionCard
import com.example.auction_kmp_project.domain.repository.HomeRepository

class HomeRepositoryImpl : HomeRepository {
    override suspend fun getLiveAuctions(): List<String> {
        TODO("Not yet implemented")
    }

    override suspend fun getUpcomingAuctions(): List<AuctionCard> {
        TODO("Not yet implemented")
    }

    override suspend fun getOngoingAuctions(): List<AuctionCard> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategories(): List<String> {
        TODO("Not yet implemented")
    }

}