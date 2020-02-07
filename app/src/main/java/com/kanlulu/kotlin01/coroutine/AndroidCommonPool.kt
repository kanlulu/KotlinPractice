package com.kanlulu.kotlin01.coroutine

import android.os.AsyncTask
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import kotlin.coroutines.CoroutineContext

/**
 * author:kanlulu
 * data  :2020-02-06 15:50
 **/
class AndroidCommonPool:CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        AsyncTask.THREAD_POOL_EXECUTOR.execute(block)
    }
}