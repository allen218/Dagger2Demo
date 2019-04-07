package com.allen.testdagger2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.allen.testdagger2.other.MemoryResource
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var netResource: NetResource
    @Inject
    lateinit var localResource: LocalResource
    @Inject
    lateinit var memoryResource: MemoryResource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as RootApp).resourceComponent.injectMainActivity(this)

        Log.i("TAG", "resource:$netResource, hashcode: ${netResource.hashCode()}")
        Log.i("TAG", "localResource:$localResource, hashcode: ${localResource.hashCode()}")
        Log.i("TAG", "resource:$memoryResource, hashcode: ${memoryResource.hashCode()}")
    }
}