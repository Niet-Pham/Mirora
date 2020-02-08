/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.HashMap;

/**
 *
 * @author Đức Huy
 */
public class Pagination {

   public static HashMap getDataForPagination(int page, int pageSize, String tableName, String tableId, String actionName)
   {
       //Khai bao bien ket qua
       HashMap map = new HashMap();
       //Khai bao cac doi tuong ket noi sql
       Connection conn = null;
       CallableStatement callst =  null;
       try {
           //Mo ket noi database
           conn= ConnectionDb.openConnection();
            //Goi procduce lay link cac trang DisplayPageNo    
           callst = conn.prepareCall("{call DisplayPageNo(?,?,?,?,?)}");
           //Set cac tham so truyen vao proceduce
           callst.setInt(1, page);
           callst.setInt(2, pageSize);
           callst.setString(3, tableName);
            callst.setString(4, actionName);
            //Dang ky tham so dau ra procedure
            callst.registerOutParameter(5, Types.NVARCHAR);
            //Thuc thi proceduce
            callst.execute();
            //Lay link phan trang
            String url = callst.getString(5);
            //Set link phaan trang vao bien hashmap
            map.put("url", url);
            //Goi procuduce laays du lieu cho trang
            callst = conn.prepareCall("{call Paging(?,?,?,?)}");
            //Set cac tham so cho proceduce
            callst.setInt(1, page);
            callst.setInt(2, pageSize);
            callst.setString(3, tableName);
            callst.setString(4, tableId);
            //Thuc thi proceduce
            ResultSet rs = callst.executeQuery();
            map.put("rs", rs);
            
            
           
       } catch (Exception e) {
           e.printStackTrace();
       }
       //Set doi tuong ket noois sql vao doi tuong hashmap
       map.put("conn", conn);
       map.put("callst", callst);
       return map;
       
       
   }
    public static HashMap getDataForPaginationbyManufactuerorprdCategory(int page, int pageSize,int Idtruyenvao, String tableId2, String tableName, String tableId, String actionName)
   {
       //Khai bao bien ket qua
       HashMap map = new HashMap();
       //Khai bao cac doi tuong ket noi sql
       Connection conn = null;
       CallableStatement callst =  null;
       try {
           //Mo ket noi database
           conn= ConnectionDb.openConnection();
            //Goi procduce lay link cac trang DisplayPageNo    
           callst = conn.prepareCall("{call DisplayPageNoByManufactuerorprdCategory(?,?,?,?,?,?,?)}");
           //Set cac tham so truyen vao proceduce
           callst.setInt(1, page);
           callst.setInt(2, pageSize);
           callst.setInt(3, Idtruyenvao);
           callst.setString(4, tableId2);
           callst.setString(5, tableName);
            callst.setString(6, actionName);
            //Dang ky tham so dau ra procedure
            callst.registerOutParameter(7, Types.NVARCHAR);
            //Thuc thi proceduce
            callst.execute();
            //Lay link phan trang
            String url = callst.getString(7);
            //Set link phaan trang vao bien hashmap
            map.put("url1", url);
            //Goi procuduce laays du lieu cho trang
            callst = conn.prepareCall("{call PagingbyManufactuerIdOrPrdCategory(?,?,?,?,?,?)}");
            //Set cac tham so cho proceduce
            callst.setInt(1, page);
            callst.setInt(2, pageSize);
             callst.setInt(3, Idtruyenvao);
              callst.setString(4, tableId2);
            callst.setString(5, tableName);
            callst.setString(6, tableId);
            //Thuc thi proceduce
            ResultSet rs = callst.executeQuery();
            map.put("rs1", rs);
            
            
           
       } catch (Exception e) {
           e.printStackTrace();
       }
       //Set doi tuong ket noois sql vao doi tuong hashmap
       map.put("conn1", conn);
       map.put("callst1", callst);
       return map;
       
       
   }
      public static HashMap getDataForPaginationbyPrice(int page, int pageSize,float dau, float cuoi, String tableName, String tableId, String actionName)
   {
       //Khai bao bien ket qua
       HashMap map = new HashMap();
       //Khai bao cac doi tuong ket noi sql
       Connection conn = null;
       CallableStatement callst =  null;
       try {
           //Mo ket noi database
           conn= ConnectionDb.openConnection();
            //Goi procduce lay link cac trang DisplayPageNo    
           callst = conn.prepareCall("{call DisplayPageNoByPrice(?,?,?,?,?,?,?)}");
           //Set cac tham so truyen vao proceduce
           callst.setInt(1, page);
           callst.setInt(2, pageSize);
              callst.setFloat(3, dau);
              callst.setFloat(4, cuoi);
           callst.setString(5, tableName);
            callst.setString(6, actionName);
            //Dang ky tham so dau ra procedure
            callst.registerOutParameter(7, Types.NVARCHAR);
            //Thuc thi proceduce
            callst.execute();
            //Lay link phan trang
            String url = callst.getString(7);
            //Set link phaan trang vao bien hashmap
            map.put("url", url);
            //Goi procuduce laays du lieu cho trang
            callst = conn.prepareCall("{call PagingByPrice(?,?,?,?,?,?)}");
            //Set cac tham so cho proceduce
            callst.setInt(1, page);
            callst.setInt(2, pageSize);
             callst.setFloat(3, dau);
              callst.setFloat(4, cuoi);
            
            callst.setString(5, tableName);
            callst.setString(6, tableId);
            //Thuc thi proceduce
            ResultSet rs = callst.executeQuery();
            map.put("rs", rs);
            
            
           
       } catch (Exception e) {
           e.printStackTrace();
       }
       //Set doi tuong ket noois sql vao doi tuong hashmap
       map.put("conn", conn);
       map.put("callst", callst);
       return map;
       
       
   }
}
