package com.example.booksearchapp.data.repository

import androidx.paging.PagingData
import com.example.booksearchapp.data.model.Book
import com.example.booksearchapp.data.model.SearchResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface BookSearchRepository {
    suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int,
    ): Response<SearchResponse>

    suspend fun insertBooks(book: Book)

    suspend fun deleteBooks(book: Book)

    fun getFavoriteBooks(): Flow<List<Book>>

    suspend fun saveSortMode(mode: String)

    suspend fun getSortMode(): Flow<String>

    suspend fun saveCacheDeleteMode(mode: Boolean)

    suspend fun getCacheDeleteMode(): Flow<Boolean>
    
    fun getFavoritePagingBooks(): Flow<PagingData<Book>>

    fun searchBookPaging(query: String, sort: String): Flow<PagingData<Book>>
}