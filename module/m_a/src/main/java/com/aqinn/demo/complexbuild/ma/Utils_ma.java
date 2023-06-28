package com.aqinn.demo.complexbuild.ma;

import com.aqinn.demo.complexbuild.delegate.ConvUtils;

/**
 * Created by AllanZhong on 2023/6/2.
 */
public class Utils_ma {

    public static String test_ma() {
        return ConvUtils.test(1, 10) + ", " + ConvUtils.test1(1);
    }

}
