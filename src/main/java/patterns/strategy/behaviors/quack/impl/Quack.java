package patterns.strategy.behaviors.quack.impl;

import patterns.strategy.behaviors.quack.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
