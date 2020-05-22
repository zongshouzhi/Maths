package com.yang.maths.games.impl

import com.yang.maths.games.impl.strategy.DivisionStrategy

class DivisionGame :BaseMathsGame(){
    init {
        context = MathsContext(DivisionStrategy())
    }
}