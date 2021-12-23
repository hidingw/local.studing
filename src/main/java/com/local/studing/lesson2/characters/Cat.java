package com.local.studing.lesson2.characters;

import com.local.studing.lesson2.interfaces.RunningAndJumping;

public class Cat implements RunningAndJumping {
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun) {
            System.out.println(this.name + " run " + length + " m.");
            return true;
        } else {
            System.out.println(this.name + " couldn't run " + length + " m.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println(this.name + " jump on " + height + " m.");
            return true;
        } else {
            System.out.println(this.name + " couldn't jump on " + height + " m.");
            return false;
        }
    }
}
