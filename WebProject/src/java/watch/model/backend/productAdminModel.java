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
import watch.entity.Products;
import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class productAdminModel {
      public List<Products> getAllProductAdmin() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> lst = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getAllProductAdmin()}");
            ResultSet rs = callst.executeQuery();
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
              
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
               
                lst.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lst;
    }
       public boolean insertProducts(Products products){
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call insertProductAdmin(?,?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setInt(1, products.getPrdCategoryId());
            callSt.setString(2, products.getProductName());
            callSt.setFloat(3, products.getProductPrice());
            callSt.setFloat(4, products.getProductDiscount());
            callSt.setBoolean(5, products.isIsActive());
            callSt.setInt(6, products.getPriority());
            callSt.setString(7, products.getProductDescription());
            callSt.setBoolean(8, products.isIsHotProduct());
            callSt.setString(9, products.getProductTitle());
            callSt.setString(10, products.getAnhChinh());
            callSt.setInt(11, products.getManufacturerId());
          
            callSt.setString(12, products.getAnhChinh2());
            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        }finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
       public Products getProductAdminbyProductId(String productId) {
        Connection conn = null;
        CallableStatement callst = null;
        
         Products pr = new Products();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getProductByProductIdAdmin(?)}");
            callst.setInt(1, Integer.parseInt(productId));
            ResultSet rs = callst.executeQuery();
            if (rs.next()) {
               
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
               pr.setManufacturerName(rs.getString("ManufacturerName"));
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return pr;
    }
        public boolean updateProduct(Products products){
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call updateProductsAdmin(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setInt(1, products.getProductId());
           callSt.setInt(2, products.getPrdCategoryId());
            callSt.setString(3, products.getProductName());
            callSt.setFloat(4, products.getProductPrice());
            callSt.setFloat(5, products.getProductDiscount());
            callSt.setBoolean(6, products.isIsActive());
            callSt.setInt(7, products.getPriority());
            callSt.setString(8, products.getProductDescription());
            callSt.setBoolean(9, products.isIsHotProduct());
            callSt.setString(10, products.getProductTitle());
            callSt.setString(11, products.getAnhChinh());
            callSt.setInt(12, products.getManufacturerId());
          
            callSt.setString(13, products.getAnhChinh2());
            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        }finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
        public boolean deleteProduct(String productId){
        //Ket noi
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call deleteProductAdmin(?)}");
            //Set gia tri cac tham so truyyen vao
            callSt.setInt(1, Integer.parseInt(productId));
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
