/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rohan
 */
public class TravelAgency {
    
private FlightSchedule flightSch;
private AirlinerDirectory airlinerDirect;
private CustomerDirectory custDirect;


public TravelAgency()
    {
        flightSch = new FlightSchedule();
        airlinerDirect = new AirlinerDirectory();
        custDirect = new CustomerDirectory();
    }

    public FlightSchedule getFlightSch() {
        return flightSch;
    }

    public void setFlightSch(FlightSchedule flightSch) {
        this.flightSch = flightSch;
    }

    public AirlinerDirectory getAirlinerDirect() {
        return airlinerDirect;
    }

    public void setAirlinerDirect(AirlinerDirectory airlinerDirect) {
        this.airlinerDirect = airlinerDirect;
    }

    public CustomerDirectory getCustDirect() {
        return custDirect;
    }

    public void setCustDirect(CustomerDirectory custDirect) {
        this.custDirect = custDirect;
    }

   
    
}
