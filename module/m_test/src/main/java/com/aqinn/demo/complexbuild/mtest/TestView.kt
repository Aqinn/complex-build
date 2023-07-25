package com.aqinn.demo.complexbuild.mtest

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout

class TestView : RelativeLayout {
    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        LayoutInflater.from(getContext()).inflate(R.layout.test_view_layout, this, true)
    }
}