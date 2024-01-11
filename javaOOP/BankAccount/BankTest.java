import java.io.PrintStream;
import java.util.Scanner;
public class BankTest {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        // BankAccount account2 = new BankAccount();
        // BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        System.out.println("Deposit test:");
        System.out.println(account1.deposit(300));
        // System.out.println(account2.deposit(1200));
        // System.out.println(account3.deposit(500));
        // scanner.close();



        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println("withdraw test:");
        System.out.println(account1.withdraw(100));
        // System.out.println(account2.withdraw(1200));
        // System.out.println(account3.withdraw(500));
        scanner.close();
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getTotalMoney());
        
    }
}
