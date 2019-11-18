package starcafe;

public class HeavilyRoasted extends Beverage {
    public HeavilyRoasted() {
        description = "Heavily Roasted Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
