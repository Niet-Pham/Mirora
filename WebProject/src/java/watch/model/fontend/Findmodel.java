/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.model.fontend;

import java.sql.Array;
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
public class Findmodel {
    public List<Products> findProductByName(String productName)
    {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> listProducts = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call findProduct(?)}");
            callst.setString(1, "%"+productName+"%");
            ResultSet rs = callst.executeQuery();
            while (rs.next()) {
                     //set cac thuoc tinh
                Products pr = new Products();
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
                listProducts.add(pr);
                        
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally
        {
            ConnectionDb.closeConnection(conn, callst);
        }
          return listProducts;
        
    }
    
}
