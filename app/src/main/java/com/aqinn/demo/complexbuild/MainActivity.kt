package com.aqinn.demo.complexbuild

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by AllanZhong on 2023/5/26.
 */
class MainActivity : AppCompatActivity() {
    lateinit var tvMain: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        tvMain = findViewById(R.id.tv_main)
        tvMain.text = getString(R.string.string_lb)
//        Utils_lb.add(1, 2)
    }
}