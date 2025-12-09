package com.example.auction_kmp_project.data.repository

import com.example.auction_kmp_project.data.dummyData.Auctions
import com.example.auction_kmp_project.domain.repository.AuctionsRepository

class AuctionsRepositoryImpl : AuctionsRepository {


    override suspend fun getTabs(): List<String> {
       return Auctions.tabsList
    }

}

