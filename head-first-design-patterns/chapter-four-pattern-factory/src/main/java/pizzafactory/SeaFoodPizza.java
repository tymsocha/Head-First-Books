package pizzafactory;

import pizzafactory.ingredients.PizzaIngredientsFactory;

public class SeaFoodPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public SeaFoodPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    protected void preparePizza() {
        System.out.println("Preparing: " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        seafood = ingredientsFactory.createSeafood();
    }
}
