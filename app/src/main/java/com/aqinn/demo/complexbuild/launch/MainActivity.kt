package com.aqinn.demo.complexbuild.launch

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aqinn.demo.complexbuild.R
import com.aqinn.demo.complexbuild.delegate.ConvUtils
import com.aqinn.demo.complexbuild.ma.Utils_ma

/**
 * Created by AllanZhong on 2023/5/26.
 */
class MainActivity : AppCompatActivity() {
    lateinit var tvMain: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMain = findViewById(R.id.tv_main)
        tvMain.text = Utils_ma.test_ma()
//        Utils_lb.add(1, 2)

    }
}