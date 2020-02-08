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
public class Manufacturer {
    private int manufacturerId;
      private String manufacturerName;
      private boolean isActive;
    public Manufacturer() {
    }

    public Manufacturer(int manufacturerId, String manufacturerName, boolean isActive) {
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.isActive = isActive;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

 

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    
    
}
