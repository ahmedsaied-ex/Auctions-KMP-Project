package com.example.auction_kmp_project.di

import com.example.auction_kmp_project.data.repository.AuctionsRepositoryImpl
import com.example.auction_kmp_project.data.repository.BottomSheetRepositoryImpl
import com.example.auction_kmp_project.data.repository.CategoryRepositoryImpl
import com.example.auction_kmp_project.data.repository.ExploreRepositoryImpl
import com.example.auction_kmp_project.data.repository.ItemsRepositoryImpl
import com.example.auction_kmp_project.domain.repository.AuctionsRepository
import com.example.auction_kmp_project.domain.repository.BottomSheetRepository
import com.example.auction_kmp_project.domain.repository.CategoryRepository
import com.example.auction_kmp_project.domain.repository.ExploreRepository
import com.example.auction_kmp_project.domain.repository.ItemsRepository
import com.example.auction_kmp_project.domain.useCase.AuctionItemsCardsUseCase
import com.example.auction_kmp_project.domain.useCase.BottomSheetUseCase
import com.example.auction_kmp_project.domain.useCase.CategoriesUseCase
import com.example.auction_kmp_project.domain.useCase.CategoryCardUseCase
import com.example.auction_kmp_project.domain.useCase.CompletedAuctions
import com.example.auction_kmp_project.domain.useCase.OngoingAuctions
import com.example.auction_kmp_project.domain.useCase.TabsUseCase
import com.example.auction_kmp_project.domain.useCase.UpComingAuctions
import com.example.auction_kmp_project.presentation.auctions.viewModel.AuctionsViewModel
import com.example.auction_kmp_project.presentation.bottomSheet.viewModel.BottomSheetViewModel
import com.example.auction_kmp_project.presentation.explore.viewModel.ExploreViewModel
import com.example.auction_kmp_project.presentation.items.viewModel.ItemsViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    //Repositories
    singleOf(::ExploreRepositoryImpl) bind ExploreRepository::class
    singleOf(::ItemsRepositoryImpl) bind ItemsRepository::class
    singleOf(::AuctionsRepositoryImpl) bind AuctionsRepository::class
    singleOf(::CategoryRepositoryImpl) bind CategoryRepository::class
    singleOf(::BottomSheetRepositoryImpl) bind BottomSheetRepository::class

    //UseCases
    singleOf(::CategoryCardUseCase)
    singleOf(::AuctionItemsCardsUseCase)
    singleOf(::OngoingAuctions)
    singleOf(::UpComingAuctions)
    singleOf(::CompletedAuctions)
    singleOf(::CategoriesUseCase)
    singleOf(::TabsUseCase)
    singleOf(::BottomSheetUseCase)


    //ViewModels
    singleOf(::ExploreViewModel)
    singleOf(::ItemsViewModel)
    singleOf(::AuctionsViewModel)
    singleOf(::BottomSheetViewModel)



}