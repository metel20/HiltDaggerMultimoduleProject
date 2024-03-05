package com.metel20.domain
//Boolean - success, String - data

interface QuoteRepository {

    suspend fun loadQuote(): Pair<Boolean,String>
}