/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.model.fontend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import watch.entity.Manufacturer;
import watch.entity.Products;

import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class ManufacturerModel {
     public List<Manufacturer> listManufacturer() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Manufacturer> ListManufactuter = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call listManufacturer()}");

            ResultSet rs = callst.executeQuery();
            while (rs.next()) {
                Manufacturer mn = new Manufacturer();
                //set cac thuoc tinh
                mn.setManufacturerId(rs.getInt("ManufacturerId"));
                mn.setManufacturerName(rs.getString("ManufacturerName"));
                mn.setIsActive(rs.getBoolean("isActive"));
            
                ListManufactuter.add(mn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return ListManufactuter;
    }
    
}
