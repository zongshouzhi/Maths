package com.yang.maths.games.impl

import com.yang.maths.games.impl.strategy.MultiplicationStrategy

class MultiplicationGame : BaseMathsGame() {
    init {
        context = MathsContext(MultiplicationStrategy())
    }
}