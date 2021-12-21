package com.local.studing.lesson1;

import com.local.studing.Animals.Animals;
import com.local.studing.Animals.Dog;
import com.local.studing.Animals.HomeCat;
import com.local.studing.Animals.Tiger;

public class MainApp {
    public static void main(String[] args) {
        Dog puppy = new Dog("Spot", "Combinate", 3);
        HomeCat kitty = new HomeCat("Fluphi", "White", 4);
        HomeCat streetCat = new HomeCat("Bob", "Ginger", 12);
        Tiger sherkhan = new Tiger("Scherkhan", "Tiggery", 8);

        Animals.getCommonCount();
        Dog.getDogCount();
        HomeCat.getHomeCatCount();
        Tiger.getTigerCount();

        int tests = 3;

        for (int i = 0; i < tests; i++){
            int runLength = (int) Math.random() * 600;
            int swimLength = (int) Math.random() * 15;

            puppy.run(runLength);
            puppy.swim(swimLength);

            kitty.run(runLength);
            kitty.swim(swimLength);

            streetCat.run(runLength);
            streetCat.swim(swimLength);

            sherkhan.run(runLength);
            sherkhan.swim(swimLength);
        }
    }
}
