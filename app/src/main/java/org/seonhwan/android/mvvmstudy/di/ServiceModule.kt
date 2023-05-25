package org.seonhwan.android.mvvmstudy.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.seonhwan.android.mvvmstudy.data.service.ExampleService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Provides
    @Singleton
    fun getPostService(retrofit: Retrofit): ExampleService =
        retrofit.create(ExampleService::class.java)
}