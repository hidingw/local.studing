package com.local.studing.lesson2.barriers;

import com.local.studing.lesson2.interfaces.Jumping;
import com.local.studing.lesson2.interfaces.RunningAndJumping;

public class Wall extends Barrier{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean cross(RunningAndJumping character) {
        return character.jump(this.height);
    }
}
