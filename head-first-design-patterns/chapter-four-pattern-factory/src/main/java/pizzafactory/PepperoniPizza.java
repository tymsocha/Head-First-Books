package pizzafactory;

import pizzafactory.ingredients.PizzaIngredientsFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public PepperoniPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void preparePizza() {
        System.out.println("Preparing: " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        meat = ingredientsFactory.createMeat();
    }
}
