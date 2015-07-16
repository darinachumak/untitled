

/**
 •	Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
 целое число в интервал (25;100) и сообщать результат на экран.
 */

package org.sourceit.darinachumak.homework.hw1;

public class HW1Random2 {

    public static void main(String[] args) {
        System.out.println("Программа сгенерирует случайное число в отрезке [5;155] и проверит, попадает ли оно в отрезок (25;100)");

        int result = (5 + (int) (Math.random() * (155 - 5) + 1));
        System.out.println("Случайное число " + result);

        if (result >= 25 && result <= 100) {
            System.out.println("Число попало в интервал (25;100)");
        } else {
            System.out.println("Число не попало в интервалl (25;100)");
        }
    }
}
