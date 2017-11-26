/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author shwet
 */
public class ConfigureABusiness {
    public static Business Initialize(String n)
    {
        
            Business business=new Business();
            EmployeeDirectory person = business.getEmployeedirectory();
            
            Persons per = person.addPerson();
            per.setFirstName("Shweta");
            per.setLastName("Pathak");
            per.setUserName("Admin");
            per.setPassword("Admin");
            per.setPersonType("Admin");
            per.setAge(21);
            
            Persons per1 = person.addPerson();
            per1.setFirstName("Shruti");
            per1.setLastName("Nanajkar");
            per1.setUserName("sp1");
            per1.setPassword("sp1");
            per1.setPersonType("SalesPerson");
            per1.setAge(23);
            
            Persons per2 = person.addPerson();
            per2.setFirstName("Rohan");
            per2.setLastName("Naik");
            per2.setUserName("sp2");
            per2.setPassword("sp2");
            per2.setPersonType("SalesPerson");
            per2.setAge(23);
            
            Market market1 = new Market();
            market1.setMarketName("Education");
            Market market2 = new Market();
            market2.setMarketName("Health");
            
            business.getMarketList().add(market1);
            business.getMarketList().add(market2);
            
        return business;
    
}
}
