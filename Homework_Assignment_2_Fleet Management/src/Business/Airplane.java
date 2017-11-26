/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.util.Date;

/**
 *
 * @author Rohan
 */
public class Airplane {
    
    private String flightNumber;
    private String modelNumber;
    private String airlinesName;
    private String manufacName;
    private int manufacYear;
    private int availabilityOfSeats;
    private String airportName;
    private String expiredMain;
    private String availabilityOfPlanes;
    private Date   lastUpdate;

    public String getFlightNumber() {
        return flightNumber;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getAirlinesName() {
        return airlinesName;
    }

    public void setAirlinesName(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    public String getManufacName() {
        return manufacName;
    }

    public void setManufacName(String manufacName) {
        this.manufacName = manufacName;
    }

    public int getManufacYear() {
        return manufacYear;
    }

    public void setManufacYear(int manufacYear) {
        this.manufacYear = manufacYear;
    }

    public int getAvailabilityOfSeats() {
        return availabilityOfSeats;
    }

    public void setAvailabilityOfSeats(int availabilityOfSeats) {
        this.availabilityOfSeats = availabilityOfSeats;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getExpiredMain() {
        return expiredMain;
    }

    public void setExpiredMain(String expiredMain) {
        this.expiredMain = expiredMain;
    }

    public String getAvailabilityOfPlanes() {
        return availabilityOfPlanes;
    }

    public void setAvailabilityOfPlanes(String availabilityOfPlanes) {
        this.availabilityOfPlanes = availabilityOfPlanes;
    }
    
    
}
