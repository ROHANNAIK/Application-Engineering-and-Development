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
public class SeatDirectory {
    
    private ArrayList<Seats> seatDirectory;
    
    public SeatDirectory()
    {
        seatDirectory = new ArrayList<Seats>();
    }

    public ArrayList<Seats> getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(ArrayList<Seats> seatDirectory) {
        this.seatDirectory = seatDirectory;
    }
    
}
