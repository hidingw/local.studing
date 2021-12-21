package com.local.studing.Animals;

public final class Dog extends Animals{
    static final int MAX_RUN_LENGTH = 500;
    static final int MAX_SWIM_LENGTH = 10;
    static int dogCount = 0;

    public Dog (String name, String color, int age){
        super(name, color, age);
        dogCount++;
    }

    public static void getDogCount () {
        System.out.println("Всего собак: " + dogCount);
    }

    @Override
    public void run(int length) {
        if (length > MAX_RUN_LENGTH) {
            System.out.println(this.name + " не может пробежать " + length + "метров");
        } else {
            System.out.println(this.name + " пробежал " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        if (length > MAX_SWIM_LENGTH) {
            System.out.println(this.name + "не может проплыть " + length + "метров");
        } else {
            System.out.println(this.name + " проплыл " + length + " метров");
        }
    }
}
