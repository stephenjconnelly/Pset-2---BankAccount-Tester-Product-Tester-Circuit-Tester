/*
 * 
 *
 * name:Stephen Connelly
 * UNI:sjc2235
 * BankAccount.java
 */
 public class BankAccount{

    //declaring variables
    private double balance;
    private String name;
    private int acctNumber;

    //initializes instance variables 
    public BankAccount(String initName, int acct){
        name=initName;
        acctNumber=acct;
        balance=0.0;
    }

    public void deposit(double amt){
        balance=balance+amt;
    }

    public void withdraw(double amt){
        balance=balance-amt;
    }

    public double getBalance(){
        return balance;
    }
} 
