package com.kanlulu.kotlin01

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast


/**
 * author:kanlulu
 * data  :2019-12-23 22:05
 **/
class Utils {

    companion object Test {
        @JvmStatic
        public fun message(string: String, context: Context) {
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
        }

        @JvmStatic
        public fun showToast(str:String,context: Context){
            Toast.makeText(context,str,Toast.LENGTH_SHORT).show()
        }

        @JvmStatic
        public fun printInfo(str: String){
            Log.e("=test=",str)
        }
    }
}