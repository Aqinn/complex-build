package com.aqinn.demo.complexbuild.mtest

import android.os.Bundle
import android.view.ViewStub
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TestLayoutActivity : AppCompatActivity() {

    private lateinit var vs_test: ViewStub
    private lateinit var tv_main: TextView
    private lateinit var test_view: TestView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_layout)

        bindView()
        initView()
    }

    private fun bindView() {
        vs_test = findViewById(R.id.vs_test)
        tv_main = findViewById(R.id.tv_main)
        test_view = findViewById(R.id.test_view)
    }

    private fun initView() {
        vs_test.inflate()
        vs_test.setBackgroundResource(R.drawable.test_background)
//        tv_main.textSize = 10F  // 这行不要解开注释，不然会让test_view里的tv_main字体大小改变。这里留个疑问，findViewById一个页面中非唯一时，是找的第一个吗？
    }

}