package atm;

public class ATM {
 
    public static void main(String[] args) {
        accounts acc = new accounts();
        acc.accHolder();
        acc.accNumber();
        acc.accpin();
        acc.userName();
        acc.accBalance();
        enterdetails ed = new enterdetails(acc);
        diposit dp = new diposit(acc,ed);
        withdraw wt  = new withdraw();
        menuControl mn = new menuControl(dp,ed,wt);
        mn.control();
    }
    
}
