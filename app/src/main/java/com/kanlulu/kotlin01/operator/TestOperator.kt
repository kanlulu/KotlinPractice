package com.kanlulu.kotlin01.operator

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * author:kanlulu
 * data  :2020-02-03 16:58
 **/
class TestOperator {

    public fun test01(context: Context) {
        val user = User(100, "name")
        //按照顺序 分别对应component1和component2
        val (age, name,nname) = user
        Toast.makeText(context, "$name ==  $age == $nname", Toast.LENGTH_SHORT).show()
    }

    /**
     * 解构的实例应用
     */
    public fun test02(context: Context){
        val map = mapOf<String,String>("key" to "key" , "value" to "value")
        for ((k,v) in map){
            Log.e("test-operator","$k--$v")
        }
    }
}