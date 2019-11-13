package com.alexandre.apigithub.data.interfaces

import com.alexandre.apigithub.data.response.GitHubBodyResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHub {
    @GET("search/repositories")
    suspend fun search(
        @Query("q") query: String = "kotlin",
        @Query("sort") sort: String = "stars",
        @Query("page") page: Int = 1
    ): retrofit2.Response<GitHubBodyResponse>

}