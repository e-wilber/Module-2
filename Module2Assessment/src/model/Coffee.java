package model;

/**
 * @author ${ewilber} - ewilber
 * CIS175 - Spring 2024
 * ${Jan 28, 2024}
 */
public class Coffee {
	private String topping = "";
	private String size = "";
	private double price = 0.0;
	int orderNumber;
	private static int nextOrderNumber = 1001;
	
	//GETTER FOR ORDERNUMBER
			public int getOrderNumber() {
				return orderNumber;
			}
			
	//GETTERS AND SETTERS
			public String getTopping() 
			{
				return topping;
			}
			public void setTopping(String topping) 
			{
				this.topping = topping;
			}
			public String getSize() 
			{
				return size;
			}
			
	//SET SIZE TO NULL IF NOT S M OR L 
			public void setSize(String size) 
			{
				if(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large") || size.equalsIgnoreCase("extra large")) {
					this.size = size;
				}else {
					this.size = null;
				}			
			}
			public double getPrice() 
			{
				return price;
			}
			public void setPrice(double price) 
			{
				this.price = price;
			}

	//METHOD THAT REPEATS THE ORDER
			public String repeatOrder() {
				String order;
				order = "Order #" + orderNumber + " You ordered a size " + size + " " + topping + " coffee for $" + price;
				return order;
			}		
		
			
	//CONSTRUCTOR WITH PARAMETERS	
			public Coffee(String topping, String size, double price) {
				setTopping(topping);
				setSize(size);
				setPrice(price);	
				nextOrderNumber++;
				orderNumber = nextOrderNumber;
				
	//THROW ILLEGALARGUMENTEXCEPTION IF SIZE = NULL
				if(this.size.equals(null)) {
					throw new IllegalArgumentException("Not a size");
				}
			}
	}

