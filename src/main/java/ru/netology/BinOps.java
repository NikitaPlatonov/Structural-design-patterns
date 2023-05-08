package ru.netology;

public class BinOps {
    /**

     BinOps - это класс-фасад для стандартных библиотек java. Класс предоставляет удобный интерфейс для перемножения чисел в двоичной системе.

     Результатом выполнения операций над числами будет число в двоичной системе.

    */
    public String sum(String a, String b) {
        //число 2 - это указание того из какой системы счисления мы парсим число.
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int result = numA + numB;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int result = numA * numB;
        return Integer.toBinaryString(result);
    }
}
