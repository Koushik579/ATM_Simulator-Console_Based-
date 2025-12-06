package atm;
import java.util.*;
public class enterdetails {
    public accounts acc;
    public enterdetails(accounts acc)
    {
        this.acc = acc;
    }
    public void details()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your UserName : ");
            String user = sc.nextLine();
            int index = 0;
            for(int a = 0 ; a < acc.username.size(); a++)
            {
                String u = acc.username.get(a);
                if(u.equals(user))
                {
                    index = a;
                    System.out.println("Enter your Password : ");
                    int pass = sc.nextInt();
                    if(pass == acc.pin.get(index))
                    {
                        System.out.println("Account Holder : "+acc.accholder.get(index)+"\nAccount Number : "+acc.accnumber.get(index));
                        break;
                    }
                    else
                    {
                        System.out.println("Opps! Wrong Passward\n**Exiting For Security Reasons**\nYou may try again");
                        break;
                    }
                }
               /* else
                {
                    System.out.println("No such user found\n**Exiting For Security Reasons**\nYou may try again");
                    break;
                }*/
                
            }
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("Opps! Wrong Passward\n**Exiting For Security Reasons**\nYou may try again");
        }
    }
}
