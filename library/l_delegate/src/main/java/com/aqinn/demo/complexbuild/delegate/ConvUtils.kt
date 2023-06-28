package com.aqinn.demo.complexbuild.delegate

/**
 * Created by AllanZhong on 2023/6/2.
 */
class ConvUtils {

    companion object {
        @JvmStatic
        fun test(a: Int, b: Int) = "from_delegate"
        @JvmStatic  // 把这行注释掉，编译就会报错。因为compileOnly依赖delegate模块
        fun test1(a: Int) = "from_delegate"
    }

}