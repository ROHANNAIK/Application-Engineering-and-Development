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
public class CreditCardInfo {
    
    private String bnkName;
    private String issueDate;
    private String expDate;
    private int cardNum;
    private String nameOnCard;

    public String getBnkName() {
        return bnkName;
    }

    public void setBnkName(String bnkName) {
        this.bnkName = bnkName;
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

    public Integer getCardNum() {
        return cardNum;
    }

    public void setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
    }

 

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }
    
}
