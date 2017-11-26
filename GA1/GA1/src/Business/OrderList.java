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
public class OrderList {
    
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private static int count=0;
    private Persons salesPerson;

    public Persons getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(Persons salesPerson) {
        this.salesPerson = salesPerson;
    }
    
    public OrderList() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

public OrderItem addOrders(Product p, int q, int price, MarketOffer marketOffer){
      OrderItem orderItem = new OrderItem();
      orderItem.setProduct(p);
      orderItem.setQuantity(q);
      orderItem.setSalesPrice(price);
      orderItem.setMarketOffer(marketOffer);
      orderItemList.add(orderItem);
      return orderItem;
  }
    
  public void removeOrders(OrderItem orderItem){
      orderItemList.remove(orderItem);
  }
  
  public int orderTotal()
  {
      int totalPriceOrder=0;
      for(OrderItem item : orderItemList)
      {
          totalPriceOrder = totalPriceOrder + item.orderItemTotal();
      }
      return totalPriceOrder;
  }
    
}
 