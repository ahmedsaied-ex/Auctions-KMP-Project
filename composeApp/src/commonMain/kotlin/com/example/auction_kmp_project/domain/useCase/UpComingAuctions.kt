package com.example.auction_kmp_project.domain.useCase

import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.repository.ExploreRepository

class UpComingAuctions(private val repository: ExploreRepository) {
    suspend operator fun invoke(): List<AuctionCardModel> = repository.getUpcomingAuctions()

}

