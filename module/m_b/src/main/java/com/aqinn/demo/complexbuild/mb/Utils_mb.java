package com.aqinn.demo.complexbuild.mb;

import com.aqinn.demo.complexbuild.la.Utils_la;

/**
 * Created by AllanZhong on 2023/12/25.
 */
public class Utils_mb {

    public static String test_一直调其它module() {
        return "b, " + Utils_la.INSTANCE.test_一直调其它module();
    }

}
