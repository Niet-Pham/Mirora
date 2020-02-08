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
import java.util.HashMap;
import java.util.List;
import watch.entity.ImageProduct;
import watch.entity.Manufacturer;
import watch.entity.PrdCategory;
import watch.entity.Products;

import watch.util.ConnectionDb;
import watch.util.Pagination;

/**
 *
 * @author Đức Huy
 */
public class ProductModel {

    //Sanr pham moi
    public List<Products> getProductNew() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> lst = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getProductNew()}");
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
                 pr.setDTB(rs.getFloat("DTB"));
                lst.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lst;
    }

    //San pham giam gia nhieu nhat
    public List<Products> getProductShare() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> lstProductShare = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getProductShare()}");
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
                 pr.setDTB(rs.getFloat("DTB"));
                lstProductShare.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lstProductShare;
    }

    //San pham noi bat
    public List<Products> getProductHot() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> lstProductHot = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getProductHot()}");
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
                 pr.setDTB(rs.getFloat("DTB"));
                lstProductHot.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lstProductHot;
    }

    //San pham bán chạy
    public List<Products> getProductBuyItem() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> lstProductBuyItem = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getProductByItem()}");
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
                 pr.setDTB(rs.getFloat("DTB"));
                lstProductBuyItem.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lstProductBuyItem;
    }

    //San pham duoc xem nhieu nhat
    public List<Products> getProductHotView() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> lstProductHotView = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getProductHotView()}");
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
                 pr.setDTB(rs.getFloat("DTB"));
                lstProductHotView.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lstProductHotView;
    }

    //Lay san pham theo id
    public Products getProductById(String productID) {
        Connection conn = null;
        CallableStatement callst = null;
        Products pr = new Products();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getProductById(?)}");
            callst.setInt(1, Integer.parseInt(productID));
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
//Lay anh phu cua san pham

    public List<ImageProduct> getImageByProductId(String productID) {
        Connection conn = null;
        CallableStatement callst = null;
        List<ImageProduct> lstImageById = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call AnhPhubyProductId(?)}");
            callst.setInt(1, Integer.parseInt(productID));
            ResultSet rs = callst.executeQuery();
            while (rs.next()) {
                ImageProduct ip = new ImageProduct();
                //set cac thuoc tinh
                ip.setImageId(rs.getInt("ImageID"));
                ip.setUrl(rs.getString("Url"));
                ip.setIsActive(rs.getBoolean("IsActive"));
                ip.setProductId(rs.getInt("ProductId"));
                lstImageById.add(ip);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lstImageById;
    }

    //Lay san pham theo ma thuong hieu

    public List<Products> getProductByManufacturerId(String manufacturer) {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> ListProductByManufacturerId = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getProductByManufacturerId(?)}");
            callst.setInt(1, Integer.parseInt(manufacturer));
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
                ListProductByManufacturerId.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return ListProductByManufacturerId;
    }

    //Lay tat ca san pham de do vao trang shopProduct
    public List<Products> getAllProduct() {
        Connection conn = null;
        CallableStatement callst = null;
        List<Products> ListProduct = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getAllProduct()}");

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
                ListProduct.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return ListProduct;
    }

    //Phaan trang

    public HashMap getDataPagination(int page, int pageSize) {
        HashMap map1 = Pagination.getDataForPagination(page,
                pageSize, "Products", "ProductId", "getDataPagging.htm");
        return map1;
    }
    public HashMap getDataPaginationbyManufactuerId(int page, int pageSize, int manufactuerId) {
        HashMap map2 = Pagination.getDataForPaginationbyManufactuerorprdCategory(page,
                pageSize,manufactuerId,"ManufacturerId", "Products", "ProductId", "getDataPaggingbyManufactuer.htm");
        return map2;
    }
      public HashMap getDataPaginationbyprdCategory(int page, int pageSize, int prdCategoryId) {
        HashMap map3 = Pagination.getDataForPaginationbyManufactuerorprdCategory(page,
                pageSize,prdCategoryId,"PrdCategoryId", "Products", "ProductId", "getDataPaggingbyprdCategory.htm");
        return map3;
    }
        public HashMap getDataPaginationbyPrice(int page, int pageSize, float dau, float cuoi) {
        HashMap map4 = Pagination.getDataForPaginationbyPrice(page,
                pageSize,dau,cuoi, "Products", "ProductId", "getDataPaggingbyPrice.htm");
        return map4;
    }
    //update lại so luot xem khi kich vao 1 san pham
    public void updateViewProduct(String productID){
    Connection conn = null;
    CallableStatement calst = null;
    
        try {
            conn = ConnectionDb.openConnection();
            calst = conn.prepareCall("{call updateViewProduct(?)}");
             calst.setInt(1, Integer.parseInt(productID));    
             calst.executeUpdate();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        finally{
            ConnectionDb.closeConnection(conn, calst);
        }
       
    }
}
