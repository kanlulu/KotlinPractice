package com.kanlulu.kotlin01.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kanlulu.kotlin01.R
import com.kanlulu.kotlin01.Utils
import com.kanlulu.kotlin01.companion.TestCompanion
import com.kanlulu.kotlin01.coroutine.TestCoroutine
import com.kanlulu.kotlin01.extendfunc.TestExtend
import com.kanlulu.kotlin01.inlinespecial.TestInline
import com.kanlulu.kotlin01.list.TestKotlinList
import com.kanlulu.kotlin01.loop.TestKotlinLoop
import com.kanlulu.kotlin01.operator.TestOperator
import com.kanlulu.kotlin01.scopefunc.TestScopeFunc
import com.kanlulu.kotlin01.varvalue.TestVarValue

class MainActivity : AppCompatActivity() {
    var age: Int = 18
    var name: String = "kan lulu"
    var name2: String? = null

    //扩展函数
    private fun TestExtend.testExtend(string: String, context: Context) =
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()

    //闭包声明（申明函数对象）  上面这个是下面的完整写法
//    val testLambda : (String)->Unit = {name:String -> Toast.makeText(this,name,Toast.LENGTH_SHORT).show()}
    private val testLambda =
        { name: String -> Toast.makeText(this, name, Toast.LENGTH_SHORT).show() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    /**
     * 匿名函数
     * JvmStatic
     */
    fun showToast(view: View) {
        Utils.message("kotlin 单例/匿名内部类", this)
    }

    /**
     * 扩展函数
     */
    fun extendFunc(view: View) {
//        fun TestExtend.testExtend(string: String, context: Context)= Toast.makeText(context,string,Toast.LENGTH_SHORT).show()
        val testExtend = TestExtend()
        testExtend.testExtend("扩展函数", this)
    }

    /***************高阶函数 start******************/
    /**
     * 高阶函数
     * 函数的入参是函数(lambda)
     */
    fun testHighFunc(view: View) {
        testHighFunc01(true, testLambda)
    }

    /**
     * 高阶函数
     * inline关键字 减少创建不必要的对象
     * 过度的使用增加编译器的编译负担，代码块变得庞大；因此我们通常只在高阶函数时使用
     * inline修饰的函数又叫内联函数
     */
    private inline fun testHighFunc01(isShow: Boolean, testLambda: (String) -> Unit) {
        if (isShow) {
            testLambda("高阶函数")
        }
    }
    /***************高阶函数 end******************/

    /**
     * 伴生对象
     */
    fun companionTest(view: View) {
        if (TestCompanion.isEmpty("")) Toast.makeText(this, "伴生对象！！！", Toast.LENGTH_SHORT).show()
    }

    /**
     * 解构
     */
    fun jiegou(view: View) {
        val testOperator = TestOperator()
//        testOperator.test01(this)
        testOperator.test02(this)
    }

    /**
     * 循环
     */
    fun testLoop(view: View) {
        val testLoop = TestKotlinLoop(this)
//        testLoop.test01()
//        testLoop.test02()
//        testLoop.test03()
//        testLoop.test04()
        testLoop.test05()
    }

    /**
     * 集合操作符
     */
    fun testListOperate(view: View) {
        val listOperate = TestKotlinList(this)

//        listOperate.test01()
        listOperate.test02()
    }

    /**
     * 作用域函数
     */
    fun testScopeFunc(view: View) {
        val scopeFunc = TestScopeFunc(this)
        scopeFunc.test01()
    }

    /**
     * 运算符重载  中缀表达式
     */
    fun testOperatorOverride(view: View) {
        //中缀表达式
//        val operatorOverride = TestOperatorOverride(this)
//        operatorOverride.test01()

        //var val
//        testVarValue()

        //内联函数 return  crossinline  noinline
//        testInlineSep()

        //协程
        testCoroutine()
    }

    /**
     * var val
     */
    fun testVarValue() {
        val testVarValue = TestVarValue()
        testVarValue.test01()
    }

    fun testInlineSep() {
        val testInline = TestInline()
        testInline.test01()
    }

    fun testCoroutine() {
        val testCoroutine = TestCoroutine()
        testCoroutine.test01()
    }

    /**
     * 跳转SecondActivity
     */
    fun jumpToSecondActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

}
