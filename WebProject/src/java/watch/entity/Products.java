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
public class Products {
    private int productId;
    private int prdCategoryId;
    private String productName;
    private float productPrice;
    private float productDiscount;
  
    private Date createDate;
    private Date updateDate;
    private boolean isActive;
    private int priority;
    private String productDescription;
   
    private boolean isHotProduct;
    private String productTitle;
    private String anhChinh;
    private int ManufacturerId;
    private int view;
    private int BuyItem;
    private float ProductPriceAfterDiscount;
    private String AnhChinh2;
    private String prdCategoryName;
    private String ManufacturerName;
    private float DTB;
    public Products() {
    }

    public Products(int productId, int prdCategoryId, String productName, float productPrice, float productDiscount, Date createDate, Date updateDate, boolean isActive, int priority, String productDescription, boolean isHotProduct, String productTitle, String anhChinh, int ManufacturerId, int view, int BuyItem, float ProductPriceAfterDiscount, String AnhChinh2, String prdCategoryName, String ManufacturerName, float DTB) {
        this.productId = productId;
        this.prdCategoryId = prdCategoryId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDiscount = productDiscount;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isActive = isActive;
        this.priority = priority;
        this.productDescription = productDescription;
        this.isHotProduct = isHotProduct;
        this.productTitle = productTitle;
        this.anhChinh = anhChinh;
        this.ManufacturerId = ManufacturerId;
        this.view = view;
        this.BuyItem = BuyItem;
        this.ProductPriceAfterDiscount = ProductPriceAfterDiscount;
        this.AnhChinh2 = AnhChinh2;
        this.prdCategoryName = prdCategoryName;
        this.ManufacturerName = ManufacturerName;
        this.DTB = DTB;
    }


  

    

    public float getDTB() {
        return DTB;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }

  

    public String getManufacturerName() {
        return ManufacturerName;
    }

    public void setManufacturerName(String ManufacturerName) {
        this.ManufacturerName = ManufacturerName;
    }

   
    public String getPrdCategoryName() {
        return prdCategoryName;
    }

    public void setPrdCategoryName(String prdCategoryName) {
        this.prdCategoryName = prdCategoryName;
    }


    

 

   

    public int getBuyItem() {
        return BuyItem;
    }

    public void setBuyItem(int BuyItem) {
        this.BuyItem = BuyItem;
    }





    

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

   

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrdCategoryId() {
        return prdCategoryId;
    }

    public void setPrdCategoryId(int prdCategoryId) {
        this.prdCategoryId = prdCategoryId;
    }

    public String getAnhChinh2() {
        return AnhChinh2;
    }

    public void setAnhChinh2(String AnhChinh2) {
        this.AnhChinh2 = AnhChinh2;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

   

   

    public float getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(float productDiscount) {
        this.productDiscount = productDiscount;
    }

   

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

 

    public boolean isIsHotProduct() {
        return isHotProduct;
    }

    public void setIsHotProduct(boolean isHotProduct) {
        this.isHotProduct = isHotProduct;
    }

   

    public float getProductPriceAfterDiscount() {
        return ProductPriceAfterDiscount;
    }

    public void setProductPriceAfterDiscount(float ProductPriceAfterDiscount) {
        this.ProductPriceAfterDiscount = ProductPriceAfterDiscount;
    }

  

   

    public String getAnhChinh() {
        return anhChinh;
    }

    public void setAnhChinh(String anhChinh) {
        this.anhChinh = anhChinh;
    }

    public int getManufacturerId() {
        return ManufacturerId;
    }

    public void setManufacturerId(int ManufacturerId) {
        this.ManufacturerId = ManufacturerId;
    }

    
    
    
}
