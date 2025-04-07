package com.aakash.dsa.maths.complete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Palindrome Check (Mathematical Reversal)")
class PalindromeUtilsTest {

    @ParameterizedTest(name = "[{index}] Input: {0} → Expected: {1} | {2}")
    @MethodSource("palindromeTestCases")
    void testIsPalindrome(int input, boolean expected, String description) {
        assertThat(PalindromeNumber.isPalindrome(input))
                .as("Test Case: %s | Input: %d", description, input)
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] Input: {0} → Expected: {1} | {2}")
    @MethodSource("palindromeTestCases")
    void testIsPalindromeV1(int input, boolean expected, String description) {
        assertThat(PalindromeNumber.isPalindromeV1(input))
                .as("Test Case: %s | Input: %d", description, input)
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] Input: {0} → Expected: {1} | {2}")
    @MethodSource("palindromeTestCases")
    void testIsPalindromeV2(int input, boolean expected, String description) {
        assertThat(PalindromeNumber.isPalindromeV2(input))
                .as("Test Case: %s | Input: %d", description, input)
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] Input: {0} → Expected: {1} | {2}")
    @MethodSource("palindromeTestCases")
    void testIsPalindromeV3(int input, boolean expected, String description) {
        assertThat(PalindromeNumber.isPalindromeV3(input))
                .as("Test Case: %s | Input: %d", description, input)
                .isEqualTo(expected);
    }

    private static Stream<Arguments> palindromeTestCases() {
        return Stream.of(
                // Palindromes
                Arguments.of(0, true, "Zero is a palindrome"),
                Arguments.of(5, true, "Single-digit positive"),
                Arguments.of(121, true, "Odd-digit palindrome (121)"),
                Arguments.of(1221, true, "Even-digit palindrome (1221)"),
                Arguments.of(12321, true, "Larger odd-digit palindrome (12321)"),

                // Non-palindromes
                Arguments.of(-121, false, "Negative number (-121)"),
                Arguments.of(10, false, "Ends with zero (10)"),
                Arguments.of(123, false, "Non-palindrome (123)"),

                // Edge cases
                Arguments.of(Integer.MAX_VALUE, false, "MAX_VALUE (2147483647)"),
                Arguments.of(Integer.MIN_VALUE, false, "MIN_VALUE (-2147483648)")
        );
    }
}