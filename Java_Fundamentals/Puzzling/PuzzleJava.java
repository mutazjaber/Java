import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randoom = new ArrayList<>();
        Random randMachine = new Random();
        for(int i =0; i < 10; i++){
            randoom.add(randMachine.nextInt(20));

        }
        return randoom;
    }   

    public String getRandomLetter(){
        Random randChar = new Random();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = new char[26];
        for(int i =0; i < 26; i++){
            alphabet[i] = alpha.charAt(i);
        }
        return String.valueOf(alphabet[randChar.nextInt(26)]);
        
    }

  public String generatePassword(){
    String password = "";
    for(int i =0; i < 8; i++){
        password = password + getRandomLetter();
    }
    return password;
  }
  
  public ArrayList<String> getNewPasswordSet(int length) {

    ArrayList<String> passwordSet = new ArrayList<String>();
    for(int i = 0; i < length; i++) {
        passwordSet.add(generatePassword());
    }
    return passwordSet;

}

}
