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
public class Business {
    
    private String name;
    private PersonDirectory personDirect;
    private UserAccDirectory userAccDirect;
    
    public Business(String n)
    {
        this.name = n;
        this.personDirect = new PersonDirectory();
        this.userAccDirect = new UserAccDirectory();
    }

    public PersonDirectory getPersonDirect() {
        return personDirect;
    }

    public void setPersonDirect(PersonDirectory personDirect) {
        this.personDirect = personDirect;
    }

    public UserAccDirectory getUserAccDirect() {
        return userAccDirect;
    }

    public void setUserAccDirect(UserAccDirectory userAccDirect) {
        this.userAccDirect = userAccDirect;
    }
    
}
