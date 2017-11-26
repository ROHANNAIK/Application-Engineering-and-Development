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
public class FlightSchedule {
    
    private ArrayList <Flight> flightCollection;
    private Airliner airliner;
    
     public FlightSchedule()
    {
        flightCollection = new ArrayList();
        airliner = new Airliner();
    }

    public ArrayList<Flight> getFlightCollection() {
        return flightCollection;
    }

    public void setFlightCollection(ArrayList<Flight> flightCollection) {
        this.flightCollection = flightCollection;
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }
    
}
