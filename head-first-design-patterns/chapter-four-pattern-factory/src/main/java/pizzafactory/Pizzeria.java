package pizzafactory;

public abstract class Pizzeria {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.preparePizza();
        pizza.bakePizza();
        pizza.cuttingPizza();
        pizza.packingPizza();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
