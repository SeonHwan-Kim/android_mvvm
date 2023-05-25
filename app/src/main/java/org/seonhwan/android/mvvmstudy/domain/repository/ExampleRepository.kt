package org.seonhwan.android.mvvmstudy.domain.repository

import org.seonhwan.android.mvvmstudy.data.model.request.ExampleRequestDto
import org.seonhwan.android.mvvmstudy.domain.entity.ExampleEntity

// domain repository : UI와 데이터 소스의 상호작용에 대해 인터페이스 제공
interface ExampleRepository {
    suspend fun getExample(): Result<ExampleEntity?>
}
