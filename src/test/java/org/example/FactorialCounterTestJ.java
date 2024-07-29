package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FactorialCounterTestJ {

    @Test
    @DisplayName("Factorial of zero")
    void testFactorialWithZero() {
        FactorialCounter factorialCounter = new FactorialCounter();
        int factorial = FactorialCounter.factorial(0);
        Assertions.assertEquals(1, factorial);
    }

    @Test
    @DisplayName("Factorial with positive number")
    void testFactorialWithPositiveNumber() {
        FactorialCounter factorialCounter = new FactorialCounter();
        int factorial = FactorialCounter.factorial(2);
        Assertions.assertEquals(2, factorial);
    }

    @Test
    @DisplayName("Factorial with negative number")
    void testFactorialWithNegativeNumber() {
        FactorialCounter factorialCounter = new FactorialCounter();
        try {
            int factorial = FactorialCounter.factorial(-1);
            Assertions.fail("Предполагается IllegalArgumentException для отрицательного числа");
        } catch (IllegalArgumentException e) {

        }

    }
}