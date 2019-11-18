package pizzafactory;

import pizzafactory.ingredients.cheese.Cheese;
import pizzafactory.ingredients.dough.Dough;
import pizzafactory.ingredients.meat.Meat;
import pizzafactory.ingredients.sauce.Sauce;
import pizzafactory.ingredients.seafood.Seafood;
import pizzafactory.ingredients.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Vegetable vegetables[];
    protected Cheese cheese;
    protected Meat meat;
    protected Seafood seafood;
    protected List<String> extras = new ArrayList<>();


    protected abstract void preparePizza();

    public void bakePizza() {
        System.out.println("Baking pizza");
    }

    public void cuttingPizza() {
        System.out.println("Cutting pizza");
    }

    public void packingPizza() {
        System.out.println("Packing pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Vegetable[] getVegetables() {
        return vegetables;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Meat getMeat() {
        return meat;
    }

    public Seafood getSeafood() {
        return seafood;
    }

    public List<String> getExtras() {
        return extras;
    }
}
