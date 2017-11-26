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
public class Seats {
    

    //private int price;
    //private SeatCategoryEnum seatType;
   // private String firstname;
    //private String lastname;

    //private boolean isOccupied;
    //private Person seatAssignedTo;
    private String seatNumber;


    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return seatNumber;
    }

   

    
    
    
}
