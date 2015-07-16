
package org.sourceit.darinachumak.homework.hw1;

import java.util.Scanner;

/**
 •	В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить и выводить на экран
 вещественные корни квадратного уравнения ax^2+bx+c=0, либо сообщать, что корней нет(a, b и c – вводит пользователь).
 */
public class HW1QuadraticEquation {
    int a;
    int b;
    int c;


    public static void main(String[] args) {
        System.out.println("ВВедите коеффициенты для квадратного уравнения:");
        System.out.println("Введите  a:");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        System.out.println("Введите b:");
        int b = scaner.nextInt();
        System.out.println("Введите c:");
        int c = scaner.nextInt();
        scaner.close();

        double d = (Math.pow(b, 2)- 4*a*c);

        if (d>0){
            double result1 = ((-b)+Math.sqrt(d))/2;
            double result2 = ((-b)-Math.sqrt(d))/2;

            System.out.println("т.к. дискриминант больше  0,то имеем 2 корня:");
            System.out.println("x1= " + result1 + "i x2= " + result2);


        }
        else if (d==0){
            double result = -b/(2*a);
            System.out.println("т. к. дискриминант раыен 0,то имеем 1 корень':");
            System.out.println("x1= " + result );
        }
        else {
            System.out.println("т.к.дискриминант меньше 0,то действительных корней нет!");
        }

    }
}
