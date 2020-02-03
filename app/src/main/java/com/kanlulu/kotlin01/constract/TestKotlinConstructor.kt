package com.kanlulu.kotlin01.constract

/**
 * author:kanlulu
 * data  :2020-02-03 15:30
 * 在kotlin中创建的类默认是final的，如果我们要它可以被继承需要手动修改open
 **/
open class TestKotlinConstructor
    //主构造函数
    (var name: String) {

    //在主构造函数中运行
    init {

    }

    //次级构造函数
    //次级构造函数必须继承主构造函数或父类构造函数
    constructor(name: String,age:Int) : this(name) {

    }

}