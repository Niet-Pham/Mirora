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
public class ImageProduct {
    private int imageId;
    private String url;
    private boolean isActive;
    private int productId;
    private String productName;
    public ImageProduct() {
    }

    public ImageProduct(int imageId, String url, boolean isActive, int productId, String productName) {
        this.imageId = imageId;
        this.url = url;
        this.isActive = isActive;
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }



    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
}
