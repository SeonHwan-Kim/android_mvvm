package org.seonhwan.android.mvvmstudy.data.repository

import org.seonhwan.android.mvvmstudy.data.model.request.ExampleRequestDto
import org.seonhwan.android.mvvmstudy.data.source.ExampleDataSource
import org.seonhwan.android.mvvmstudy.domain.entity.ExampleEntity
import org.seonhwan.android.mvvmstudy.domain.repository.ExampleRepository
import javax.inject.Inject

// data repository : UI와 데이터 소스 간의 상호작용 구현 (domain repository 구현체)
class ExampleRepositoryImpl @Inject constructor(
    private val exampleDataSource: ExampleDataSource,
) : ExampleRepository {
    override suspend fun getExample(): Result<ExampleEntity?> =
        runCatching {
            exampleDataSource.getExample().toExampleEntity()
        }
}
