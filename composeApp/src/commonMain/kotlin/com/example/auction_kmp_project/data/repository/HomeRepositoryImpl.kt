package com.example.auction_kmp_project.data.repository

import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.repository.HomeRepository

class HomeRepositoryImpl : HomeRepository {
    override suspend fun getLiveAuctions(): List<String> {
        TODO("Not yet implemented")
    }

    override suspend fun getUpcomingAuctions(): List<AuctionCardModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getOngoingAuctions(): List<AuctionCardModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategories(): List<String> {
        TODO("Not yet implemented")
    }

}