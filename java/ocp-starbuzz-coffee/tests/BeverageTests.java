import junit.framework.TestCase;

public class BeverageTests extends TestCase {
	
    public void testExpresso() {
        // arrange
        Beverage beverage = new Expresso();

        // act
        double cost = beverage.getCost();

        // assert
        assertEquals(5.0, cost);
    }

    public void testExpressoWithMocha()
    {
        // arrange
        Beverage beverage = new ExpressoWithMocha();

        // act
        double cost = beverage.getCost();

        // assert
        assertEquals(5.5, cost);
    }

    public void testExpressoWithSteamedMilkAndMocha()
    {
        // arrange
        Beverage beverage = new ExpressoWithSteamedMilkAndMocha();

        // act
        double cost = beverage.getCost();

        // assert
        assertEquals(6.5, cost);
    }
}