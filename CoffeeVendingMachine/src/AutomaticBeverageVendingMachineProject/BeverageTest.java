package AutomaticBeverageVendingMachineProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BeverageTest {
    
    @Test
    public void testOrderTotal() {
        Beverage espresso = new Espresso();
        Order order = new Order(espresso);

        assertEquals("The price of Espresso should be $2.0", 2.0, espresso.getPrice(), 0);
        
        order.addCondiment(new Sugar());
        assertEquals("The total should be $2.5 after adding one sugar", 2.5, order.getTotal(), 0);
        
        order.addCondiment(new Milk());
        assertEquals("The total should be $3.0 after adding one sugar and one milk", 3.0, order.getTotal(), 0);
    }

    @Test
    public void testCondimentAdditionLimit() {
        Beverage greenTea = new GreenTea();
        Order order = new Order(greenTea);

        Condiment sugar = new Sugar();
        for (int i = 0; i < 5; i++) sugar.add();
        order.addCondiment(sugar);

        Condiment milk = new Milk();
        for (int i = 0; i < 5; i++) milk.add();
        order.addCondiment(milk);

        assertEquals("The total should be $3.0 after adding three sugars and three milks to GreenTea", 4.5, order.getTotal(), 0);
    }
}

