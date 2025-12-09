package com.example.auction_kmp_project.domain.useCase

import com.example.auction_kmp_project.domain.repository.AuctionsRepository

class TabsUseCase (private val repository: AuctionsRepository){
    suspend operator fun invoke(): List<String> =repository.getTabs()
}