import java.text.NumberFormat;
import java.util.ArrayList;
import java.text.*;
public class CafeAssign {

   public int getStreakGoal(Integer numWeeks ){
    
    
    int sum =0;
    for(int i =1; i <= numWeeks; i++){
        
         sum += i;
    }
    return sum;

   }


public double getOrderTotal(double[] prices) {
        double sum = 0.0;
     
        for (double price : prices) {
            sum += price;
        }
        return sum;
}

void displayMenu(ArrayList<String> menuItems){
    for(String s : menuItems){
        System.out.println(s);
    }
}

public void addCustomer(ArrayList<String> customers){

    System.out.println("Please enter your name:");
    String username = System.console().readLine();
    System.out.println("Hello, " + username );
    int pepole = customers.size();
    System.out.println("There are " + pepole + " people in front of you");

    customers.add(username);
    System.out.println("Customers" + customers);

}

void printPriceChart(String product, double price, int maxQuantity){
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    System.out.println(product );
    System.out.println("price" + price );
    

    for(int i =1; i <= maxQuantity; i++){
        double cost = i * price;
        System.out.println(formatter.format(cost));
       
    }
      
}







}