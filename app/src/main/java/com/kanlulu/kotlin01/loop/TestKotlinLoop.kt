package com.kanlulu.kotlin01.loop

import android.content.Context
import android.util.Log

/**
 * author:kanlulu
 * data  :2020-02-03 17:35
 * 循环
 **/
class TestKotlinLoop(private val context: Context) {

    public fun test01() {
        for (i in 1..10){
//        for (i in 1 until 10){
            Log.e("loop","loop -- $i")
        }
    }

    public fun test02(){
        //i in 10..1 不能这么写
        for (i in 10 downTo 1){
            Log.e("loop","loop -- $i")
        }
    }

    public fun test03(){
        //相当于java中的 for（int i=1;i<=10;i++）
        //如果step 2 相当于 i+2
        for (i in 1..10 step 1){
            Log.e("loop","loop -- $i")
        }
    }

    public fun test04(){
        //从0开始  repeat是一个高阶函数
        repeat(10){
            Log.e("loop","loop -- $it")
        }
    }

    public fun test05(){
        val list = arrayListOf<String>("1","2","3","4","5")
            //普通写法 不需要index时
//        for (str in list){
//            Log.e("loop",str)
//        }

        //需要index时 通过解构的方式来遍历
        for ((index,str) in list.withIndex()){
            Log.e("loop", "$index  --  $str")
        }
    }
}