package com.allen.testdagger2

import com.allen.testdagger2.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by allen on 19/4/7.
 */
@Module
class NetModule {
    @ActivityScope
    @Provides
    fun provideNetResource(): NetResource {
        return NetResource("net resource")
    }
}