package com.local.studing.Animals;

public abstract class Animals {
    String name;
    String color;
    int age;

    static int commonCount = 0;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        commonCount++;
    }

    public static void getCommonCount() {
        System.out.println("Всего животных: " + commonCount);
    }

    public abstract void run(int length);
    public abstract void swim(int length);
}
