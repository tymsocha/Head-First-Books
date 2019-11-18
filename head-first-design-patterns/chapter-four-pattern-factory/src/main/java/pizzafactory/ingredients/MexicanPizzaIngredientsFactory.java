package pizzafactory.ingredients;

import pizzafactory.ingredients.cheese.Cheese;
import pizzafactory.ingredients.cheese.Gouda;
import pizzafactory.ingredients.cheese.ReggiannoCheese;
import pizzafactory.ingredients.dough.Dough;
import pizzafactory.ingredients.dough.ExtraCrispy;
import pizzafactory.ingredients.dough.SlimCrunchyDough;
import pizzafactory.ingredients.meat.Meat;
import pizzafactory.ingredients.meat.Pepperoni;
import pizzafactory.ingredients.meat.Pork;
import pizzafactory.ingredients.sauce.HotSauce;
import pizzafactory.ingredients.sauce.Marinara;
import pizzafactory.ingredients.sauce.Sauce;
import pizzafactory.ingredients.seafood.Clams;
import pizzafactory.ingredients.seafood.Seafood;
import pizzafactory.ingredients.seafood.Squids;
import pizzafactory.ingredients.vegetable.*;

public class MexicanPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new ExtraCrispy();
    }

    @Override
    public Sauce createSauce() {
        return new HotSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Gouda();
    }

    @Override
    public Vegetable[] createVegetable() {
        Vegetable vegetables[] = {new Garlic(), new Onion(), new Beans(), new JalapenoPepper()};
        return vegetables;
    }

    @Override
    public Meat createMeat() {
        return new Pork();
    }

    @Override
    public Seafood createSeafood() {
        return new Squids();
    }
}
