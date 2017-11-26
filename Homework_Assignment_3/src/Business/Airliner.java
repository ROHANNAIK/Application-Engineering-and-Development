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
    
    //private ArrayList <Airplane> airplaneCollection;
    //private ArrayList <FlightSchedule> flightScheduler;
    //private Flight f;
    //private FlightSchedule fs;
    private Fleet fcatalog;
    private String airlineName;
    //private ArrayList <Flight> flightCollection;

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }


    
    public Airliner()
    {
        fcatalog = new Fleet();
        //airplaneCollection = new ArrayList<Airplane>();
        //flightScheduler = new ArrayList<FlightSchedule>();
        //flightCollection = new ArrayList<Flight>();
        //populateFlights();
        
    }

    public Fleet getFcatalog() {
        return fcatalog;
    }

    public void setFcatalog(Fleet fcatalog) {
        this.fcatalog = fcatalog;
    }

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    /**
     *
     * @author Rohan
     */
    public static class MasterSchedule {

        private ArrayList<FlightSchedule> flightScheduler;

        public MasterSchedule() {
            super();
            flightScheduler = new ArrayList();
        }
    }

}
