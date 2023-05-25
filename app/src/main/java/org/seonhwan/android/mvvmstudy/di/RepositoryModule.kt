package org.seonhwan.android.mvvmstudy.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.seonhwan.android.mvvmstudy.data.repository.ExampleRepositoryImpl
import org.seonhwan.android.mvvmstudy.domain.repository.ExampleRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindExampleRepository(
        exampleRepositoryImpl: ExampleRepositoryImpl,
    ): ExampleRepository
}
