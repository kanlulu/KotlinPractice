package com.kanlulu.kotlin01.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * author:kanlulu
 * data  :2020-02-06 11:36
 **/
class TestCoroutine {

    public fun test01() = runBlocking<Unit> {
        val job = launch {
            repeat(1000) {
                println("挂起中 $it")
                delay(500L)
            }
        }

        val job2 = async {
            delay(500L)
            return@async "hello async"
        }

        println("job2的输出async -- await：${job2.await()}")

        delay(1300L)
        println("main:: 主线程等待中...")
        job.cancel()
        println("main:: 即将完成退出")
    }
}