package com.yang.maths.games.impl.strategy

import com.yang.maths.games.impl.strategy.Strategy
import com.yang.maths.games.bean.Bean
import java.util.*

class MultiplicationStrategy : Strategy {
    override fun generate(): Bean {
        val random = Random()
        val first = random.nextInt(50)
        val second = random.nextInt(50)
        val result = first*second
        return Bean("$first * $second","$result")
    }
}