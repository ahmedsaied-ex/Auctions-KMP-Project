package com.example.auction_kmp_project.domain.repository

import com.example.auction_kmp_project.domain.models.BottomSheetModel

interface BottomSheetRepository {
    suspend fun getItems(): List<BottomSheetModel>

}