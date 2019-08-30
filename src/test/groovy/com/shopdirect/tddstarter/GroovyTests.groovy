package com.shopdirect.tddstarter

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class GroovyTests {

    @Test
    void amISwitchedOn() {
        assertEquals(MyClass.myMethod(), false)
    }
}
