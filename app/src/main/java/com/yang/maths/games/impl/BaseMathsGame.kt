package com.yang.maths.games.impl

import com.yang.maths.games.bean.Bean
import java.lang.IllegalArgumentException

abstract class BaseMathsGame{
    var allCalcData = mutableListOf<Bean>()
    var currentCalc:Bean? = null
    var count = 0
    var position = 0
    lateinit var context:MathsContext
    fun getNext(): String {
        if (count <= position){
            throw IllegalArgumentException("Illegal Argument index = $position count = $count") as Throwable
        }
        position++
        currentCalc = context.generate()
        currentCalc?.let {
            allCalcData.add(it)
        }
        return  currentCalc?.calcContent?:""
    }

}