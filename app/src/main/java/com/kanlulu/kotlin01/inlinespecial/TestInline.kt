package com.kanlulu.kotlin01.inlinespecial

import com.kanlulu.kotlin01.Utils

/**
 * author:kanlulu
 * data  :2020-02-05 16:32
 **/
class TestInline {

    public fun test01() {
        Utils.printInfo("hello1")
        testInline1 {
            Utils.printInfo("hello crossinline01")
            return@testInline1
            Utils.printInfo("hello crossinline02")
        }

        Utils.printInfo("hello2")

        testInline2({
            Utils.printInfo("inline l0")
        },{
            Utils.printInfo("inline noinline lambda")
        })
    }

    /**
     * inline的lambda可以中断外部函数的调用  即return之后后面的都不运行了
     * crossinline不允许inline的lambda中断外部函数执行  仅return了lambda后面的代码
     */
    private inline fun testInline1(crossinline l: () -> Unit) {
        l.invoke()
        return
    }

    /**
     * noinline拒绝内联  有返回值的lambda 不会取代函数的返回
     * 如果不加 调用的函数test01 的返回会变成 ()->Unit
     */
    private inline fun testInline2(l0:()->Unit,noinline l: () -> Unit): () -> Unit {
        l0.invoke()
        l.invoke()
        return l
    }
}