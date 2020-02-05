package com.kanlulu.kotlin01.operatoroverride

/**
 * author:kanlulu
 * data  :2020-02-05 11:24
 * 密闭类  类似与java中的枚举
 **/
sealed class CompareResult {
    object LESS : CompareResult() {
        override fun toString(): String {
            return "小于"
        }
    }

    object MORE : CompareResult() {
        override fun toString(): String {
            return "大于"
        }
    }

    object EQUAL : CompareResult() {
        override fun toString(): String {
            return "等于"
        }
    }
}