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
public class Comment {
    private int accountId;
    private int productId;
    private String content;
    private Date createDate;
    private boolean status;
    private float ratting;
    private String Name;
    private float avgRatting;
    private int totalComment;
    public Comment() {
    }

    public Comment(int accountId, int productId, String content, Date createDate, boolean status, float ratting, String Name, float avgRatting, int totalComment) {
        this.accountId = accountId;
        this.productId = productId;
        this.content = content;
        this.createDate = createDate;
        this.status = status;
        this.ratting = ratting;
        this.Name = Name;
        this.avgRatting = avgRatting;
        this.totalComment = totalComment;
    }

    public int getTotalComment() {
        return totalComment;
    }

    public void setTotalComment(int totalComment) {
        this.totalComment = totalComment;
    }

   

    public float getAvgRatting() {
        return avgRatting;
    }

    public void setAvgRatting(float avgRatting) {
        this.avgRatting = avgRatting;
    }

   

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

  
  

  

    public float getRatting() {
        return ratting;
    }

    public void setRatting(float ratting) {
        this.ratting = ratting;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

   

   

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
