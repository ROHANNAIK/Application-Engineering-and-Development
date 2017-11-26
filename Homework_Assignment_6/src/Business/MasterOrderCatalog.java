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
public class MasterOrderCatalog {
    
    private ArrayList<OrderItem> orderCatalog;

    public MasterOrderCatalog() {
       orderCatalog = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<OrderItem> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    public OrderItem addOrders(OrderItem orderItem){
 
      orderCatalog.add(orderItem);
      return orderItem;
  }
    
  public void removeOrders(OrderItem orderItem){
      orderCatalog.remove(orderItem);
  }
    
}
