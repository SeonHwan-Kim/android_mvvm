package org.seonhwan.android.mvvmstudy.data.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.seonhwan.android.mvvmstudy.domain.entity.ExampleEntity

@Serializable
data class ExampleResponseDto(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val title: String,
    @SerialName("content")
    val content: String,
    @SerialName("tmi_1")
    val tmi1: String,
    @SerialName("tmi_2")
    val tmi2: String,
    @SerialName("tmi_3")
    val tmi3: String,
) {
    // data model -> domain entity 변환 메서드
    fun toExampleEntity() = ExampleEntity(
        id = id,
        title = title,
        content = content,
    )
}
