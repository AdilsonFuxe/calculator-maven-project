package org.adilsonufxe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test Math operations in Calculator class")
public class CalculatorTest {
    @BeforeAll
    static void setup() {
        System.out.println("Executing @BeforeAll method");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Executing @AfterAll method");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        System.out.println("Executing @BeforeEach method");
    }

    @AfterEach
    void afterEachTestMethod() {
        System.out.println("Executing @AfterEach method");
    }


    @Test
    void testIntegerDivision_WhenFourDividedByTwo_ShouldReturnTwo() {
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Should throw if divided by zero exception if divided by zero")
    void testIntegerDivision_DividedByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.integerDivision(4, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Should return Thirty Two When Subtraction ThirtyThree By One  ")
    void integerSubtraction() {
        Calculator calculator = new Calculator();

        int minuend = 33;
        int subtrahend = 1;
        int expectedResult = 32;

        int result = calculator.integerSubtraction(minuend, subtrahend);

        assertEquals(expectedResult, result, () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }
}
