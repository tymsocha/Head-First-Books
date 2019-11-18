package starcafe;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Coffee Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
