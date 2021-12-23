package com.local.studing.lesson2;

import com.local.studing.lesson2.barriers.Barrier;
import com.local.studing.lesson2.barriers.RunningLine;
import com.local.studing.lesson2.barriers.Wall;
import com.local.studing.lesson2.characters.Cat;
import com.local.studing.lesson2.characters.Man;
import com.local.studing.lesson2.characters.Robot;
import com.local.studing.lesson2.interfaces.RunningAndJumping;

public class MainApp {
    public static void main(String[] args) {
        RunningAndJumping[] characters = {
                new Man("Stev", 300, 2),
                new Cat("Fluphi", 200, 4),
                new Robot("C3PO", 6000, 10)
        };

        Barrier[] barriers = {
                new Wall(4),
                new RunningLine(450)
        };

        for (RunningAndJumping character: characters) {
            for (Barrier barrier: barriers) {
                if (!barrier.cross(character)) {
                    break;
                }
            }
        }
    }
}
