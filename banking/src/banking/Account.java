
package banking;

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
