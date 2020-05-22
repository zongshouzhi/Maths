package com.yang.maths.games.impl.strategy

import com.yang.maths.games.impl.strategy.Strategy
import com.yang.maths.games.bean.Bean
import java.util.*

class DivisionStrategy : Strategy {
    override fun generate(): Bean {
        val random = Random()
        val result = random.nextInt(10)
        val second = random.nextInt(10)
        val first = result*second
        return Bean("$first / $second","$result")
    }
}