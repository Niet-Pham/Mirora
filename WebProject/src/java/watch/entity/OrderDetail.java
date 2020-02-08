/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.entity;

/**
 *
 * @author Đức Huy
 */
public class OrderDetail {
    private int OrderId;
 
    private int quantity;
    private Products product;
    private int productId;
    private String productName;
    private float priceAfterDiscount;
    
    
    public OrderDetail() {
    }

    public OrderDetail(int OrderId, int quantity, Products product, int productId, String productName, float priceAfterDiscount) {
        this.OrderId = OrderId;
        this.quantity = quantity;
        this.product = product;
        this.productId = productId;
        this.productName = productName;
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public void setPriceAfterDiscount(float priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }

  

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

  



    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

   

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

  
  
    
}
