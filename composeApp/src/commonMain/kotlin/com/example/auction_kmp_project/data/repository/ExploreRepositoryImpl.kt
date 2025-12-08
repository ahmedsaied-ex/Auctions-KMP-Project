package com.example.auction_kmp_project.data.repository

import com.example.auction_kmp_project.domain.models.AuctionCard
import com.example.auction_kmp_project.domain.models.CategoryCardModel
import com.example.auction_kmp_project.domain.repository.ExploreRepository

class ExploreRepositoryImpl : ExploreRepository {
    override suspend fun getLiveAuctions(): List<String> {
        TODO("Not yet implemented")
    }

    override suspend fun getUpcomingAuctions(): List<AuctionCard> {
        TODO("Not yet implemented")
    }

    override suspend fun getOngoingAuctions(): List<AuctionCard> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategories(): List<CategoryCardModel> {
        TODO("Not yet implemented")
    }

}