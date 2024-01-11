import java.util.ArrayList;

public class TestOrders {
	public static void main(String[] args) {
		// Creating two objects by calling the Order() constructor without args
		CoffeeKiosk kiosk = new CoffeeKiosk();

		kiosk.addMenuItem("moca", 10.1);

		kiosk.addMenuItem("latteh", 11.5);
		kiosk.addMenuItem("drip coffee", 12.3);
		kiosk.addMenuItem("cappuccino", 13.2);
		kiosk.newOrder();
        

	}
}