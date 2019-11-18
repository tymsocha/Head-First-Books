package ducksimulator;

public class WildDuck extends Duck {
    public WildDuck() {
        flyingInterface = new IFlyAsIHaveWings();
        quackingInterface = new Quack();
    }

    public void show() {
        System.out.println("I am real Wild Duck");
    }
}
