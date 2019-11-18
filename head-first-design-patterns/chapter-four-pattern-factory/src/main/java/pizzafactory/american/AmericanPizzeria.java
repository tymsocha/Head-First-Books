package pizzafactory.american;

import pizzafactory.*;
import pizzafactory.ingredients.AmericanPizzaIngredientsFactory;
import pizzafactory.ingredients.ItalianPizzaIngrediensFactory;
import pizzafactory.ingredients.PizzaIngredientsFactory;

public class AmericanPizzeria extends Pizzeria {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new AmericanPizzaIngredientsFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("American Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("American Pepperoni Pizza");
        } else if (type.equals("vege")) {
            pizza = new VegetarianPizza(ingredientsFactory);
            pizza.setName("American Veggie Pizza");
        } else if (type.equals("seafood")) {
            pizza = new SeaFoodPizza(ingredientsFactory);
            pizza.setName("American Seafood Pizza");
        }

        return pizza;
    }
}
