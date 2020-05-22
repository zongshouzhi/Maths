package com.yang.maths.games.impl

import com.yang.maths.games.impl.strategy.SubtractionStrategy

class SubtractionGame :BaseMathsGame(){
    init {
        context = MathsContext(SubtractionStrategy())
    }
}