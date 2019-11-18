package ducksimulator;


import org.junit.Test;

public class DuckSimulator {
    @Test
    public void testWildDuck() {
        Duck wild = new WildDuck();
        wild.doFly();
        wild.doQuack();
    }

    @Test
    public void testDuckModelWithRocketFuel() {
        Duck model = new DuckModel();
        model.doFly();
        model.setFlyingInterface(new FlyWithRocketFuel());
        model.doFly();
    }
}
