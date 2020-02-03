package com.kanlulu.kotlin01.operator

/**
 * author:kanlulu
 * data  :2020-02-03 16:52
 **/
class User(var age:Int,var name:String) {
    /**
     * operator：将一个函数标记为 重载一个操作符 或 实现一个约定
     * componentX()是固定的不可改成其他的名字
     */
    operator fun component1() = age
    operator fun component2() = name
    operator fun component3() = name
}