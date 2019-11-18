package pizzafactory.ingredients;

import pizzafactory.ingredients.cheese.Cheese;
import pizzafactory.ingredients.cheese.Mozzarella;
import pizzafactory.ingredients.dough.Dough;
import pizzafactory.ingredients.dough.FatCrunchyDough;
import pizzafactory.ingredients.meat.Chicken;
import pizzafactory.ingredients.meat.Meat;
import pizzafactory.ingredients.sauce.Sauce;
import pizzafactory.ingredients.sauce.TomatoSauce;
import pizzafactory.ingredients.seafood.Seafood;
import pizzafactory.ingredients.seafood.Shrimps;
import pizzafactory.ingredients.vegetable.Eggplant;
import pizzafactory.ingredients.vegetable.Olives;
import pizzafactory.ingredients.vegetable.Spinach;
import pizzafactory.ingredients.vegetable.Vegetable;

public class AmericanPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Dough createDough() {
        return new FatCrunchyDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Meat createMeat() {
        return new Chicken();
    }

    @Override
    public Seafood createSeafood() {
        return new Shrimps();
    }

    @Override
    public Vegetable[] createVegetable() {
        Vegetable vegetables[] = { new Eggplant(), new Olives(), new Spinach()};
        return vegetables;
    }
}
