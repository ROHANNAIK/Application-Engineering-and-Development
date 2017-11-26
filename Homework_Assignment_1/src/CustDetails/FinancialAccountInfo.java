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
public class FinancialAccountInfo {
    
    private String accType;
    private String bnkName;
    private String bnkAdd;
    private String status;
    private String balanceStatus;

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getBnkName() {
        return bnkName;
    }

    public void setBnkName(String bnkName) {
        this.bnkName = bnkName;
    }

    public String getBnkAdd() {
        return bnkAdd;
    }

    public void setBnkAdd(String bnkAdd) {
        this.bnkAdd = bnkAdd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBalanceStatus() {
        return balanceStatus;
    }

    public void setBalanceStatus(String balanceStatus) {
        this.balanceStatus = balanceStatus;
    }
    
}
