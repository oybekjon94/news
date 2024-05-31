package com.oybekdev.news.di

import android.app.Application
import com.oybekdev.news.data.manager.LocalUserManagerImpl
import com.oybekdev.news.domain.manager.LocalUserManager
import com.oybekdev.news.domain.usecases.AppEntryUserCases
import com.oybekdev.news.domain.usecases.ReadAppEntry
import com.oybekdev.news.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ):LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUserCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}