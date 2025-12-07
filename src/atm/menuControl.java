package atm;
import java.util.*;
public class menuControl {
    diposit dp;
    withdraw wt;
    enterdetails ed;
    public menuControl(diposit dp,enterdetails ed,withdraw wt)
    {
        this.dp = dp;
        this.ed = ed;
        this.wt = wt;
    }
    public void control()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Account Details\n2. Depisit\n3. Withdraw");
            int a = sc.nextInt();
            switch(a)
            {
                case 1:
                    ed.details();
                    break;
                case 2:
                    dp.amountDeposit();
                    break;
                case 3:
                    wt.withdrawamount();
                    break;
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Wrong Input !.....");
        }
    }
}
