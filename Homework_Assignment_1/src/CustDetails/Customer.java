/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustDetails;

import java.sql.Date;

/**
 *
 * @author Rohan
 */

public class Customer {
    
    private String firstname;
    private String lastname;
    private String dob;
    private int ssn;
    private Address add;
    private LicenseDetails licenseDetails;
    private CreditCardInfo creditCard;
    private FinancialAccountInfo fa;
    String pathname;

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    public FinancialAccountInfo getFa() {
        return fa;
    }

    public void setFa(FinancialAccountInfo fa) {
        this.fa = fa;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public LicenseDetails getLicenseDetails() {
        return licenseDetails;
    }

    public void setLicenseDetails(LicenseDetails licenseDetails) {
        this.licenseDetails = licenseDetails;
    }

    public CreditCardInfo getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCardInfo creditCard) {
        this.creditCard = creditCard;
    }

    public FinancialAccountInfo getFinancialAcc() {
        return financialAcc;
    }

    public void setFinancialAcc(FinancialAccountInfo financialAcc) {
        this.financialAcc = financialAcc;
    }
    private FinancialAccountInfo financialAcc;
    
   
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }  

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

  

  
}
