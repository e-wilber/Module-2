package tests;

/**
 * @author ${ewilber} - ewilber
 * CIS175 - Spring 2024
 * ${Jan 28, 2024}
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Coffee;

public class CoffeeTest {

    @Test
    public void testRepeatOrder() {
        Coffee coffee = new Coffee("Caramel", "Medium", 3.99);
        String expectedOrder = "Order #" + coffee.getOrderNumber() + " You ordered a size " + coffee.getSize() + " " + coffee.getTopping() + " coffee for $" + coffee.getPrice();
        assertEquals(expectedOrder, coffee.repeatOrder(), "Repeat order should return the expected string");
    }

    @Test
    public void testSetSizeValid() {
        Coffee coffee = new Coffee("Mocha", "Small", 2.49);
        assertEquals("Small", coffee.getSize(), "Size should be set to 'Small'");
    }

    @Test
    public void testSetSizeInvalid() {
        Coffee coffee = new Coffee("Hazelnut", "InvalidSize", 4.99);
        assertNull(coffee.getSize(), "Size should be null for invalid input");
    }
}
