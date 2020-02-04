package com.kanlulu.kotlin01.list

import android.content.Context
import android.widget.Toast
import com.kanlulu.kotlin01.Utils

/**
 * author:kanlulu
 * data  :2020-02-04 10:36
 * Kotlin的集合操作符
 **/
class TestKotlinList(private val context: Context) {
    init {

    }

    public fun test01() {
        val list = arrayListOf<Char>('a', 'b', 'c', 'd')

        val a = list.map { it - 'a' }//改变数据类型  char -- >> int
            .filter { it > 0 }//返回符合过滤条件的所有元素
            .findLast { it > 1 }//返回符合条件的最后一个元素  find：返回第一个元素

        Utils.showToast("$a", context)

    }

    public fun test02() {
        val a = arrayOf("4", "0", "7", "i", "f", "w", "0", "9")
        val index = arrayOf(5, 3, 9, 4, 8, 3, 1,9, 2, 1, 7)

        index.filter { it < a.size }//过滤
            .map { a[it] }//转换
            .reduce { s, s2 -> "$s$s2" }//合并 两个元素合并成一个元素
            .also { Utils.showToast(it, context) }//结果
    }

}