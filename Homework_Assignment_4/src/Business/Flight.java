/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rohan
 */
public class Flight {
    
    private String flightName;
    private String arrival;
    private String depart;
    private String timeSlot;
    private int price;
    private ArrayList<Seats> seatsList;
    
    public Flight()
    {
        seatsList = new ArrayList();
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getTimestamp() {
        return timeSlot;
    }

    public void setTimestamp(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public ArrayList<Seats> getSeatsList() {
        return seatsList;
    }

    public void setSeatsList(ArrayList<Seats> seatsList) {
        this.seatsList = seatsList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    @Override
    public String toString() {
        return flightName ;
        
    }

    
}
