package atm;

public class ATM {
 
    public static void main(String[] args) {
        accounts acc = new accounts();
        enterdetails ed = new enterdetails(acc);
        ed.details();
    }
    
}
