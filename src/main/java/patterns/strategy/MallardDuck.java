package patterns.strategy;

import patterns.strategy.behaviors.fly.impl.FlyWithWings;
import patterns.strategy.behaviors.quack.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard duck");
    }
}
