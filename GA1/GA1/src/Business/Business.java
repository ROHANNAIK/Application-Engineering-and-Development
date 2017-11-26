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
public class Business {
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private EmployeeDirectory employeedirectory;
    private MarketOfferCatalog marketOfferCatalog;
    private ArrayList<Market> marketList;
    private ArrayList<OrderList> orders;
    
    public Business() {
        this.supplierDirectory = new SupplierDirectory();
        this.masterOrderCatalog = new MasterOrderCatalog();
        this.employeedirectory = new EmployeeDirectory();
        this.marketOfferCatalog = new MarketOfferCatalog();
        this.marketList = new ArrayList<Market>();
        this.orders = new ArrayList<OrderList>();
        
    }

    public ArrayList<OrderList> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<OrderList> orders) {
        this.orders = orders;
    }


    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return employeedirectory;
    }

    public void setEmployeedirectory(EmployeeDirectory employeedirectory) {
        this.employeedirectory = employeedirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }
    
    
}
