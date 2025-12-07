package atm;
import java.util.*;
public class withdraw {
    public accounts acc;
    public enterdetails ed;
    public withdraw(accounts acc,enterdetails ed)
    {
        this.acc = acc;
        this.ed = ed;
    }
    public void withdrawamount()
    {
        ed.details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of deposit : ");
        int am = sc.nextInt();
        if(am > acc.accbalance.get(ed.index))
        {
            System.out.println("You don't have enough balance");
        }
        else
        {
            int currentBalance  = acc.accbalance.get(ed.index) - am;
            acc.accbalance.set(ed.index, currentBalance);
            System.out.println("\nAvailable Balance : " + currentBalance);
        }
    }
}
