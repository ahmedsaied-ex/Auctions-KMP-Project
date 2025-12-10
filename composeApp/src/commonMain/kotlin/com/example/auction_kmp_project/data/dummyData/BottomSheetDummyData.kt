package com.example.auction_kmp_project.data.dummyData

import com.example.auction_kmp_project.domain.models.BottomSheetModel

object BottomSheet {
    val BottomSheetItems: List<BottomSheetModel> = listOf(
        BottomSheetModel("Ahmed Elhadabi", "AE", " 238,500", "24 May, 2023 at 1:59:57 PM"),
        BottomSheetModel("Salman Ahmed", "SA", " 235,000", "24 May, 2023 at 1:20:00 PM"),
        BottomSheetModel("You", "YM", " 233,500", "24 May, 2023 at 1:10:15 PM"),
        BottomSheetModel(
            "Aonymous Bidder", null, " 232,000", "24 May, 2023 at 1:05:30 PM", isAnonymous = true
        ),
        BottomSheetModel("Hazem Elwakil", "HE", " 230,500", "24 May, 2023 at 1:01:30 PM"),

    )


}