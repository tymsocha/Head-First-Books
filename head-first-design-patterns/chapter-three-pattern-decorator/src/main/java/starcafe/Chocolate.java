package starcafe;

public class Chocolate extends DecoratingComponent {
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
