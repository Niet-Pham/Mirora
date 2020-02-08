/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.model.backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import watch.entity.ImageProduct;
import watch.entity.Products;
import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class imageProductModel {
     public List<ImageProduct> getAllImageProductAdmin() {
        Connection conn = null;
        CallableStatement callst = null;
        List<ImageProduct> lst = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getAllImageProductAdmin()}");
            ResultSet rs = callst.executeQuery();
            while (rs.next()) {
                ImageProduct img = new ImageProduct();
                //set cac thuoc tinh
                img.setUrl(rs.getString("Url"));
                img.setIsActive(rs.getBoolean("IsActive"));
                img.setProductId(rs.getInt("ProductId"));
                img.setImageId(rs.getInt("ImageID"));
               
                lst.add(img);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lst;
    }
     public boolean insertImgProducts(ImageProduct imgPr){
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call insertImageProductAdmin(?,?,?)}");
            callSt.setString(1, imgPr.getUrl());
            callSt.setBoolean(2, imgPr.isIsActive());
            callSt.setInt(3, imgPr.getProductId());
        
            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        }finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
     public ImageProduct getImageProductAdminbyImgId(String imgId) {
        Connection conn = null;
        CallableStatement callst = null;
        
          ImageProduct img = new ImageProduct();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getImgProductByImageId(?)}");
            callst.setInt(1, Integer.parseInt(imgId));
            ResultSet rs = callst.executeQuery();
            if (rs.next()) {
              
                //set cac thuoc tinh
                img.setUrl(rs.getString("Url"));
                img.setIsActive(rs.getBoolean("IsActive"));
                img.setProductId(rs.getInt("ProductId"));
                img.setImageId(rs.getInt("ImageID"));
               img.setProductName("ProductName");
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return img;
    }
      public boolean UpdateImg(ImageProduct imgPr){
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call UpdateImgAdmin(?,?,?,?)}");
            callSt.setInt(1, imgPr.getImageId());
            callSt.setString(2, imgPr.getUrl());
            callSt.setBoolean(3, imgPr.isIsActive());
            callSt.setInt(4, imgPr.getProductId());
        
            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        }finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
       public boolean deleteImg(int imgId) {
        //Ket noi
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call removeImageProductAdmin(?)}");
            //Set gia tri cac tham so truyyen vao
            callSt.setInt(1, imgId);
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
    
}
