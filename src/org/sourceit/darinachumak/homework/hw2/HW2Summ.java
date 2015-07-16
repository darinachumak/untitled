
package org.sourceit.darinachumak.homework.hw2;
import java.util.Scanner;

/**
 •	Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
 */
public class HW2Summ {


    int Sum(int n){
        if (n==1) return 1;

        return (Sum(n-1) + n);
    }

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        scaner.close();
        HW2Summ result = new HW2Summ();
        System.out.println("Сумма чисео от 1 до  " + number + " "+ "ravna: "+ result.Sum(number));

    }

}
