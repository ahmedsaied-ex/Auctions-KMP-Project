package com.example.auction_kmp_project.data.repository

import com.example.auction_kmp_project.data.dummyData.Explore
import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.models.CategoryCardModel
import com.example.auction_kmp_project.domain.repository.ExploreRepository

class ExploreRepositoryImpl : ExploreRepository {
    override suspend fun getLiveAuctions(): List<String> {
        TODO("Not yet implemented")
    }

    override suspend fun getUpcomingAuctions(): List<AuctionCardModel> {
        return Explore.upcomingAuctions
    }

    override suspend fun getOngoingAuctions(): List<AuctionCardModel> {
        return Explore.ongoingAuctions
    }

    override suspend fun getCompletedAuctions(): List<AuctionCardModel> {
        return Explore.completedAuctions
    }

    override suspend fun getCategories(): List<CategoryCardModel> {
        TODO("Not yet implemented")
    }

}