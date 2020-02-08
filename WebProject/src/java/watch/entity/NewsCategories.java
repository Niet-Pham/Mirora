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
public class NewsCategories {
    private int newCategoryId;
    private int parentId;
    private String newsCategoryTitle;
    private String newsCategorySummary;
    private String newsCategoryDescription;
    private Date createDate;
    private boolean isActive;
    private int priority;

    public NewsCategories() {
    }

    public NewsCategories(int newCategoryId, int parentId, String newsCategoryTitle, String newsCategorySummary, String newsCategoryDescription, Date createDate, boolean isActive, int priority) {
        this.newCategoryId = newCategoryId;
        this.parentId = parentId;
        this.newsCategoryTitle = newsCategoryTitle;
        this.newsCategorySummary = newsCategorySummary;
        this.newsCategoryDescription = newsCategoryDescription;
        this.createDate = createDate;
        this.isActive = isActive;
        this.priority = priority;
    }

    public int getNewCategoryId() {
        return newCategoryId;
    }

    public void setNewCategoryId(int newCategoryId) {
        this.newCategoryId = newCategoryId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getNewsCategoryTitle() {
        return newsCategoryTitle;
    }

    public void setNewsCategoryTitle(String newsCategoryTitle) {
        this.newsCategoryTitle = newsCategoryTitle;
    }

    public String getNewsCategorySummary() {
        return newsCategorySummary;
    }

    public void setNewsCategorySummary(String newsCategorySummary) {
        this.newsCategorySummary = newsCategorySummary;
    }

    public String getNewsCategoryDescription() {
        return newsCategoryDescription;
    }

    public void setNewsCategoryDescription(String newsCategoryDescription) {
        this.newsCategoryDescription = newsCategoryDescription;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
    
    
}
