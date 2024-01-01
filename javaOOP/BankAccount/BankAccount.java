import java.util.Scanner;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(){
        accounts++;
    }

        // GETTERS
    // for checking, savings, accounts, and totalMoney

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }   
    



    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public double deposit (double money){
        System.out.println("enter account type checking or saving ");
        String accountType = System.console().readLine();
        if (accountType.equalsIgnoreCase("checking")){
            checkingBalance += money;
            totalMoney += money;
            return checkingBalance;
        }
        else if (accountType.equalsIgnoreCase("saving")){
            savingsBalance += money;
            totalMoney += money;
            return savingsBalance;
        }
        else{
            System.out.println("Invalid input");
            return -1;
        }
        
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
        public double withdraw  (double money){
        System.out.println("enter account type checking or saving ");
        String accountType = System.console().readLine();
        if (accountType.equalsIgnoreCase("checking") &&( money <= checkingBalance) ){
            checkingBalance -= money;
            totalMoney -= money;
            return checkingBalance;
        }
        else if (accountType.equalsIgnoreCase("saving") && (money <= savingsBalance)){
            savingsBalance -= money;
            totalMoney -= money;
            return savingsBalance;
        }
        else{
            System.out.println("Invalid input");
            return -1;
        }
        
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
        System.out.printf("Checking Balance: $%.2f\n", checkingBalance);
        System.out.printf("Savings Balance : $%.2f\n", savingsBalance);
        System.out.printf("Total Money     : $%.2f\n",totalMoney);
        }
        
}
