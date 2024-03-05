package com.metel20.hiltdaggermultimoduleproject

import com.metel20.data.AnimeQuoteService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    fun provideService(): AnimeQuoteService =
        Retrofit.Builder().baseUrl("https://animechan.xyz/")
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(AnimeQuoteService::class.java)
}