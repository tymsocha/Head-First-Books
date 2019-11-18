package pizzafactory;

import pizzafactory.ingredients.AmericanPizzaIngredientsFactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new CheesePizza(new AmericanPizzaIngredientsFactory());
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(new AmericanPizzaIngredientsFactory());
        } else if (type.equals("seafood")) {
            pizza = new SeaFoodPizza(new AmericanPizzaIngredientsFactory());
        } else if (type.equals("vege")) {
            pizza = new VegetarianPizza(new AmericanPizzaIngredientsFactory());
        }
        return pizza;
    }
}
