package starcafe;

public class DeCaf extends Beverage {
    public DeCaf() {
        description = "DeCaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
