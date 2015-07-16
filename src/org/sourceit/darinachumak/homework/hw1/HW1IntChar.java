/**
 •	Создать класс, который содержит int и char (не проинициализированные) и распечатать их значения.
 */
package org.sourceit.darinachumak.homework.hw1;

public class HW1IntChar {
    int i;
    char c;

    public static void main(String[] args) {
        HW1IntChar intChar = new HW1IntChar();
        System.out.println("int i = " + intChar.i);
        System.out.println("char c = " + intChar.c);
    }
}
