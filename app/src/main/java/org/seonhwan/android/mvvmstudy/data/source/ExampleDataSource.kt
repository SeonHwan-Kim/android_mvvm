package org.seonhwan.android.mvvmstudy.data.source

import org.seonhwan.android.mvvmstudy.data.model.response.ExampleResponseDto
import org.seonhwan.android.mvvmstudy.data.service.ExampleService
import javax.inject.Inject

// Data DataSource : 데이터베이스로부터 데이터를 가져오는 로직 포함
class ExampleDataSource @Inject constructor(
    private val exampleService: ExampleService,
) {
    suspend fun getExample(): ExampleResponseDto =
        exampleService.getExample()
}
