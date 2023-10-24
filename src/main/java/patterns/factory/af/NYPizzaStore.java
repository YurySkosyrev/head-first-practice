package patterns.factory.af;

public class NYPizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory =
            new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
