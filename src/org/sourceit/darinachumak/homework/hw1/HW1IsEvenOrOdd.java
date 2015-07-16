/**
 �	������� ���������, ����������� � ���������� �� �����, �������� �� ����� �����, ���������� � ���������� n, ������ ���� ��������
 (n � ������ ������������).
 */
package org.sourceit.darinachumak.homework.hw1;

import java.util.Scanner;

public class HW1IsEvenOrOdd {

    boolean isEvenOrOdd (int numb){
        if (numb%2 == 0){
            System.out.println ("Четное");
            return true;

        }
        System.out.println("Нечетное");
        return false;

    }

    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        scaner.close();
        HW1IsEvenOrOdd n = new HW1IsEvenOrOdd();
        System.out.println("Ваше число " + number + " " + n.isEvenOrOdd(number));
    }
}
