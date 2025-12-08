package com.example.auction_kmp_project.domain.models

import org.jetbrains.compose.resources.DrawableResource

data class AuctionCardModel(
    val title: String,
    val date: String,
    val imageUrl: DrawableResource,
    val itemCount:Int,
    val moneyAmount:String,
    val auctionTime:String,
    val currencySymbol:String,
    val category:Categories,
    val status:Staus

)


enum class Categories{
ELECTRONICS,CARS,JEWELERY,ANTIQUES,REAL_STATE,VEGETABLES_AND_FRUITS
}

enum class Staus{
    ONGOING,UPCOMING,COMPLETED
}