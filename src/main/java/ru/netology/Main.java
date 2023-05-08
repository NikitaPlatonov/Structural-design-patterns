package ru.netology;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        IntsCalculator intsCalculator = new IntsCalculator(calculator);
        System.out.println("Результат возведения числа в степень");
        System.out.println(intsCalculator.pow(5,2));
        System.out.println("Результат сложения");
        System.out.println(intsCalculator.sum(100,150));
        System.out.println("Результат умножения");
        System.out.println(intsCalculator.mult(10,5));
    }
}