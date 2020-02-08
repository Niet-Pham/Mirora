/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.model.backend;

import watch.model.fontend.*;
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

    public List<Manufacturer> listManufacturerAdmin() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Manufacturer> ListManufactuter = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getAllManufactuerAdmin()}");

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

    public boolean deleteManufactuer(int manuId) {
        //Ket noi
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call deleteMAnufactuerAdmin(?)}");
            //Set gia tri cac tham so truyyen vao
            callSt.setInt(1, manuId);
            //Thuc hien goi procedure
            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }

    public Manufacturer ManufacturerAdminById(String manuId) {
        Connection conn = null;
        CallableStatement callst = null;

        Manufacturer mn = new Manufacturer();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call ManufactuerById(?)}");
            callst.setInt(1, Integer.parseInt(manuId));

            ResultSet rs = callst.executeQuery();
            if (rs.next()) {

                //set cac thuoc tinh
                mn.setManufacturerId(rs.getInt("ManufacturerId"));
                mn.setManufacturerName(rs.getString("ManufacturerName"));
                mn.setIsActive(rs.getBoolean("isActive"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return mn;
    }

    public boolean insertManu(Manufacturer manu) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call insertManufactuerAdmin(?,?)}");

            callSt.setString(1, manu.getManufacturerName());
            callSt.setBoolean(2, manu.isIsActive());

            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }

    public boolean UpdateManu(Manufacturer manu) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call updateManufactuerAdmin(?,?,?)}");
            callSt.setInt(1, manu.getManufacturerId());
            callSt.setString(2, manu.getManufacturerName());
            callSt.setBoolean(3, manu.isIsActive());

            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }

}
