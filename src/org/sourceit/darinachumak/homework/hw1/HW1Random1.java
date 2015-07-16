
package org.sourceit.darinachumak.homework.hw1;

import java.util.Scanner;

/**
 •	Натуральное положительное число записано в переменную n. Создайте программу,
 которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [-n;n] (n – вводит пользователь).
 */
public class HW1Random1 {
    public static void main(String[] args) {
        System.out.println("Введите число n, а программа выведет случайное число в отрезке -n;n:");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        scaner.close();
        int result = (-number + (int)(Math.random() * (number + number) + 1));
        System.out.println("Случайное число " + result);
    }

}
