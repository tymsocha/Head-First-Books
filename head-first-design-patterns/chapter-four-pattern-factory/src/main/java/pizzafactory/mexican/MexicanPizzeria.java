package pizzafactory.mexican;

import pizzafactory.*;
import pizzafactory.ingredients.ItalianPizzaIngrediensFactory;
import pizzafactory.ingredients.MexicanPizzaIngredientsFactory;
import pizzafactory.ingredients.PizzaIngredientsFactory;

public class MexicanPizzeria extends Pizzeria {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new MexicanPizzaIngredientsFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Mexican Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Mexican Pepperoni Pizza");
        } else if (type.equals("vege")) {
            pizza = new VegetarianPizza(ingredientsFactory);
            pizza.setName("Mexican Veggie Pizza");
        } else if (type.equals("seafood")) {
            pizza = new SeaFoodPizza(ingredientsFactory);
            pizza.setName("Mexican Seafood Pizza");
        }

        return pizza;
    }
}
