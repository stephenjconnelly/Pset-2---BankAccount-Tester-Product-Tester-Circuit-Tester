/*
 * 
 * name:Stephen Connelly
 * UNI:sjc2235
 */
public class BankTester{

    public static void main(String[] args){
        //declares bank account
        BankAccount stephensAccount;
        stephensAccount =  new BankAccount("Stephen Connelly", 987654321);

        double balance = stephensAccount.getBalance();
      
        System.out.println("The intial balance of Stephen's Account is " + balance);
        
        stephensAccount.deposit(1000);
        System.out.println("The balance of Stephen's Account is " + 
        stephensAccount.getBalance());

        stephensAccount.withdraw(500);
        System.out.println("The balance of Stephen's Account is now " +  
        stephensAccount.getBalance());

        stephensAccount.withdraw(400);
        System.out.println("The balance of Stephen's Account now is " 
        + stephensAccount.getBalance());

    }

}
