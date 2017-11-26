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
public class UserAccDirectory {
    
    
    private ArrayList<UserClass> userAccDirect;
    
    public UserAccDirectory() {
        userAccDirect = new ArrayList<UserClass>();
    }

    public ArrayList<UserClass> getUserAccDirect() {
        return userAccDirect;
    }


    
    public UserClass addUserClass() {
        UserClass u = new UserClass();
        userAccDirect.add(u);
        return u;
    }
    
    public void removeSupplier(UserClass u) {
        userAccDirect.remove(u);
    }
    
    /*public UserClass searchSupplier(String keyWord) {
        for(UserClass u : userAccDirect) {
            if(keyWord.equals(s.getSupplyName())) {
                return s;
            }
        }
        return null;
    }*/
    
    public UserClass isValidUser(String username, String password)
    {
        String hashPass = UserClass.generateHash(password);
        for (UserClass uc : userAccDirect)
        {
            if(uc.getUserName().equalsIgnoreCase(username) && uc.getPassword().equals(hashPass))
            {
                return uc;
            }
        }
        return null;
    }
    
    public boolean checkIfUserNameExists(String userName){
        for(UserClass userAccount : userAccDirect){
            if(userName.equalsIgnoreCase(userAccount.getUserName())){
                return true;
            }
        }
        return false;
    }
    }
    
