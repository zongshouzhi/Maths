package com.yang.maths.home.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.yang.maths.R
import com.yang.maths.base.BaseActivity

class GameContentActivity :BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_game)
    }
}