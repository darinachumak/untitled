/**
 •	Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности равны
 единицам, а каждый следующий — сумме двух предыдущих.
 */
package org.sourceit.darinachumak.homework.hw1;
public class Fibonachi {
    int Fib(int i){
        if (i == 0 || i ==1)  return 1;
        return (Fib(i-2)+Fib(i-1));
    }

    public static void main(String[] args) {
        Fibonachi f = new Fibonachi();
        for(int i = 0; i<=10; i++ ) {
            System.out.println(i + "-єлемент последовательности Фибоначчи: " + f.Fib(i));
        }
    }
}
