package patterns.strategy.behaviors.fly.impl;

import patterns.strategy.behaviors.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!!");
    }
}
