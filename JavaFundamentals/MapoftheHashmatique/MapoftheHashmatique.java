import java.util.HashMap;
import java.util.Set;

/**
 * MapoftheHashmatique
 */
public class MapoftheHashmatique {

    public static void main(String[] args) {
            HashMap<String, String> map = new HashMap<>();
            map.put("emeneim" , " i am not afraid \n");
            map.put("Emenim" , " Losing my self\n");
            map.put("back street boys" , " show me the meaning\n");
            map.put("back street boys" , " why\n");

            map.put("omar diyab" , " tamli ma3ak\n");
            // System.out.println("\nPrinting all elements in the Hashmap : ");
            // System.out.println(map);
            String song = map.get("emeneim");
            // System.out.println(song);

            Set<String> key = map.keySet();
            for (String Keys : key ){
                System.out.println(Keys +" : "+song );

            }

        
    }
}