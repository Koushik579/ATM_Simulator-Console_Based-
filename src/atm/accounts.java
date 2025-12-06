
package atm;

import java.util.*;

public class accounts {
    ArrayList<String> username = new ArrayList<>(); 
    ArrayList<String> accholder = new ArrayList<>(); 
    ArrayList<Integer> pin = new ArrayList<>(); 
    ArrayList<Integer> accnumber = new ArrayList<>();
    
    public void userName()
    {
        username.add("harry1954");
        username.add("rony1999");
        username.add("james1930");
        username.add("henry2003");
        username.add("ronit1997");
        username.add("priya2000");
        username.add("trecy1998");
    }
    public void accpin()
    {
        pin.add(1954);
        pin.add(1999);
        pin.add(1930);
        pin.add(2003);
        pin.add(1997);
        pin.add(2000);
        pin.add(1998);
    }
    public void accHolder()
    {
        accholder.add("Harry Disuza");
        accholder.add("Rony Das");
        accholder.add("James Bond");
        accholder.add("Henry Smith");
        accholder.add("Rohit Singh");
        accholder.add("Priya Roy");
        accholder.add("Trecy Gomez");      
    }
    public void accNumber()
    {
        accnumber.add(24101954);
        accnumber.add(24101954);
        accnumber.add(24101954);
        accnumber.add(24101954);
        accnumber.add(24101954);
        accnumber.add(24101954);
        accnumber.add(24101954);     
    }
}
