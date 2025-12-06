package atm;

public class ATM {
 
    public static void main(String[] args) {
        accounts acc = new accounts();
        acc.accHolder();
        acc.accNumber();
        acc.accpin();
        acc.userName();
        enterdetails ed = new enterdetails(acc);
        ed.details();
    }
    
}
