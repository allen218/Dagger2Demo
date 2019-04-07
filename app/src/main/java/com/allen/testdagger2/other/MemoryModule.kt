package com.allen.testdagger2.other

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by allen on 19/4/8.
 */
@Module
class MemoryModule {
    @Provides
    @Singleton
    fun provideMemoryRes(): MemoryResource {
        return MemoryResource("memoryResource")
    }
}