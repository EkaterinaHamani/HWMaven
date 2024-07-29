package org.example;


public class FactorialCounter {
    public static int factorial(int n){
        if (n< 0){ throw new IllegalArgumentException("Факториал не найден для отрицательного числа");

        }
        if (n==0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i<=n; i++){
            result *=i;}
        return result;
    }
    public static void main(String[] args){
        FactorialCounter counter = new FactorialCounter();
        int number = 2;
        System.out.println("Факториал от " + number + " = " + counter.factorial(number));
    }}