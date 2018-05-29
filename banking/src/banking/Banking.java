
package banking;
import java.util.Scanner;

 class Account 
{
    double accno;
    double bal;
    public static int count=0;
    
    
    Account(double acc, double balan)
    {
        accno=acc;
        bal=balan;
        count++;
    }
    
    void deposit(double damt)
    {
        bal+=damt;
    }
    
    void withdraw(double wamt)
    {
        bal-=wamt;    
    }
    
    
}


public class Banking 
{
    
    
    public static void main(String[] args) 
    {
       Account[] a = new Account[20];
       Scanner inp = new Scanner(System.in);
       System.out.println("Enter 1.Create 2.Deposit 3.Withdraw 4.Transfer 5.Total amount 6.Richest person. ");
       System.out.println("Enter the choice ");
       int ch = inp.nextInt();
       
       switch(ch)
       {
           case 1:{ 
                    System.out.println("Enter the account number ");
                    int acc = inp.nextInt();
                    int i;
                    for(i=0;i<count;i++)
                    {
                        if(a[i].accno==acc)
                        {
                            System.out.println("Account exists");
                            break;
                        }
                    }
                    
               
                   }
       }
    }
    
}
