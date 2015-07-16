/**
 •	Создайте код, который выводит все простые числа(узнать, что такое простое число) из интервала от 2доn (заданного с клавиатуры).
 Результат должен быть: 2,3,5,7 ...
 */
package org.sourceit.darinachumak.homework.hw2;
import java.util.*;
public class HW2EasyNumber {
    public static void main(String[] args) {

        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число");
            n = scn.nextInt();
            System.out.println("Простые числа из интервала(2, n): ");
            for (int i = 1; i <= n; i++) {
                for (int j = 2; j <i; j++) {
                    if (i % j == 0)
                        break;
                    System.out.println(i);
                    break;

                }

            }

        }
    }



