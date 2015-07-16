
package org.sourceit.darinachumak.homework.hw1;
import java.util.Scanner;

/**
 •	В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 Вычислить и вывести на экран площадь треугольника и его периметр(a и b – вводит пользователь).
 */
public class Triangle {
    int a;
    int b;

    public static void main(String[] args) {
        System.out.println("Введите длину катета a:");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        System.out.println("Введите длину катета b:");
        int b = scaner.nextInt();
        scaner.close();

        int s = a*b/2;
        System.out.println("Площадь треугольника равна: " + s);


        double c = Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)));
        double p = a+b+c;

        System.out.println("Периметр треугольника равен: " + p);
    }
}
