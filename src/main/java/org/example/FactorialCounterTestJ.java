package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class FactorialCounterTestJ {

    @Test
    @DisplayName("Factorial of zero")
    void testFactorialWithZero() {
        int factorial = FactorialCounter.factorial(0);
        Assertions.assertEquals(1, factorial);
    }

    @Test
    @DisplayName("Factorial with positive number")
    void testFactorialWithPositiveNumber() {
        int factorial = FactorialCounter.factorial(1);
        Assertions.assertEquals(1, factorial);
    }

    @Test
    @DisplayName("Factorial with negative number")
    void testFactorialWithNegativeNumber() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FactorialCounter.factorial(-1);
        });
    }
}
