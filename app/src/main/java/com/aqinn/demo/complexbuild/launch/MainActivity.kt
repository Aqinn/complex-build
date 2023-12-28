package com.aqinn.demo.complexbuild.launch

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aqinn.demo.complexbuild.R
import com.aqinn.demo.complexbuild.lb.Utils_lb
import com.aqinn.demo.complexbuild.ma.Utils_ma

/**
 * Created by AllanZhong on 2023/5/26.
 */
class MainActivity : AppCompatActivity() {
    lateinit var tvMain: TextView
    lateinit var tv1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMain = findViewById(R.id.tv_main)
        tv1 = findViewById(R.id.tv_1)
        tvMain.text = Utils_ma.test_一直调其它module()
        tv1.text = "lb.version=${Utils_lb.version()}"

//        Utils_lb.add(1, 2)

    }
}