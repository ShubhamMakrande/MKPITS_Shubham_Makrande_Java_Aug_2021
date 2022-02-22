package com.company;

public class decide {
    void checkob(Account ob)
    {

        if(ob instanceof current)
        {
            current ob1=(current) ob;
            ob.withdraw();
            ((current) ob).odFacility();
        }
        if(ob instanceof Saving)
        {
            Saving sob=new Saving();
            sob.withdraw();
        }
    }
}
