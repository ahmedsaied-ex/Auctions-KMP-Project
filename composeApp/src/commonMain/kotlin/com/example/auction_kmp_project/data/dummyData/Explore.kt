package com.example.auction_kmp_project.data.dummyData

import auctionkmpproject.composeapp.generated.resources.Res
import auctionkmpproject.composeapp.generated.resources.auction_card_image_test
import auctionkmpproject.composeapp.generated.resources.auction_card_image_test_three
import auctionkmpproject.composeapp.generated.resources.auction_card_image_test_two
import com.example.auction_kmp_project.domain.models.AuctionCardModel
import com.example.auction_kmp_project.domain.models.Categories
import com.example.auction_kmp_project.domain.models.Staus

object Explore {
    val ongoingAuctions: List<AuctionCardModel> = listOf(
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 1,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.REAL_STATE,
            status = Staus.ONGOING
        ),
        AuctionCardModel(
            title = "Mazad Mogan 2",
            date = "31 May - 2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 9,
            moneyAmount = "125,000",
            auctionTime = "18h 9m 5s",
            currencySymbol = "SR",
            category = Categories.ELECTRONICS,
            status = Staus.ONGOING
        ),
        AuctionCardModel(
            title = "Nasem Hail",
            date = "31 May - 2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_three,
            itemCount = 15,
            moneyAmount = "800,000",
            auctionTime = "4m 5s",
            currencySymbol = "SR",
            category = Categories.JEWELERY,
            status = Staus.ONGOING
        ),
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_two,
            itemCount = 23,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.ANTIQUES,
            status = Staus.ONGOING
        ),
        AuctionCardModel(
            title = "Mosa mazad",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 14,
            moneyAmount = "50,000",
            auctionTime = "2h 9m 5s",
            currencySymbol = "SR",
            category = Categories.REAL_STATE,
            status = Staus.ONGOING
        ),
        AuctionCardModel(
            title = "Dardery Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_three,
            itemCount = 12,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.VEGETABLES_AND_FRUITS,
            status = Staus.ONGOING
        ),
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_two,
            itemCount = 20,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.CARS,
            status = Staus.ONGOING
        ),
    )
    val upcomingAuctions: List<AuctionCardModel> = listOf(
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 1,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.REAL_STATE,
            status = Staus.UPCOMING
        ),
        AuctionCardModel(
            title = "Mazad Mogan 2",
            date = "31 May - 2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 9,
            moneyAmount = "125,000",
            auctionTime = "18h 9m 5s",
            currencySymbol = "SR",
            category = Categories.ELECTRONICS,
            status = Staus.UPCOMING
        ),
        AuctionCardModel(
            title = "Nasem Hail",
            date = "31 May - 2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_three,
            itemCount = 15,
            moneyAmount = "800,000",
            auctionTime = "4m 5s",
            currencySymbol = "SR",
            category = Categories.JEWELERY,
            status = Staus.UPCOMING
        ),
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_two,
            itemCount = 23,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.ANTIQUES,
            status = Staus.UPCOMING
        ),
        AuctionCardModel(
            title = "Mosa mazad",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 14,
            moneyAmount = "50,000",
            auctionTime = "2h 9m 5s",
            currencySymbol = "SR",
            category = Categories.REAL_STATE,
            status = Staus.UPCOMING
        ),
        AuctionCardModel(
            title = "Dardery Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_three,
            itemCount = 12,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.VEGETABLES_AND_FRUITS,
            status = Staus.UPCOMING
        ),
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_two,
            itemCount = 20,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.CARS,
            status = Staus.UPCOMING
        ),
    )
    val completedAuctions: List<AuctionCardModel> = listOf(
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 1,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.REAL_STATE,
            status = Staus.COMPLETED
        ),
        AuctionCardModel(
            title = "Mazad Mogan 2",
            date = "31 May - 2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 9,
            moneyAmount = "125,000",
            auctionTime = "18h 9m 5s",
            currencySymbol = "SR",
            category = Categories.ELECTRONICS,
            status = Staus.COMPLETED
        ),
        AuctionCardModel(
            title = "Nasem Hail",
            date = "31 May - 2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_three,
            itemCount = 15,
            moneyAmount = "800,000",
            auctionTime = "4m 5s",
            currencySymbol = "SR",
            category = Categories.JEWELERY,
            status = Staus.COMPLETED
        ),
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_two,
            itemCount = 23,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.ANTIQUES,
            status = Staus.COMPLETED
        ),
        AuctionCardModel(
            title = "Mosa mazad",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test,
            itemCount = 14,
            moneyAmount = "50,000",
            auctionTime = "2h 9m 5s",
            currencySymbol = "SR",
            category = Categories.REAL_STATE,
            status = Staus.COMPLETED
        ),
        AuctionCardModel(
            title = "Dardery Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_three,
            itemCount = 12,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.VEGETABLES_AND_FRUITS,
            status = Staus.COMPLETED
        ),
        AuctionCardModel(
            title = "Mazad Mogan",
            date = "2 Jun 2023",
            imageUrl = Res.drawable.auction_card_image_test_two,
            itemCount = 20,
            moneyAmount = "1,050,000",
            auctionTime = "1h 49m 5s",
            currencySymbol = "SR",
            category = Categories.CARS,
            status = Staus.COMPLETED
        ),
    )
}