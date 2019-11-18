package ducksimulator;

public class DuckModel extends Duck {
    public DuckModel() {
        flyingInterface = new IDontFly();
        quackingInterface = new Quack();
    }

    @Override
    public void show() {
        System.out.println("It's a Duck Model!");
    }
}
