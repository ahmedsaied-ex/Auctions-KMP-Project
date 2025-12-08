package com.example.auction_kmp_project.di

import com.example.auction_kmp_project.data.repository.ExploreRepositoryImpl
import com.example.auction_kmp_project.domain.repository.ExploreRepository
import com.example.auction_kmp_project.domain.useCase.CategoryCardUseCase
import com.example.auction_kmp_project.domain.useCase.CompletedAuctions
import com.example.auction_kmp_project.domain.useCase.OngoingAuctions
import com.example.auction_kmp_project.domain.useCase.UpComingAuctions
import com.example.auction_kmp_project.presentation.explore.viewModel.ExploreViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    //Repositories
    singleOf(::ExploreRepositoryImpl) bind ExploreRepository::class
//    singleOf(::AuctionsRepositoryImpl) bind AuctionsRepositoryImpl::class
    //UseCases
    singleOf(::CategoryCardUseCase)
    singleOf(::OngoingAuctions)
    singleOf(::UpComingAuctions)
    singleOf(::CompletedAuctions)

    //ViewModels
    singleOf(::ExploreViewModel)



}