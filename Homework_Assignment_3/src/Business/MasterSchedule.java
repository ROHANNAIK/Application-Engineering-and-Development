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
public class MasterSchedule {
    
     private ArrayList <FlightSchedule> flightschedule;
     
     public MasterSchedule()
    {
        flightschedule = new ArrayList();
    }

    public ArrayList<FlightSchedule> getFlightschedule() {
        return flightschedule;
    }

    public void setFlightschedule(ArrayList<FlightSchedule> flightschedule) {
        this.flightschedule = flightschedule;
    }
    
}
