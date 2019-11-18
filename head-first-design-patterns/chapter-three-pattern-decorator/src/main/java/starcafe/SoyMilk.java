package starcafe;

public class SoyMilk extends DecoratingComponent {
    Beverage beverage;

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
