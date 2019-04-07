package com.allen.testdagger2

import android.app.Application
import com.allen.testdagger2.other.DaggerMemoryResourceComponent

/**
 * Created by allen on 19/4/7.
 */
class RootApp : Application() {

    lateinit var resourceComponent: ResourceComponent

    override fun onCreate() {
        super.onCreate()
        resourceComponent = DaggerResourceComponent.builder()
            .localModule(LocalModule())
            .netModule(NetModule())
            .memoryResourceComponent(DaggerMemoryResourceComponent.create())
            .build()
    }
}