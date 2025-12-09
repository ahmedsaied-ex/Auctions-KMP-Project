package com.example.auction_kmp_project.domain.useCase

import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.domain.models.CategoryCardModel
import com.example.auction_kmp_project.domain.repository.ExploreRepository
import com.example.auction_kmp_project.domain.repository.ItemsRepository

class AuctionItemsCardsUseCase( private val repository: ItemsRepository) {
    suspend operator fun invoke(): List<AuctionItemCardModel> =repository.geAuctionItemCards()
}