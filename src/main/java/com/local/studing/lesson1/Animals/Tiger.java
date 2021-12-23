package com.local.studing.lesson1.Animals;

public class Tiger extends HomeCat{
    static int tigerCount = 0;

    public Tiger(String name, String color, int age){
        super(name, color, age);
        tigerCount++;
//        homeCatCount--;
    }

    public static void getTigerCount () {
        System.out.println("Всего тигров: " + tigerCount);
    }
}
