package com.kanlulu.kotlin01

import android.content.Context
import android.widget.Toast


/**
 * author:kanlulu
 * data  :2019-12-23 22:05
 **/
class Utils {

    object Test {
        @JvmStatic
        public fun message(string: String, context: Context) {
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
        }
    }
}