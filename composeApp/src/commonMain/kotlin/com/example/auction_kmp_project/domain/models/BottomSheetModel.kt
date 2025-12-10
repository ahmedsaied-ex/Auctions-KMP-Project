package com.example.auction_kmp_project.domain.models

data class BottomSheetModel (
val name: String,
val initial: String?,
val amountMoney: String,
val time: String,
val isAnonymous: Boolean = false
)