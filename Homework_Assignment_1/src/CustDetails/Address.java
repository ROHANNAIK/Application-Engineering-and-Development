/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustDetails;

/**
 *
 * @author Rohan
 */
public class Address {
    
    private String Addline1;
    private String Addline2;
    private String city;
    private String country;
    private Integer zipcode;
    

    public String getAddline1() {
        return Addline1;
    }

    public void setAddline1(String Addline1) {
        this.Addline1 = Addline1;
    }

    public String getAddline2() {
        return Addline2;
    }

    public void setAddline2(String Addline2) {
        this.Addline2 = Addline2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    
}
