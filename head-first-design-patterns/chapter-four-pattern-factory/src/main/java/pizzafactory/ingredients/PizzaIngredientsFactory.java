package pizzafactory.ingredients;

import pizzafactory.ingredients.cheese.Cheese;
import pizzafactory.ingredients.dough.Dough;
import pizzafactory.ingredients.meat.Meat;
import pizzafactory.ingredients.sauce.Sauce;
import pizzafactory.ingredients.seafood.Seafood;
import pizzafactory.ingredients.vegetable.Vegetable;


public interface PizzaIngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Vegetable[] createVegetable();
    Meat createMeat();
    Seafood createSeafood();
}
