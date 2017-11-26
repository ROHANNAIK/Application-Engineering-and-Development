/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Rohan
 */
public class CustomerDirectory {
    
    public ArrayList <Person> custDetails;
    
    public CustomerDirectory()
    {
        custDetails = new ArrayList <Person>();
    }

    public ArrayList<Person> getCustDetails() {
        return custDetails;
    }

    public void setCustDetails(ArrayList<Person> custDetails) {
        this.custDetails = custDetails;
    }
    
    
}
