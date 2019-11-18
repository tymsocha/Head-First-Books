package ducksimulator;

public class IFlyAsIHaveWings implements FlyingInterface {
    @Override
    public void fly() {
        System.out.println("I believe i can fly, I believe I can touch the sky");
    }
}
