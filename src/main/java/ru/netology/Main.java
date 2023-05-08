package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        // "1010" - 10
        String resultSum = (binOps.sum("1010", "1010"));
        System.out.println("Результат сложения в двоичной системе счисления");
        System.out.println(resultSum);
        System.out.println("Результат сложения в десятичной системе счисления");
        System.out.println(Integer.parseInt(resultSum, 2));
        System.out.println();
        String resultMult = binOps.mult("1010", "1010");
        System.out.println("Результат умножения в двоичной системе счисления");
        System.out.println(resultMult);
        System.out.println("Результат умножения в десятичной системе счисления");
        System.out.println(Integer.parseInt(resultMult , 2));
    }
}