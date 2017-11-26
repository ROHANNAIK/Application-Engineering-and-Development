/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nanaj
 */
public class RevenueCalculation {

    public static Business business;

    public static int totalRevenueForBusiness() {
        int total = 0;
        for (OrderList order : business.getMasterOrderCatalog().getOrderCatalog()) {
            
                
                total += order.orderTotal();

            }
        
        return total;
    }

   

    public static ArrayList<Persons> top10SalesPersonByMarket(Market market) {
        ArrayList<Persons> resultList = new ArrayList<Persons>();
        HashMap<String, SalesPersonRevenue> revenueBySalesPersonHashMap = new HashMap<>();
        for (OrderList order : business.getOrders()) {
            int revenueByOrder = 0;
            for (OrderItem orderItem : order.getOrderItemList()) {
                if (market.getMarketName().equalsIgnoreCase(orderItem.getMarketOffer().getMarket().getMarketName())) {
                    revenueByOrder += orderItem.getQuantity() * orderItem.getSalesPrice();

                }

            }
            if (revenueBySalesPersonHashMap.containsKey(order.getSalesPerson().getUserName())) {
                SalesPersonRevenue salesPersonObject = revenueBySalesPersonHashMap.get(order.getSalesPerson().getUserName());
                int previousRevenue = salesPersonObject.getTotalRevenue();
                salesPersonObject.setTotalRevenue(previousRevenue + revenueByOrder);
                revenueBySalesPersonHashMap.put(order.getSalesPerson().getUserName(), salesPersonObject);
            } else {
                SalesPersonRevenue salesPersonRevenue = new SalesPersonRevenue();
                salesPersonRevenue.setPerson(order.getSalesPerson());
                salesPersonRevenue.setTotalRevenue(revenueByOrder);
                revenueBySalesPersonHashMap.put(order.getSalesPerson().getUserName(), salesPersonRevenue);
            }
        }
        revenueBySalesPersonHashMap = sortBySalesPersonRevenue(revenueBySalesPersonHashMap);
        Iterator<Map.Entry<String, SalesPersonRevenue>> it = revenueBySalesPersonHashMap.entrySet().iterator();
        int count = 0;
        while (it.hasNext() && count <= 10) {
            Map.Entry<String, SalesPersonRevenue> pair = (Map.Entry<String, SalesPersonRevenue>) it.next();
            resultList.add(pair.getValue().getPerson());
        }
        return resultList;

    }

    private static HashMap sortBySalesPersonRevenue(HashMap<String, SalesPersonRevenue> map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator<Map.Entry<String, SalesPersonRevenue>>() {
            @Override
            public int compare(Map.Entry<String, SalesPersonRevenue> o1, Map.Entry<String, SalesPersonRevenue> o2) {
                if (o1.getValue().getTotalRevenue() > o2.getValue().getTotalRevenue()) {
                    return 1;
                }
                if (o1.getValue().getTotalRevenue() < o2.getValue().getTotalRevenue()) {
                    return -1;
                }
                return 0;
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

    public static ArrayList<Persons> salesPersonWithAboveTargetSales() {
         ArrayList<Persons> resultList = new ArrayList<Persons>();
        HashMap<String, Persons> personsHashMap = new HashMap<>();
        for (OrderList order : business.getOrders()) {
            boolean orderItemAboveTargetPrice = false;
            for (OrderItem orderItem : order.getOrderItemList()) {
                if (orderItem.getSalesPrice() > orderItem.getMarketOffer().getMarketOfferPrice()) {
                    orderItemAboveTargetPrice = true;

                }

            }
            if(orderItemAboveTargetPrice == true){
                if(!personsHashMap.containsKey(order.getSalesPerson().getUserName())){
                    personsHashMap.put(order.getSalesPerson().getUserName(), order.getSalesPerson());
                }
            }
        }
        resultList.addAll(personsHashMap.values());
        return resultList;


    }

    public static ArrayList<Persons> salesPersonWithBelowTargetSales() {
         ArrayList<Persons> resultList = new ArrayList<Persons>();
        HashMap<String, Persons> personsHashMap = new HashMap<>();
        for (OrderList order : business.getOrders()) {
            boolean orderItemAboveTargetPrice = false;
            for (OrderItem orderItem : order.getOrderItemList()) {
                if (orderItem.getSalesPrice() < orderItem.getMarketOffer().getMarketOfferPrice()) {
                    orderItemAboveTargetPrice = true;

                }

            }
            if(orderItemAboveTargetPrice == true){
                if(!personsHashMap.containsKey(order.getSalesPerson().getUserName())){
                    personsHashMap.put(order.getSalesPerson().getUserName(), order.getSalesPerson());
                }
            }
        }
        resultList.addAll(personsHashMap.values());
        return resultList;

    }

   /** public static ArrayList<Product> top3ProductsSoldAboveMarketTargetPrice() {

    }**/
}
