package com.example.auction_kmp_project.data.repository

import com.example.auction_kmp_project.data.dummyData.BottomSheet
import com.example.auction_kmp_project.domain.models.BottomSheetModel
import com.example.auction_kmp_project.domain.repository.BottomSheetRepository

class BottomSheetRepositoryImpl: BottomSheetRepository  {
    override suspend fun getItems(): List<BottomSheetModel> {
        return BottomSheet.BottomSheetItems

    }


}