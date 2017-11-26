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
public class Person {
    
    private static int count = 0;
    private String firstName;
    private String lasttName;

    //private int price;
    private int productID;

    
public Person() {
        count++;
        productID = count;
    }
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    
    @Override
    public String toString() {
        return firstName + " "+ lasttName; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
