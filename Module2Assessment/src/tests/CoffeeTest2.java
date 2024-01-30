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

public class CoffeeTest2 {

	    @Test
	    public void testValidOrder() {
	        Coffee coffee = new Coffee("Caramel", "Medium", 3.99);

	        assertEquals("Caramel", coffee.getTopping());
	        assertEquals("Medium", coffee.getSize());
	        assertEquals(3.99, coffee.getPrice(), 3.99);
	        assertTrue(coffee.getOrderNumber() >= 1001);
	        assertNotNull(coffee.repeatOrder());
	    }

	    @Test
	    public void testInvalidSize() {
	        try {
	            Coffee coffee = new Coffee("Mocha", "Extra Large", 4.99);
	            fail("Expected IllegalArgumentException not thrown");
	        } catch (IllegalArgumentException e) {
	            assertEquals("Not a size", e.getMessage());
	        }
	    }

	    @Test
	    public void testSizeIsNull() {
	        try {
	            Coffee coffee = new Coffee("Latte", null, 2.49);
	            fail("Expected IllegalArgumentException not thrown");
	        } catch (IllegalArgumentException e) {
	            assertEquals("Not a size", e.getMessage());
	        }
	    }

	    @Test
	    public void testRepeatOrder() {
	        Coffee coffee = new Coffee("Hazelnut", "Small", 2.99);
	        String repeatedOrder = coffee.repeatOrder();

	        assertTrue(repeatedOrder.contains("Order #"));
	        assertTrue(repeatedOrder.contains("Hazelnut"));
	        assertTrue(repeatedOrder.contains("Small"));
	        assertTrue(repeatedOrder.contains("2.99"));
	    }
	}
