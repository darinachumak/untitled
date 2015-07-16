
package org.sourceit.darinachumak.homework.hw1;


import java.util.Scanner;

/**
 •	Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет
 в числе).
 */
public class HW1_SumOfNatNum {


   int SumOfTwoDigNum(int n){
        int sum = 0;
        sum = n%10 + n/10;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("ВВедите двузначное число, а мы посчитаем сумму его цифр:");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        scaner.close();
        HW1_SumOfNatNum result = new HW1_SumOfNatNum();
        System.out.println("Сумма цифр числа " + number + " "+ "равна: "+ result.SumOfTwoDigNum(number));

    }


}
