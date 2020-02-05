package com.kanlulu.kotlin01.operatoroverride

import android.content.Context
import com.kanlulu.kotlin01.Utils

/**
 * author:kanlulu
 * data  :2020-02-05 11:01
 * 运算符重载 中缀表达式
 **/
class TestOperatorOverride(private val context: Context) {
    init {

    }

    fun test01() {
        Utils.printInfo((5 vs 6).toString())
    }

    /**
     * 声明一个中缀函数
     * 注意:
     * 一个函数只有用于两个角色类似的对象时才将其声明为中缀函数
     * 如add  两个数相加  不要适用
     * 一个方法会改动其接收者，那么不要声明为中缀表达式
     * 接收者 指 5 vs 6 中的5 即 Int.vs中的Int
     *
     */
    private infix fun Int.vs(num: Int): CompareResult {
        if (this - num > 0) {
            return CompareResult.MORE
        } else if (this - num < 0) {
            return CompareResult.LESS
        } else {
            return CompareResult.EQUAL
        }
    }


}