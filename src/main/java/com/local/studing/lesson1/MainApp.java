package com.local.studing.lesson1;

import com.local.studing.lesson1.Animals.Animals;
import com.local.studing.lesson1.Animals.Dog;
import com.local.studing.lesson1.Animals.HomeCat;
import com.local.studing.lesson1.Animals.Tiger;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Animals[] animals = {
            new Dog("Spot", "Combinate", 3),
            new HomeCat("Fluphi", "White", 4),
            new HomeCat("Bob", "Ginger", 12),
            new Tiger("Scherkhan", "Tiggery", 8)
        };

        Animals.getCommonCount();
        Dog.getDogCount();
        HomeCat.getHomeCatCount();
        Tiger.getTigerCount();

        int tests = getRandom(10, 1);

        for (int i = 0; i < tests; i++){
            int runLength = getRandom(600, 50);
            int swimLength = getRandom(15,1);

            for (Animals animal: animals) {
                animal.run(runLength);
                animal.swim(swimLength);
            }
        }
    }

    public static int getRandom(int max, int min){
        Random rnd = new Random();
        return rnd.nextInt(max - min) + min;
    }
}
