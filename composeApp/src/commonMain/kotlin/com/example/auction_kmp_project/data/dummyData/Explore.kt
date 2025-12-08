package com.example.auction_kmp_project.data.dummyData

import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.antiques
import auctionkmpproject.composeapp.generated.resources.cars
import auctionkmpproject.composeapp.generated.resources.electronics
import auctionkmpproject.composeapp.generated.resources.jewels
import auctionkmpproject.composeapp.generated.resources.real_estate
import auctionkmpproject.composeapp.generated.resources.vegetables_fruits
import com.example.auction_kmp_project.domain.models.CategoryCardModel

object Explore {
    val categories = listOf(
        CategoryCardModel("Electronics", Res.drawable.electronics),
        CategoryCardModel("Cars", Res.drawable.cars),
        CategoryCardModel("Jewels", Res.drawable.jewels),
        CategoryCardModel("Antiques", Res.drawable.antiques),
        CategoryCardModel("Real Estate", Res.drawable.real_estate),
        CategoryCardModel("Vegetables & Fruits", Res.drawable.vegetables_fruits),
    )
}
