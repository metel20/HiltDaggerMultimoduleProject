package com.metel20.hiltdaggermultimoduleproject

import com.metel20.data.BaseRepository
import com.metel20.domain.QuoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MainModule {

    @Binds
    abstract fun provideRepository(impl: BaseRepository): QuoteRepository
}