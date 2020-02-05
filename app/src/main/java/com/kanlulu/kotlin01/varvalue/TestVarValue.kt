package com.kanlulu.kotlin01.varvalue

import com.kanlulu.kotlin01.Utils
import java.util.*

/**
 * author:kanlulu
 * data  :2020-02-05 15:24
 * var 与 val 声明的变量最本质的区别是：val不能有set
 **/
class TestVarValue {
    private var birthYear =  1992

    private var string:String? = null
    get() {
        return field + "get -- var"
    }
    set(value) {
        field = value + "set -- var"
    }

    //val 不可变得变量  要想改变可以通过重写get方法实现
    private val age:Int?
    get() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear
    }

    //编译时常量 const 声明常量


    public fun test01(){
        //var
        string = "kanlulu"
        Utils.printInfo(string!!)

        //val
        Utils.printInfo("age：$age")
        oneYearsLater()
        Utils.printInfo("age：$age")
    }

    private fun oneYearsLater(){
        birthYear--
    }
}