package com.local.studing.lesson2.barriers;

import com.local.studing.lesson2.interfaces.RunningAndJumping;

public class RunningLine extends Barrier{
    final private int distance;

    public RunningLine(int distance) {
        this.distance = distance;
    }

    public boolean cross(RunningAndJumping character) {
        return character.run(this.distance);
    }
}
