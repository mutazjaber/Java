import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
        // public String guestGreeting(String name) {
            
        //     return String.format("Hello, %s . Lovely to see you.","Mutaz jaber") ;
        // }
        public String guestGreeting() {
            Date now = new Date();
        SimpleDateFormat time = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(time.format(now));
        String x = "Good evening";
        String y = "afternoon";
        String z = "evening";
        if (hour >= 6 && hour < 12) {
            return x;
        } else if (hour >= 12 && hour < 18) {
            return y;
        } else {
            return z;
        }
        
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date ;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String name1 = "Alexis" ;
        String name2 = "Alfred";

        if (conversation.contains(name1)){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
            } 
        else if (conversation.contains(name2)) {
            return "At your service. As you wish, naturally."  ;
        }
        else{
            return "Right. And with that I shall retire.";
            }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}

