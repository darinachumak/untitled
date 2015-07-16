/**
 •	Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр
 будет в числе).
 */
package org.sourceit.darinachumak.homework.hw1;
import java.util.Scanner;
public class HW1SumOfNatNum2 {

        public static void main(String [] args){
            int n;
            int sum = 0;
            System.out.println("Bведите натуральное число - ");
            Scanner sr = new Scanner(System.in);
            n = sr.nextInt();
            while(n != 0){
                //Суммирование цифр числа
                sum = sum + (n % 10);
                n/=10;
            }
            System.out.println("Сумма всех его чисел равна: " + sum + " ");
    }


}
