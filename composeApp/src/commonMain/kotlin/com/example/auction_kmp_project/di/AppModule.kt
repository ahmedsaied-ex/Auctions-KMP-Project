package com.example.auction_kmp_project.di

import com.example.auction_kmp_project.data.dummyData.Explore
import com.example.auction_kmp_project.data.repository.ExploreRepositoryImpl
import com.example.auction_kmp_project.domain.repository.ExploreRepository
import com.example.auction_kmp_project.domain.useCase.CategoryCardUseCase
import com.example.auction_kmp_project.presentation.explore.viewModel.CategoryCardViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    //Repositories
    singleOf(::ExploreRepositoryImpl) bind ExploreRepository::class
//    singleOf(::AuctionsRepositoryImpl) bind AuctionsRepositoryImpl::class
    //UseCases
    singleOf(::CategoryCardUseCase)
    //ViewModels
    singleOf(::CategoryCardViewModel)



}