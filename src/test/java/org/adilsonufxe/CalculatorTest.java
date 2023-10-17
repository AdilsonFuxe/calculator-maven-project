package org.adilsonufxe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @ValueSource(strings = {"Adilson", "Fuxe"})
    void valueSourceDemonstration(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }


    @DisplayName("Should return Thirty Two When Subtraction ThirtyThree By One  ")
    @ParameterizedTest
//    @MethodSource()
//    @CsvSource({
//            "12, 10, 2",
//            "1, 1, 0",
//            "12, 14, -2"
//    })
    @CsvFileSource(resources = "/integerSubtraction.csv")
    void integerSubtraction(int minuend, int subtrahend, int expectedResult) {
        Calculator calculator = new Calculator();

        int result = calculator.integerSubtraction(minuend, subtrahend);

        assertEquals(expectedResult, result, () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }

//    private static Stream<Arguments> integerSubtraction() {
//        return Stream.of(
//                Arguments.of(33, 1, 32),
//                Arguments.of(20, 21, -1),
//                Arguments.of(10, 10, 0)
//        );
//    }
}
