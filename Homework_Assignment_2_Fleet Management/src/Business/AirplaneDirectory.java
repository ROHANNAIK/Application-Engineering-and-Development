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

public class AirplaneDirectory {

   
     private ArrayList<Airplane> airplaneDirectory;
    
    public AirplaneDirectory()
    {
        airplaneDirectory = new ArrayList<Airplane>();
    }

    public ArrayList<Airplane> getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(ArrayList<Airplane> airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }
    
    public Airplane addFlight()
    {
      Airplane ap = new Airplane();
      airplaneDirectory.add(ap);
      return(ap);
    }
    
    public void deleteFlight(Airplane ap)
    {
        airplaneDirectory.remove(ap);
    }
}
