package pizzafactory.ingredients;

import pizzafactory.ingredients.cheese.Cheese;
import pizzafactory.ingredients.cheese.ReggiannoCheese;
import pizzafactory.ingredients.dough.Dough;
import pizzafactory.ingredients.dough.SlimCrunchyDough;
import pizzafactory.ingredients.meat.Meat;
import pizzafactory.ingredients.meat.Pepperoni;
import pizzafactory.ingredients.sauce.Marinara;
import pizzafactory.ingredients.sauce.Sauce;
import pizzafactory.ingredients.seafood.Clams;
import pizzafactory.ingredients.seafood.Seafood;
import pizzafactory.ingredients.vegetable.*;

public class ItalianPizzaIngrediensFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new SlimCrunchyDough();
    }

    @Override
    public Sauce createSauce() {
        return new Marinara();
    }

    @Override
    public Cheese createCheese() {
        return new ReggiannoCheese();
    }

    @Override
    public Vegetable[] createVegetable() {
        Vegetable vegetables[] = {new Garlic(), new Onion(), new Mushrooms(), new RedPepper()};
        return vegetables;
    }

    @Override
    public Meat createMeat() {
        return new Pepperoni();
    }

    @Override
    public Seafood createSeafood() {
        return new Clams();
    }
}
