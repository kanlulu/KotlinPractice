package com.kanlulu.kotlin01.companion

/**
 * author:kanlulu
 * data  :2020-02-03 15:51
 **/
class TestCompanion {

    companion object{
        @JvmStatic
        fun isEmpty(content:String):Boolean{
            return  "" == content
        }

        //单例
        fun getInstance(): TestCompanion{
            return Holder.instance
        }
    }

    //Kotlin单例  kotlin使用推荐的单例写法
    private object Holder{
        val instance = TestCompanion()
    }

}