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
public class Fleet {
    
    private ArrayList<Airplane> airplaneList;
    
    public ArrayList<Airplane> getAirplaneList(){
    return airplaneList;
}
    public Fleet()
    {
        airplaneList = new ArrayList();
    }

    public void setAirplaneList(ArrayList<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }

    
}
