package com.example.auction_kmp_project.domain.models

data class AuctionCard(
    val title: String,
    val date: String,
    val imageUrl: String,
    val itemCount:Int,
    val price:String,
    val auctionTime:String
)
