package com.example.auction_kmp_project.domain.repository

import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.models.AuctionItemCardModel

interface ItemsRepository {

    suspend fun geAuctionItemCards(): List<AuctionItemCardModel>

}