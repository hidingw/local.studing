package com.local.studing.Animals;

public class HomeCat extends Animals{
    static final int MAX_RUN_LENGTH = 200;
    static int homeCatCount = 0;

    public HomeCat (String name, String color, int age){
        super(name, color, age);
        if (!(this instanceof Tiger)) {
            homeCatCount++;
        }
    }

    public static void getHomeCatCount () {
        System.out.println("Всего домашних котов: " + homeCatCount);
    }

    @Override
    public void run(int length) {
        System.out.println(this.name + " пробежал " + length + " метров");
    }

    @Override
    public void swim(int length) {
        System.out.println("Коты не умеют плавать");
    }

}
