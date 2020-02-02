package com.kanlulu.kotlin01

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kanlulu.kotlin01.extendfun.TestExtend

class MainActivity : AppCompatActivity() {
    var age:Int = 18
    var name:String = "kan lulu"
    var name2:String? = null

    //扩展函数
    private fun TestExtend.testExtend(string: String, context: Context)= Toast.makeText(context,string,Toast.LENGTH_SHORT).show()

    //闭包声明（申明函数对象）  上面这个是下面的完整写法
//    val testLambda : (String)->Unit = {name:String -> Toast.makeText(this,name,Toast.LENGTH_SHORT).show()}
    private val testLambda = {name:String -> Toast.makeText(this,name,Toast.LENGTH_SHORT).show()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    /**
     * 匿名函数
     * JvmStatic
     */
    fun showToast(view: View) {
        Utils.Test.message("kotlin 单例/匿名内部类",this)
    }

    /**
     * 扩展函数
     */
    fun extendFunc(view: View) {
//        fun TestExtend.testExtend(string: String, context: Context)= Toast.makeText(context,string,Toast.LENGTH_SHORT).show()
        val testExtend = TestExtend()
        testExtend.testExtend("扩展函数",this)
    }

    /***************高阶函数 start******************/
    /**
     * 高阶函数
     * 函数的入参书函数(lambda)
     */
    fun testHighFunc(view: View) {
        testHighFunc01(true,testLambda)
    }

    /**
     * 高阶函数
     */
    private fun testHighFunc01(isShow: Boolean,testLambda: (String) -> Unit){
        if (isShow) {
            testLambda("高阶函数")
        }
    }
    /***************高阶函数 end******************/


}