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
public class AirlinerDirectory {
    
    private ArrayList <Airliner> airlinerList;
    
    public AirlinerDirectory()
    {
        airlinerList = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }
    
    public Airliner addAirliner(){
        Airliner al = new Airliner();
        airlinerList.add(al);
        return al;
        
    }
    
    public void deleteAirliner(Airliner airliner) {
        airlinerList.remove(airliner);
    }
}
