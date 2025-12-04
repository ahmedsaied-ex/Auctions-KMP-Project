package com.example.auction_kmp_project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform