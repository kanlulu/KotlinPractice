package com.kanlulu.kotlin01.scopefunc

import android.content.Context
import com.kanlulu.kotlin01.Utils
import com.kanlulu.kotlin01.operator.User

/**
 * author:kanlulu
 * data  :2020-02-04 16:07
 * 作用域函数
 **/
class TestScopeFunc(private val context: Context) {
    init {

    }

    public fun test01() {
        val user = User(28, "kanlulu")

        /**
         * let与run都会返回闭包的执行结果
         * 区别在于let有闭包参数，而run没有闭包参数
         */
        //只有一个闭包参数可以省略  直接使用it 代替 {it.name}
        val letResult = user.let { user -> user.name }

        val runResult = user.run { this.age }

        Utils.printInfo("letResult：$letResult")
        Utils.printInfo("runResult：$runResult")


        /**
         * also与apply都不返回闭包的执行结果
         * 区别在于also有闭包参数，而apply没有闭包参数
         * 通常用于一系列的链式操作
         */
        user
            .also { Utils.printInfo("also ${it.name}") }
            .apply { Utils.printInfo("apply ${this.age}") }

        /**
         * takeIf与takeUnless
         * takeIf的闭包返回一个判断结果 false:takeIf函数返回空，true:返回调用takeIf的对象
         * takeUnless和takeIf相反
         */
        user.takeIf { "" != it.name }?.also { Utils.printInfo("takeIf 姓名：${it.name}") }
            ?: Utils.printInfo(
                "takeIf null name"
            )

        user.takeUnless { "" != it.name }?.also { Utils.printInfo("takeUnless null name") }
            ?: Utils.printInfo("takeUnless 姓名：${user.name}")

        /**
         *可用于View公共参数设置
         */
        with(user){
            this.name = "with"
        }
        //类似于下面的效果
//        user.apply { this.name = "with" }

        Utils.printInfo("with：$user.name")
    }
}
