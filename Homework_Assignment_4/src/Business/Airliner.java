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
public class Airliner {
    
    private String headQuarters;
    private int fleetStrength;
    private String airlineName;
    

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getHeadQuarters() {
        return headQuarters;
    }

    public void setHeadQuarters(String headQuarters) {
        this.headQuarters = headQuarters;
    }

    public int getFleetStrength() {
        return fleetStrength;
    }

    public void setFleetStrength(int fleetStrength) {
        this.fleetStrength = fleetStrength;
    }

    @Override
    public String toString() {
        return  airlineName;
    }

   

}
