package com.kanlulu.kotlin01.coroutine

import android.widget.TextView
import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import okhttp3.Request

/**
 * author:kanlulu
 * data  :2020-02-06 14:27
 **/
class CoroutineRequest {
    private val okHttpClient = OkHttpClient()
    private val request = Request.Builder().url("https://baidu.com").get().build()

    fun display(textView: TextView) = runBlocking {
        launch {
            textView.text = async() {
                okHttpClient.newCall(request).execute().body()?.string()
            }.await()
        }
    }
}