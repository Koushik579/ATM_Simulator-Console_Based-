package atm;
import java.util.*;
public class diposit {
    accounts acc;
    enterdetails ed;
    public diposit(accounts acc,enterdetails ed)
    {
        this.acc = acc;
        this.ed = ed;
    }
    public void amountDeposit()
    {
        ed.details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of deposit : ");
        int am = sc.nextInt();
        int currentBalance  = acc.accbalance.get(ed.index) + am;
        acc.accbalance.set(ed.index, currentBalance);
        System.out.println("\nAvailable Balance : " + currentBalance);
    }
}
