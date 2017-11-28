
//***********************************************************
// TestAccounts1
// A simple program to test the numAccts method of the
// Account class.  
//***********************************************************
package Lab1;
import java.util.Scanner;
public class TestAccounts1
{
    public static void main(String[] args)
    {
        Account testAcct;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        for (int i=1; i<=num; i++)
            {
                testAcct = new Account(100, "Name" , i);
                System.out.println("\nCreated account " + testAcct);
                System.out.println("Now there are " + Account.getNumAccounts() +
                                   " accounts");
        
               }
        //testAcct.close();
        
        Account acct2 = new Account(100, "Joe", 123);
        Account acct3 = new Account (200, "Joe", 1234);
        Account acct4 = Account.consolidate( acct2,  acct3);
        System.out.println(acct4);
        //Print the three accounts, then close the first account and try to consolidate the second and third into a new account.  
        //Now print the accounts again, including the consolidated one if it was created.  
        //This can be done with a unit test or you can write the expected results in a main method within the driver class.                           
    }
}