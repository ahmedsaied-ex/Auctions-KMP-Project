package com.example.auction_kmp_project.domain.useCase

import com.example.auction_kmp_project.domain.models.AuctionItemCardModel
import com.example.auction_kmp_project.domain.models.BottomSheetModel
import com.example.auction_kmp_project.domain.repository.BottomSheetRepository
import com.example.auction_kmp_project.domain.repository.ItemsRepository

class BottomSheetUseCase (private val repository: BottomSheetRepository) {
    suspend operator fun invoke(): List<BottomSheetModel> =repository.getItems()
}