public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 7.2;
        double dripCaffeePrice = 3.5; 
        double lattePrice = 5.6;
        double cappuccino =9.2;

        
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri ";
        String customer2 = "Sam ";
        String customer3 = "Jimmy ";
        String customer4 = "Noah ";


    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;


       if(isReadyOrder1){
         System.out.println( customer1 +readyMessage );
       }
       else{
        System.out.println(customer1 + pendingMessage );
       }

       if(isReadyOrder4){
         System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccino );
       }
       else{
        System.out.println(customer4 + pendingMessage );
       }

        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage + displayTotalMessage + 2*cappuccino );
        }
        else{
            System.out.println(customer4 + pendingMessage );
        }
            

        System.out.println(customer3 + isReadyOrder3+ displayTotalMessage + ( dripCaffeePrice - lattePrice) );
      

    }
}
