package com.example.yjoo.junit_20170804_1;

import org.junit.Test;
import  static org.junit.Assert.assertTrue;

/**
 * Created by yjoo on 17. 8. 4.
 */

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(10, 10);
        int expected = 10+20;
        assertTrue(actual == expected);
    }


}
