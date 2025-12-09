package com.example.auction_kmp_project.domain.models

import org.jetbrains.compose.resources.DrawableResource

data class AuctionItemCardModel(
    val title: String,
    val date: String,
    val imageUrl: DrawableResource,
    val moneyAmount: String,
    val remainTime: String,
    val status: String,
    val startTime: String,


    )