package patterns.decorator.starbuzzcoffe.decorators;

import patterns.decorator.starbuzzcoffe.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;
    public abstract String getDescription();

}
