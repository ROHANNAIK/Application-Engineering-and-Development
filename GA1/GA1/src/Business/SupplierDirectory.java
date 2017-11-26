/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author shwet
 */
public class SupplierDirectory {
    private ArrayList<Suppliers> supplierdirectory;

    public SupplierDirectory() {
        supplierdirectory = new ArrayList<Suppliers>();
    }

    public ArrayList<Suppliers> getSupplierdirectory() {
        return supplierdirectory;
    }

    public void setSupplierdirectory(ArrayList<Suppliers> supplierdirectory) {
        this.supplierdirectory = supplierdirectory;
    }
    
     public Suppliers addSupplier(){
      Suppliers s = new Suppliers();
      supplierdirectory.add(s);
      return s;
  }
    
  public void removeSupplier(Suppliers s){
      supplierdirectory.remove(s);
  }
  public Suppliers searchSupplier(String name){
    for(Suppliers supplier : supplierdirectory)
    {
        if(supplier.getSupplierName().equals(name)){
            return supplier;
        }
    }
    return null;
}
}
