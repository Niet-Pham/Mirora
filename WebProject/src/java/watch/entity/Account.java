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
public class Account {
    private int accountId;
    private String userName;
     private String email;
     private boolean isActive;
     private Date createDate;
     private int userRole;
     private float points;
     private String passWord;
     private String newpassWord;
     private String firstName;
     private String lastName;
     private String Phone;
     private String address;
     private String city;
     private String nation;
    public Account() {
    }

    public Account(int accountId, String userName, String email, boolean isActive, Date createDate, int userRole, float points, String passWord, String newpassWord, String firstName, String lastName, String Phone, String address, String city, String nation) {
        this.accountId = accountId;
        this.userName = userName;
        this.email = email;
        this.isActive = isActive;
        this.createDate = createDate;
        this.userRole = userRole;
        this.points = points;
        this.passWord = passWord;
        this.newpassWord = newpassWord;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Phone = Phone;
        this.address = address;
        this.city = city;
        this.nation = nation;
    }

    public String getNewpassWord() {
        return newpassWord;
    }

    public void setNewpassWord(String newpassWord) {
        this.newpassWord = newpassWord;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

  
  

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

 
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
     
    
}
