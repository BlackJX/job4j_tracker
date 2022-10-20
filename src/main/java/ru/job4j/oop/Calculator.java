package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int m) {
        return m - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int b) {
       return sum(b) + multiply(b) + minus(b) + divide(b);
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