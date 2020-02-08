/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.entity;

import java.util.Date;

/**
 *
 * @author Đức Huy
 */
public class OrderProduct {
    private int orderId;
    private Date createDate;
    private float totalAmount;
    private int isActive;
    private int accountId;
    private String phone;
    private String email;
    private String address;
    private String name;
    private int paymentId;
    private int countOrder;
 
    public OrderProduct() {
    }

    public OrderProduct(int orderId, Date createDate, float totalAmount, int isActive, int accountId, String phone, String email, String address, String name, int paymentId, int countOrder) {
        this.orderId = orderId;
        this.createDate = createDate;
        this.totalAmount = totalAmount;
        this.isActive = isActive;
        this.accountId = accountId;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.name = name;
        this.paymentId = paymentId;
        this.countOrder = countOrder;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

   

   

 

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

   

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }
    
    
}
