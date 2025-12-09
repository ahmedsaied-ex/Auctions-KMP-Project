package com.example.auction_kmp_project.data.dummyData

import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.auction_card_image_test
import auctionkmpproject.composeapp.generated.resources.auction_card_image_test_three
import auctionkmpproject.composeapp.generated.resources.auction_card_image_test_two
import auctionkmpproject.composeapp.generated.resources.car
import auctionkmpproject.composeapp.generated.resources.car1
import auctionkmpproject.composeapp.generated.resources.car2
import auctionkmpproject.composeapp.generated.resources.car3
import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.domain.models.Categories
import com.example.auction_kmp_project.domain.models.Staus

object Items {

    val AuctionsItems: List<AuctionItemCardModel> = listOf(
        AuctionItemCardModel(
            title = "Electric Truck",
            date = "24 May 2023",
            imageUrl = Res.drawable.car1,
            moneyAmount = "500,000",
            remainTime = "4d 8h 49m",
            status = "Starts in",
            startTime = "12:00 PM - 01:00 Pm",
        ),
        AuctionItemCardModel(
            title = "2021 Ford F-150",
            date = "24 May 2023",
            imageUrl = Res.drawable.car,
            moneyAmount = "230,000",
            remainTime = "4d 8h 49m",
            status = "Starts in",
            startTime = "12:00 PM - 01:00 Pm",
        ),
        AuctionItemCardModel(
            title = "1937 Packard",
            date = "24 May 2023",
            imageUrl = Res.drawable.car2,
            moneyAmount = "200,000",
            remainTime = "49m 33s",
            status = "Ends in",
            startTime = "12:00 PM - 01:00 Pm",
        ),
        AuctionItemCardModel(
            title = "Electric Truck",
            date = "24 May 2023",
            imageUrl = Res.drawable.car3,
            moneyAmount = "150,000",
            remainTime = "4d 8h 49m",
            status = "Starts in",
            startTime = "12:00 PM - 01:00 Pm",
        ),
        AuctionItemCardModel(
            title = "Electric Truck",
            date = "24 May 2023",
            imageUrl = Res.drawable.car1,
            moneyAmount = "500,000",
            remainTime = "4d 8h 49m",
            status = "Starts in",
            startTime = "12:00 PM - 01:00 Pm",
        ),
        AuctionItemCardModel(
            title = "2021 Ford F-150",
            date = "24 May 2023",
            imageUrl = Res.drawable.car,
            moneyAmount = "230,000",
            remainTime = "4d 8h 49m",
            status = "Starts in",
            startTime = "12:00 PM - 01:00 Pm",
        ),
        AuctionItemCardModel(
            title = "1937 Packard",
            date = "24 May 2023",
            imageUrl = Res.drawable.car2,
            moneyAmount = "200,000",
            remainTime = "49m 33s",
            status = "Ends in",
            startTime = "12:00 PM - 01:00 Pm",
        ),
        AuctionItemCardModel(
            title = "Electric Truck",
            date = "24 May 2023",
            imageUrl = Res.drawable.car3,
            moneyAmount = "150,000",
            remainTime = "4d 8h 49m",
            status = "Starts in",
            startTime = "12:00 PM - 01:00 Pm",
        ),
    )
}