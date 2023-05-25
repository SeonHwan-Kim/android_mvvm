package org.seonhwan.android.mvvmstudy.data.service

import org.seonhwan.android.mvvmstudy.data.model.response.ExampleResponseDto
import retrofit2.http.GET

// Data Service : 외부 서비스와 통신하기 위한 인터페이스(API) 포함
interface ExampleService {
    @GET("example/api")
    suspend fun getExample(): ExampleResponseDto
}
