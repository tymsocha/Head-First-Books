import org.junit.Assert;
import org.junit.Test;
import pizzafactory.Pizza;
import pizzafactory.Pizzeria;
import pizzafactory.italian.ItalianPizzeria;

public class PizzeriaTestSuite {
    @Test
    public void testPizza() {
        //Given
        Pizzeria italianPizzeria = new ItalianPizzeria();
        //When
        Pizza pizza = italianPizzeria.orderPizza("cheese");
        //Then
        Assert.assertEquals("Italian Cheese Pizza", pizza.getName());
    }
}
