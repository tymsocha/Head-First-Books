package ducksimulator;

public abstract class Duck {
    FlyingInterface flyingInterface;
    QuackingInterface quackingInterface;

    public abstract void show();

    public void doFly() {
        flyingInterface.fly();
    }

    public void doQuack() {
        quackingInterface.quack();
    }

    public void swim() {
        System.out.println("All Ducks are able to swim!!");
    }

    public void setFlyingInterface(FlyingInterface flyingInterface) {
        this.flyingInterface = flyingInterface;
    }

    public void setQuackingInterface(QuackingInterface quackingInterface) {
        this.quackingInterface = quackingInterface;
    }
}
