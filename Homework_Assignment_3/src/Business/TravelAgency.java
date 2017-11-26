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
    
private MasterSchedule master;



public TravelAgency()
    {
        master = new MasterSchedule();
        
    }

    public MasterSchedule getMaster() {
        return master;
    }

    public void setMaster(MasterSchedule master) {
        this.master = master;
    }

   
    
}
