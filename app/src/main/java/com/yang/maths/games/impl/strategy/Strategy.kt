package com.yang.maths.games.impl.strategy

import com.yang.maths.games.bean.Bean

interface Strategy{
    fun generate(): Bean
}