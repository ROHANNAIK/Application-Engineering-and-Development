/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Rohan
 */
public class ConfigureABusiness {
    
    public static Business Initialize (String n)
    {
        Business b = new Business(n);
        PersonDirectory pd = b.getPersonDirect();
        Person p = pd.addPerson();
        p.setFirstName("Rohan");
        p.setLasttName("Naik");
        UserAccDirectory ud = b.getUserAccDirect();
        UserClass uc = ud.addUserClass();
        uc.setUserName("rnaik");
        uc.setPassword(UserClass.generateHash("rohan123"));
        uc.setUserAccType("Admin");
        uc.setPerson(p);
        uc.setFlag(true);
        p = null;
        uc = null;
        
        p= pd.addPerson();
        p.setFirstName("John");
        p.setLasttName("Simon");
        uc = ud.addUserClass();
        uc.setUserName("john");
        uc.setPassword(UserClass.generateHash("asdf123"));
        uc.setUserAccType("HR");
        uc.setPerson(p);
        uc.setFlag(true);
        p = null;
        uc = null;
        return b;
    }
}
