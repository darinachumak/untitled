/**
 •	Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран.
 Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести
 индекс первой встретившейся из них.
 */
package org.sourceit.darinachumak.homework.hw2;
public class HW2Array2 {
    public static void main(String[] args){
        int [][] Ar = new int[7][4];
        int [] Ar1 = new int[Ar.length];
        for(int i =0;i<Ar.length;i++){
            System.out.print("Строка №"+i+" ");
            for(int j=0;j<Ar[i].length;j++){
                Ar[i][j]=(int)(-5 + (Math.random()*10));
                System.out.print(Ar[i][j]+" ");
                if(j==0)Ar1[i]=Ar[i][j];
                else Ar1[i]*=Ar[i][j];
                if(j==Ar[i].length-1)
                    System.out.println(" ");
            }
        }
        int max=0,max_i=0;
        for(int i=0;i<Ar1.length;i++){
            if(Math.abs(Ar1[i])>max){
                max=Ar1[i];
                max_i=i;
            }
        }
        System.out.println("Строка с наибольшим по модулю произведением элементов "+max+" имеет индекс - "+max_i);
    }
}

