package com.example.booksearchapp.data.api

import com.example.booksearchapp.data.model.SearchResponse
import com.example.booksearchapp.util.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface BookSearchApi {

    @Headers("Authorization: KakaoAK $API_KEY") // 인증에 필요한 headers
    @GET("v3/search/book") // 요청에 필요한 주소
    suspend fun searchBooks(
        @Query("query") query: String, // 파라미터는 모두다 @Query로 정의
        @Query("sort") sort: String,
        @Query("page") page: Int,
        @Query("size") size: Int,
    ): Response<SearchResponse>
}