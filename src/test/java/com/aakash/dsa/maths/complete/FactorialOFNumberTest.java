package com.aakash.dsa.maths.complete;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Factorial Calculation Tests")
class FactorialOFNumberTest {


    // ================== Test Case Providers ==================
    private static Stream<Arguments> validFactorialCases() {
        return Stream.of(
                Arguments.of(0, 1, "Base case (0!)"),
                Arguments.of(1, 1, "Base case (1!)"),
                Arguments.of(2, 2, "Smallest non-trivial case"),
                Arguments.of(5, 120, "Typical case (5!)"),
                Arguments.of(10, 3628800, "Larger number (10!)"),
                Arguments.of(12, 479001600, "Maximum correct value for int")
        );
    }

    // ================== Recursive Factorial Tests ==================
    @DisplayName("Recursive Factorial")
    @ParameterizedTest(name = "[{index}] factorial({0}) → {1} | {2}")
    @MethodSource("validFactorialCases")
    void testFactorial(int input, int expected, String description) {
        assertThat(FactorialOFNumber.factorial(input))
                .as("Input: %d | %s", input, description)
                .isEqualTo(expected);
    }

    // ================== Iterative Factorial Tests ==================
    @DisplayName("Iterative Factorial")
    @ParameterizedTest(name = "[{index}] factorialV1({0}) → {1} | {2}")
    @MethodSource("validFactorialCases")
    void testFactorialV1(int input, int expected, String description) {
        assertThat(FactorialOFNumber.factorialV1(input))
                .as("Input: %d | %s", input, description)
                .isEqualTo(expected);
    }

}
