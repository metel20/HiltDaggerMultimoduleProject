package com.metel20.data

import retrofit2.http.GET

interface AnimeQuoteService {
    @GET("api/random")
    suspend fun animeQuote(): AnimeQuoteCloud
}