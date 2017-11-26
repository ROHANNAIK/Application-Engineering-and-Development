/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author nanaj
 */
public class MarketOffer {
    
    private int marketOfferPrice;
    private Product product;
    private Market market;

    public int getMarketOfferPrice() {
        return marketOfferPrice;
    }

    public void setMarketOfferPrice(int marketOfferPrice) {
        this.marketOfferPrice = marketOfferPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
    
     
        
}
