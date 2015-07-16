/**
 •	Создать класс Dog, который будет содержать 2 поля name и says.
 В main( ) создать 2 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля объектов.
 */
package org.sourceit.darinachumak.homework.hw1;

public class HW1Dog {
    String name;
    String says;

    public static void main(String[] args) {
        HW1Dog dog1 = new HW1Dog();
        HW1Dog dog2 = new HW1Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println("dog1 name: " + dog1.name + ", says: " + dog1.says);
        System.out.println("dog2 name: " + dog2.name + ", says: " + dog2.says);
    }
}
