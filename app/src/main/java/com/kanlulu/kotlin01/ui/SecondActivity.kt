package com.kanlulu.kotlin01.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kanlulu.kotlin01.R
import com.kanlulu.kotlin01.coroutine.CoroutineRequest
import kotlinx.android.synthetic.main.activity_second.*

/**
 * author:kanlulu
 * data  :2020-02-06 12:41
 **/
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn_request.setOnClickListener {
//            val dashboard = Dashboard()
//            dashboard.display(tv_request_content)

            val coroutine = CoroutineRequest()
            coroutine.display(tv_request_content)
        }
    }

}