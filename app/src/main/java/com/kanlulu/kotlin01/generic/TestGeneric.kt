package com.kanlulu.kotlin01.generic

import com.kanlulu.kotlin01.Utils

/**
 * author:kanlulu
 * data  :2020-02-05 17:48
 * 泛型
 *
 * where T 表示 T必须继承自Callback  和 Runnable
 **/
class TestGeneric<T> where T : com.kanlulu.kotlin01.generic.Callback, T : java.lang.Runnable {

    internal fun test01() {

    }

    /**
     * 真泛型 reified 只能用于函数 不能用于类
     */
    inline fun <reified T> test02(t:T) : T = t
}

class A : B(), Callback {
    override fun callback() {
        Utils.printInfo("callback")
    }
}

open class B : Runnable {
    override fun run() {
        Utils.printInfo("run")
    }
}

interface Callback {
    fun callback()
}