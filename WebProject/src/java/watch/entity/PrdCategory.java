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
public class PrdCategory {
    private int prdCategoryID;
    private int parentId;
    private String prdCategoryTitle;
    private String prdCategoryDescription;
    private String prdCategorySummary;
    private Date createDate;
    private Date updateDate;
    private int priority;
    private boolean isActive;

    public PrdCategory() {
    }

    public PrdCategory(int prdCategoryID, int parentId, String prdCategoryTitle, String prdCategoryDescription, String prdCategorySummary, Date createDate, Date updateDate, int priority, boolean isActive) {
        this.prdCategoryID = prdCategoryID;
        this.parentId = parentId;
        this.prdCategoryTitle = prdCategoryTitle;
        this.prdCategoryDescription = prdCategoryDescription;
        this.prdCategorySummary = prdCategorySummary;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.priority = priority;
        this.isActive = isActive;
    }

    public int getPrdCategoryID() {
        return prdCategoryID;
    }

    public void setPrdCategoryID(int prdCategoryID) {
        this.prdCategoryID = prdCategoryID;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getPrdCategoryTitle() {
        return prdCategoryTitle;
    }

    public void setPrdCategoryTitle(String prdCategoryTitle) {
        this.prdCategoryTitle = prdCategoryTitle;
    }

    public String getPrdCategoryDescription() {
        return prdCategoryDescription;
    }

    public void setPrdCategoryDescription(String prdCategoryDescription) {
        this.prdCategoryDescription = prdCategoryDescription;
    }

    public String getPrdCategorySummary() {
        return prdCategorySummary;
    }

    public void setPrdCategorySummary(String prdCategorySummary) {
        this.prdCategorySummary = prdCategorySummary;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
    
}
