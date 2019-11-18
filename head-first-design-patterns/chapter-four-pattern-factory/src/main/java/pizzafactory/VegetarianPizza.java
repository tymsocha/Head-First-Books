package pizzafactory;

import pizzafactory.ingredients.PizzaIngredientsFactory;

public class VegetarianPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public VegetarianPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void preparePizza() {
        System.out.println("Preparing: " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        vegetables = ingredientsFactory.createVegetable();
    }
}
