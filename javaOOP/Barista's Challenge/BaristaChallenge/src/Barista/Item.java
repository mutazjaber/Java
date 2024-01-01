package Barista;
public class Item {
		
	    // MEMBER VARIABLES
	    private String name;
	    private double price;

		public Item(String name, double price) {
			super();
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
	    public String toString() {
	        return "Item [name=" + name + ", price=" + price + "]";
	    }

	    
	    // CONSTRUCTOR
	    //   Takes a name and price as arguments 
	    //   and sets them accordingly
	    
	    // GETTERS & SETTERS  - for name and price
	    
	

}
