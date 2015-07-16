/**
 •	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
 */
package org.sourceit.darinachumak.homework.hw2;
public class HW2Array1 {


    public static void main(String[] args) {
        int array[][] = new int[8][5];
     for (int i = 0; i < array.length; i ++)  {
         for (int j = 0; j < array[i].length; j ++){
             array[i][j] = (10 + (int)(Math.random() * (99 - 10) + 1));
             System.out.print(array[i][j] + " ");
         }
         System.out.println();
     }

    }


}
