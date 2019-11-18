package starcafe;

public class StarCafeSpecial extends Beverage {
    public StarCafeSpecial() {
        description = "Coffee Star Cafe Special";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
