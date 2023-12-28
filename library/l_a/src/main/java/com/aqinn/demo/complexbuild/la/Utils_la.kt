package com.aqinn.demo.complexbuild.la

import com.aqinn.demo.complexbuild.lb.Utils_lb

/**
 * Created by AllanZhong on 2023/5/26.
 */
object Utils_la {
    fun test_一直调其它module(): String? {
        return "la, lb.version[${Utils_lb.version()}]" + Utils_lb.test_一直调其它module()// + Utils_lb.test_一直调其它module_1()
    }
}