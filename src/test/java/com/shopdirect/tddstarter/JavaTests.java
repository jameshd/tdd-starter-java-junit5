package com.shopdirect.tddstarter;



import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class JavaTests {
    @Test
    void amISwitchedOn() {
        assertThat(MyClass.myMethod(), is(equalTo(false)));
    }
}
