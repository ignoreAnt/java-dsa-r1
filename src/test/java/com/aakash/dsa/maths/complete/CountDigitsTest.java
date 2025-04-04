package com.aakash.dsa.maths.complete;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountDigitsTest {

    @DisplayName("Test countDigits with various inputs")
    @ParameterizedTest(name = "[{index}] Input: {0} -> Expected: {1} digits")
    @MethodSource("countDigitTestCases")
    public void testCountDigits(int input, int expected, String description){
        assertThat(CountDigits.countDigits(input))
                .as("Input: %d | Description: %s", input, description)
                .isEqualTo(expected);
    }

    @DisplayName("Test countDigits with logarithm with various inputs")
    @ParameterizedTest(name = "[{index}] Input: {0} -> Expected: {1} digits")
    @MethodSource("countDigitTestCases")
    public void testCountDigitsV1(int input, int expected, String description){
        assertThat(CountDigits.countDigitsV1(input))
                .as("Input: %d | Description: %s", input, description)
                .isEqualTo(expected);
    }

    @DisplayName("Test countDigits with string conversion with various inputs")
    @ParameterizedTest(name = "[{index}] Input: {0} -> Expected: {1} digits")
    @MethodSource("countDigitTestCases")
    public void testCountDigitsV2(int input, int expected, String description){
        assertThat(CountDigits.countDigitsV2(input))
                .as("Input: %d | Description: %s", input, description)
                .isEqualTo(expected);
    }

    private static Stream<Arguments> countDigitTestCases(){
        return Stream.of(
                Arguments.of(0, 1, "Zero should return 1 digit"),
                Arguments.of(5, 1, "Single-digit positive number (5)"),
                Arguments.of(-3, 1, "Single-digit negative number (-3)"),
                Arguments.of(42, 2, "Two-digit positive number (42)"),
                Arguments.of(-99, 2, "Two-digit negative number (-99)"),
                Arguments.of(123456, 6, "Large positive number (123456)"),
                Arguments.of(Integer.MAX_VALUE, 10, "Edge case (MAX_VALUE: 2147483647)"),
                Arguments.of(Integer.MIN_VALUE, 10, "Edge case (MIN_VALUE: -2147483648)")
        );
    }

}