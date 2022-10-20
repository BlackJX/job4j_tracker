package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int value) {
        return x + value;
    }

    public static int minus(int value) {
        return value - x;
    }

    public int divide(int value) {
        return value / x;
    }

    public int multiply(int value) {
        return x * value;
    }

    public int sumAllOperation(int value) {
       return sum(value) + multiply(value) + minus(value) + divide(value);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(5);
        System.out.println(result);
        result = Calculator.minus(5);
        System.out.println(result);
        Calculator calc = new Calculator();
        calc.divide(5);
        calc.multiply(5);
        calc.sumAllOperation(5);
        result = calc.sumAllOperation(5);
        System.out.println(result);
    }
}