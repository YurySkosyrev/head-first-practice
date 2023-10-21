package patterns.strategy.behaviors.fly.impl;

import patterns.strategy.behaviors.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
