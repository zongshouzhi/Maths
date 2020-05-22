package com.yang.maths.games.impl

import com.yang.maths.games.bean.Bean
import com.yang.maths.games.impl.strategy.Strategy

class MathsContext(private val strategy: Strategy) {
    fun generate(): Bean = strategy.generate()
}