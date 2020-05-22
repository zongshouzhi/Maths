package com.yang.maths.games.impl

import com.yang.maths.games.impl.strategy.AdditionStrategy

class AdditionGame : BaseMathsGame() {
    init {
        context = MathsContext(AdditionStrategy())
    }
}