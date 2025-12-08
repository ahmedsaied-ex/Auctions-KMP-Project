package com.example.auction_kmp_project.di

import com.example.auction_kmp_project.data.repository.AuctionsRepositoryImpl
import com.example.auction_kmp_project.data.repository.ExploreRepositoryImpl
import com.example.auction_kmp_project.domain.repository.ExploreRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    singleOf(::ExploreRepositoryImpl) bind ExploreRepository::class
    singleOf(::AuctionsRepositoryImpl) bind AuctionsRepositoryImpl::class

}