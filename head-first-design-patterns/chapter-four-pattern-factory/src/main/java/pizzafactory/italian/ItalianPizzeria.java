package pizzafactory.italian;

import pizzafactory.*;
import pizzafactory.ingredients.ItalianPizzaIngrediensFactory;
import pizzafactory.ingredients.PizzaIngredientsFactory;

public class ItalianPizzeria extends Pizzeria {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new ItalianPizzaIngrediensFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Italian Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Italian Pepperoni Pizza");
        } else if (type.equals("vege")) {
            pizza = new VegetarianPizza(ingredientsFactory);
            pizza.setName("Italian Veggie Pizza");
        } else if (type.equals("seafood")) {
            pizza = new SeaFoodPizza(ingredientsFactory);
            pizza.setName("Italian Seafood Pizza");
        }

        return pizza;
    }
}
