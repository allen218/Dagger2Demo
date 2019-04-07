package com.allen.testdagger2

import com.allen.testdagger2.other.MemoryResourceComponent
import com.allen.testdagger2.scope.ActivityScope
import dagger.Component

/**
 * attention:
 *      1. 依赖关系中的多个 component 之间的 scope 不能相同
 *      2. singleton 组件不能依赖自定义scope, 自定义 scope 可以依赖 singleton
 *      3. 没有 scope 的组件不能依赖有 scope 的 component, 有 scope 的组件可以依赖没有 scope 的组件
 *
 * Created by allen on 19/4/7.
 */
@Component(modules = [LocalModule::class, NetModule::class], dependencies = [MemoryResourceComponent::class])
@ActivityScope
interface ResourceComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}