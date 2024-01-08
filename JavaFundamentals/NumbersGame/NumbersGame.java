import java.util.Random;

public class NumbersGame {
    public static void main(String[] args) {
        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");

        int answer = new Random().nextInt(11); 
        int attempts = 0;
        int MAX_ATTEMPTS = 3;

        while (attempts < MAX_ATTEMPTS) {
            String guess = System.console().readLine();

            if (guess.equals("q")) {
                System.out.println("I knew you didn't have it in you.");
                System.out.println("Shutting down...");
                System.exit(0); 
            }

            try {
                int parsedGuess = Integer.parseInt(guess);

                if (parsedGuess < 0 || parsedGuess > 10) {
                    System.out.println("Please guess a number between 0 and 10.");
                } else if (parsedGuess == answer) {
                    System.out.println("Lucky guess! But can you do it again?");
                    break;
                } else {
                    System.out.println("Swing and a miss! Keep trying...");
                    attempts++;
                    if (attempts == MAX_ATTEMPTS) {
                        System.out.println("You've run out of attempts. Better luck next time!");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }
        }
        System.out.println("Game over. Shutting down...");
        System.out.println("Would you like to play again? (yes/no)");
        String playAgain = System.console().readLine();
        if (playAgain.equalsIgnoreCase("yes")) {
            main(args); 
        }
    }
}
