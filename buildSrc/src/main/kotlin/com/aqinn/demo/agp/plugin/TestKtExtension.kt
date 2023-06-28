package com.aqinn.demo.agp.plugin

abstract class TestKtExtension {

    var arg1: Int = 0
    var arg2: Float = 0.0F
    var arg3: String = ""
    var arg4: IntArray = intArrayOf()
    var arg5: List<String> = emptyList()

    override fun toString(): String {
        return "TestKtExtension(arg1=$arg1, arg2=$arg2, arg3='$arg3', arg4=${arg4.contentToString()}, arg5=$arg5)"
    }
}