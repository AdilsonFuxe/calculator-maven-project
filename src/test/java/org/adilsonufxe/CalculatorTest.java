package org.adilsonufxe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void integerDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result);
    }

    @Test
    void integerSubtraction() {
        Calculator calculator = new Calculator();

        int minuend = 33;
        int subtrahend = 1;
        int expectedResult = 32;

        int result = calculator.integerSubtraction(minuend, subtrahend);

        assertEquals(expectedResult, result, () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }
}
