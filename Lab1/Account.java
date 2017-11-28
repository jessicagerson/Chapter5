//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
package Lab1;
public class Account
{
  private double balance;
  private String name;
  private int acctNum;
  private static int numAccounts;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, int number){
    balance = initBal;
    name = owner;
    acctNum = number;
    numAccounts+=1;
  }
  
 
  public static int getNumAccounts(){
      return numAccounts;
    }
  
    
  public void close(){
      name += " CLOSED" ;
      balance = 0;
      numAccounts -=1;
    }
  
   
  //creates a new account whose balance is the sum of the balances in acct1 and acct2 and closes acct1 and acct2.  
  //The new account should be returned.  
  //The name of the account should remain the same, yet the account number of the first Account (acct1) should carry through for the new account. 
  public static Account consolidate(Account acct1, Account acct2){
      if (acct1.name.equals(acct2.name) && (acct1.acctNum != acct2.acctNum)){
          double balance = acct1.balance + acct2.balance;
          Account newAcct = new Account(balance, acct1.name, acct1.acctNum);
          acct1.close();
          acct2.close();
          return newAcct;
        }
      return null;
    }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount){
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
       
  }
  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount){
    balance += amount;
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance(){
    return balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString(){
      String statement= "";
      statement = "Name: " + this.name + "\tAccount Number: " + this.acctNum + "\tBalance: " + this.balance;
      return statement;
  }
  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public double chargeFee(){
      return this.balance -= 10;
  }
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  public void changeName(String newName) {
      this.name = newName;
  }
}
