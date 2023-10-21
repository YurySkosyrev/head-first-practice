package patterns.strategy;

import patterns.strategy.behaviors.fly.impl.FlyNoWay;
import patterns.strategy.behaviors.quack.impl.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a model duck");
    }
}
