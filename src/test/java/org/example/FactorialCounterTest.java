package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCounterTest {

    private FactorialCounter factorialCounter;

    @BeforeEach
    void setUp(){
        factorialCounter = new FactorialCounter();
    }

    @Test
    @DisplayName("Factorial of zero")
    void testFactorialWithZero() {
        int factorial = FactorialCounter.factorial(0);
        Assertions.assertEquals(1, factorial);
    }

    @Test
    @DisplayName("Factorial with positive number")
    void testFactorialWithPositiveNumber() {
        int factorial = FactorialCounter.factorial(2);
        Assertions.assertEquals(2, factorial);
    }

    @Test
    @DisplayName("Factorial with negative number")
    void testFactorialWithNegativeNumber(){
        try{
            int factorial = FactorialCounter.factorial(-1);
            Assertions.fail("Предполагается IllegalArgumentException для отрицательного числа");
        } catch (IllegalArgumentException e){

        }

}}