package com.aqinn.demo.complexbuild.lb

/**
 * Created by AllanZhong on 2023/5/26.
 */
object Utils_lb {
    fun version() = 1

    fun add(a: Int, b: Int) = a + b

    fun test_一直调其它module(): String? {
        return "lb"
    }

    fun test_一直调其它module_1(): String? {
        return "lb"
    }
}