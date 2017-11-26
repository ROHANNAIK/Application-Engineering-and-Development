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
    private String timestamp;
    private Airplane airplane;
    private ArrayList<Seats> seatsList;
    
    public Flight()
    {
        airplane = new Airplane();
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
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

   

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public ArrayList<Seats> getSeatsList() {
        return seatsList;
    }

    public void setSeatsList(ArrayList<Seats> seatsList) {
        this.seatsList = seatsList;
    }

    @Override
    public String toString() {
        return "Flight{" 
                + "flightName=" + flightName 
                + ", arrival=" + arrival 
                + ", depart=" + depart 
                + ", timestamp=" + timestamp 
                + ", airplane=" + airplane 
                + ", seatsList=" + seatsList + '}';
    }

    
}
