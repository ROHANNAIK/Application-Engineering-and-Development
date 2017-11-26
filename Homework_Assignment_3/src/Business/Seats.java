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
    

    private int price;
    private SeatCategoryEnum seatType;
    private boolean isOccupied;
    private Person seatAssignedTo;
    private String seatNumber;
    

    public boolean isIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SeatCategoryEnum getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatCategoryEnum seatType) {
        this.seatType = seatType;
    }

   

    public Person getSeatAssignedTo() {
        return seatAssignedTo;
    }

    public void setSeatAssignedTo(Person seatAssignedTo) {
        this.seatAssignedTo = seatAssignedTo;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

   

    @Override
    public String toString() {
        return "Seats{" 
                + "price=" + price 
                + ", seatType=" + seatType 
                + ", isOccupied=" + isOccupied 
                + ", seatAssignedTo=" + seatAssignedTo 
                + ", seatNumber=" + seatNumber + '}';
    }
    
    
}
