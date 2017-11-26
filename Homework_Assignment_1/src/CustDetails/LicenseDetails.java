/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustDetails;

import java.util.Date;



/**
 *
 * @author Rohan
 */
public class LicenseDetails {
    
    private String licenseType;
    private String issueDate;
    private String expDate;
    private int licenseNum;
    private String StatelicenseIssued;

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }



    public int getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(int licenseNum) {
        this.licenseNum = licenseNum;
    }


    public String getStatelicenseIssued() {
        return StatelicenseIssued;
    }

    public void setStatelicenseIssued(String StatelicenseIssued) {
        this.StatelicenseIssued = StatelicenseIssued;
    }
   

    
}
