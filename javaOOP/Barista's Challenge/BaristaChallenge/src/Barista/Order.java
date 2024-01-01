package Barista;
import java.util.ArrayList;
public class Order {
	
    

	    // MEMBER VARIABLES
	    private String name; // default value of null
	    private boolean ready; // default value false
	    private ArrayList<Item> items = new ArrayList<>();
	    
	    public Order () {
	    	
	    	
	    }
	    
		public Order(String name, boolean ready, ArrayList<Item> items) {
			super();
			this.name = name;
			this.ready = ready;
			this.items = items;
			 
			
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isReady() {
			return ready;
		}

		public void setReady(boolean ready) {
			this.ready = ready;
		}

		public ArrayList<Item> getItems() {
			return items;
		}

		public void setItems(ArrayList<Item> items) {
			this.items = items;
		}
	    
	    public void addItem(Item item) {
	    	items.add(item);
	    	System.out.println(item.getName()+ item.getPrice());
	    	
	    }
	    	
	    public String orderisReady() {
	    	if (ready== true) {
	    		return ("this order is redy");
	    }
	    	else {
	    		return ("this order is not redy");
	    	}
	    }
	    public	double total() {
	    	double sum = 0;
	    	for (Item item : items ) {
	    		
	    	sum += item.getPrice();
	    	
	    	}
			return sum;
		
	    	
	    	
	    }

		@Override
		public String toString() {
			return "Order [name=" + name + ", ready=" + ready + ", items=" + items + ", getName()=" + getName()
					+ ", isReady()=" + isReady() + ", getItems()=  "+ getItems() + ", orderisReady()=" + orderisReady()
					+ ", total()=" + total() + "]";
		}
		public String tooString() {
	        return "Order [name=" + name + ", ready=" + ready + ", items=" + items
	                + ", total()=" + total() + "]";
	    }
		
	    
	    // CONSTRUCTOR
	    // No arguments, sets name to "Guest", initializes items as an empty list.
	    
	    // OVERLOADED CONSTRUCTOR
	    // Takes a name as an argument, sets name to this custom name.
	    // Initializes items as an empty list.
	    
	    // ORDER METHODS
	    
	    	// Most of your code will go here, 
	    	// so implement the getters and setters first!
	    
	    // GETTERS & SETTERS
	    
	



}
