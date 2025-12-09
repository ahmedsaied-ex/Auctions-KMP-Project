package com.example.auction_kmp_project.data.repository

import com.example.auction_kmp_project.data.dummyData.Auctions
import com.example.auction_kmp_project.data.dummyData.Items
import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.domain.repository.ItemsRepository

class ItemsRepositoryImpl: ItemsRepository {
    override suspend fun geAuctionItemCards(): List<AuctionItemCardModel> {

        return Items.AuctionsItems
    }


}