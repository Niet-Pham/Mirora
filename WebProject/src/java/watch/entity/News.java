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
public class News {
    private int newsId;
    private int newsCategoryId;
    private String newsTitle;
    private String newDescription ;
    private Date createDate;
    private boolean isActive;
    private int count;
    private int priority;
    private boolean isHotNews;
    private String newsImage;

    public News() {
    }

    public News(int newsId, int newsCategoryId, String newsTitle, String newDescription, Date createDate, boolean isActive, int count, int priority, boolean isHotNews, String newsImage) {
        this.newsId = newsId;
        this.newsCategoryId = newsCategoryId;
        this.newsTitle = newsTitle;
        this.newDescription = newDescription;
        this.createDate = createDate;
        this.isActive = isActive;
        this.count = count;
        this.priority = priority;
        this.isHotNews = isHotNews;
        this.newsImage = newsImage;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public int getNewsCategoryId() {
        return newsCategoryId;
    }

    public void setNewsCategoryId(int newsCategoryId) {
        this.newsCategoryId = newsCategoryId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewDescription() {
        return newDescription;
    }

    public void setNewDescription(String newDescription) {
        this.newDescription = newDescription;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isIsHotNews() {
        return isHotNews;
    }

    public void setIsHotNews(boolean isHotNews) {
        this.isHotNews = isHotNews;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }
    
    
}
