import java.util.ArrayList;
import java.util.Arrays;
import java.text.*;

public class TestCafeAssign {
    public static void main(String[] args) {

      CafeAssign appTest = new CafeAssign();


        System.out.println("\n----- Streak Goal Test -----");

        System.out.printf("Purchases needed by week 10: %s \n\n",appTest.getStreakGoal(5));

        System.out.println("----- Order Total Test-----");

        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
        String name = menu.get(0);
        System.out.println(name);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();

        
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
        appTest.printPriceChart("Colombian Coffee Grounds",15.0 ,3);
    }
}   
