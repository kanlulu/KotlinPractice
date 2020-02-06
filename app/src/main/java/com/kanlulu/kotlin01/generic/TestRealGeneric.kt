package com.kanlulu.kotlin01.generic

/**
 * author:kanlulu
 * data  :2020-02-05 18:05
 * 使类具有真泛型的功能
 **/
class TestRealGeneric<T>(val clazz: Class<T>) {

    val presenter by lazy { clazz.newInstance() }

    companion object {
        /**
         * inline：不能省略 必须在编译期知道T的类型，如此才能实现真泛型
         * reified: 只能修饰函数 不能修饰类
         * operator：重载一个操作符 在这里相当于重载了主构造函数
         */
        inline operator fun <reified T> invoke() = TestRealGeneric(T::class.java)
    }

}

class Presenter {
    override fun toString(): String {
        return "类的真泛型"
    }
}

fun testResult() {
    val generic1 = TestRealGeneric.Companion.invoke<Presenter>().presenter
    val generic2 = TestRealGeneric<Presenter>().presenter
}