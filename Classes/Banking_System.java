package Classes;

import java.util.ArrayList;
import java.util.List;

 public class Banking_System{
    
      
    

    
     

    public static void main(String[] args) {
            Bank pankaj = new Bank();
            pankaj.createAccount("Pankaj Thakur", "1223345679912556", 2000000);

            pankaj.deposit("1223345679912556", 1500);

            pankaj.toString();

            pankaj.withdraw("1223345679912556", 2000000);

            pankaj.toString();
            
    }
}


class Account {

    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

    @Override
    public String toString() {
        return ("Account Holder: " + name + "\n" + "Account Number: " + accountNumber + "\n" + "Balance: $" + balance);
    }
}


class Bank{

    private List<Account> accounts;

    public Bank(){
       this.accounts = new ArrayList<>();
    }

    // Method to create a new Account
    public void createAccount(String name , String accountNumber , double initialBalance){
       Account account = new Account(name, accountNumber, initialBalance);
       accounts.add(account);
    }

    // Method to deposit funds into an account
    public void deposit (String accountNumber , double amount){
       Account account = findAccount(accountNumber);
       if(account != null){
           account.deposit(amount);
           System.out.println("Deposit successful. New balance: $" + account.getBalance());
       } else{
           System.out.println("Account Not Found");
       }
    }

     // Method to withdraw funds from an account
     public void withdraw(String accountNumber , double amount){
       Account account = findAccount(accountNumber);
       if(account != null){
           if (account.withdraw(amount)) {
               System.out.println("withDrawal SuccessFull. New Balance : $" + account.getBalance());
           } else{
               System.out.println("Account Not Sufficient");
           }
       } else{
           System.out.println("Account Not Found");
       }
     }


     // Method to find an account by account number
     private Account findAccount(String accountNumber){
       for(Account account : accounts){
           if (account.getAccountNumber().equals(accountNumber)) {
               return account;
           }
       }
       return null;
     }


     // Method to display account information (optional)
     public void displayAccountInfo(String accountNumber){
       Account account = findAccount(accountNumber);
       if (account!= null) {
           System.out.println(account);
       } else{
           System.out.println("Account not Found");
       }
     }

   }