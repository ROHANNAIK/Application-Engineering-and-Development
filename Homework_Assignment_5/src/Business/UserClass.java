/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Rohan
 */
public class UserClass {
    
    private String userAccType;
    private Person person;
    private String userName;
    private String password;
    private boolean flag;
    
    public UserClass(){
        
        person = new Person();
    }

    public boolean isFlag() {
        return flag;
    }


    public void setFlag(boolean flag) {
        this.flag = flag;
    }

        public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAccType() {
        return userAccType;
    }

    public void setUserAccType(String userAccType) {
        this.userAccType = userAccType;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    @Override
    public String toString() {
        return userName; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String generateHash(String password) {
		StringBuilder hash = new StringBuilder();

		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] hashedBytes = md.digest(password.getBytes());
			char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'a', 'b', 'c', 'd', 'e', 'f' };
			for (int idx = 0; idx < hashedBytes.length; ++idx) {
				byte b = hashedBytes[idx];
				hash.append(digits[(b & 0xf0) >> 4]);
				hash.append(digits[b & 0x0f]);
			}
		} catch (NoSuchAlgorithmException e) {
			
		}

		return hash.toString();
	}
    
}
