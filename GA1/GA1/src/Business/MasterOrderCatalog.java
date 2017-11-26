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
    
    private ArrayList<OrderList> orderCatalog;

    public MasterOrderCatalog() {
       orderCatalog = new ArrayList<OrderList>();
    }

    public ArrayList<OrderList> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<OrderList> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }

   
    
    public OrderList addOrders(OrderList orderList){
 
      orderCatalog.add(orderList);
      return orderList;
  }
    
  public void removeOrders(OrderItem orderItem){
      orderCatalog.remove(orderItem);
  }
    
}
