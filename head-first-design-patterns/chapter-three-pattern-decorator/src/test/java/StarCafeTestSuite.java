import org.junit.Assert;
import org.junit.Test;
import starcafe.*;

public class StarCafeTestSuite {
    @Test
    public void testDecoratingBeverages() {
        //Given
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.cost() + " PLN.");

        Beverage beverage1 = new HeavilyRoasted();
        beverage1 = new Chocolate(beverage1);
        beverage1 = new Chocolate(beverage1);
        beverage1 = new WhippedCream(beverage1);
        System.out.println(beverage1.getDescription() + " " + beverage1.cost() + " PLN.");

        Beverage beverage2 = new StarCafeSpecial();
        beverage2 = new SoyMilk(beverage2);
        beverage2 = new Chocolate(beverage2);
        beverage2 = new WhippedCream(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.cost() + " PLN.");

        //When
        String receipt = beverage.getDescription();
        String receipt1 = beverage1.getDescription();
        String receipt2 = beverage2.getDescription();

        double cost = beverage.cost();
        double cost1 = beverage1.cost();
        double cost2 = beverage2.cost();

        //Then
        Assert.assertEquals("Coffee Espresso", receipt);
        Assert.assertEquals("Heavily Roasted Coffee, Chocolate, Chocolate, Whipped Cream", receipt1);
        Assert.assertEquals("Coffee Star Cafe Special, Soy Milk, Chocolate, Whipped Cream", receipt2);

        Assert.assertEquals(1.99, cost, 0.001);
        Assert.assertEquals(1.49, cost1, 0.001);
        Assert.assertEquals(1.34, cost2, 0.001);
    }
}
