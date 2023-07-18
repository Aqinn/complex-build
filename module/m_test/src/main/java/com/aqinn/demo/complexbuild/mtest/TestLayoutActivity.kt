package com.aqinn.demo.complexbuild.mtest

import android.os.Bundle
import android.view.ViewStub
import androidx.appcompat.app.AppCompatActivity

class TestLayoutActivity : AppCompatActivity() {

    private lateinit var vs_test: ViewStub

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_layout)

        bindView()
        initView()
    }

    private fun bindView() {
        vs_test = findViewById(R.id.vs_test)
    }

    private fun initView() {
        vs_test.inflate()
    }

}