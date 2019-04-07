package com.allen.testdagger2.other

import dagger.Component
import javax.inject.Singleton

/**
 * Created by allen on 19/4/8.
 */
@Component(modules = [MemoryModule::class])
@Singleton
interface MemoryResourceComponent {
    fun provideMemoryResource(): MemoryResource
}