/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author shwet
 */
public class Product {
    private String prodName;
    private int productId; 
    private String type;
    private int avail;
    private int price;

    private static int count = 0;

    public Product() {
        count ++;
        productId = count;
    }

    @Override
    public String toString() {
        return prodName;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    public String getProdname() {
        return prodName;
    }

    public void setProdname(String prodname) {
        this.prodName = prodname;
    }


    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
