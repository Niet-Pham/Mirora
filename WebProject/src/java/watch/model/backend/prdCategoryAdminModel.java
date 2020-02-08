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
import watch.entity.PrdCategory;
import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class prdCategoryAdminModel {

    public List<PrdCategory> getAll() {

        // khai báo các các đối tượng kết nối và biến kết quả
        Connection conn = null;
        CallableStatement calla = null;
        ResultSet rs;
        List<PrdCategory> listpPrdCategorys = new ArrayList<PrdCategory>();
        try {
            conn = ConnectionDb.openConnection();
            calla = conn.prepareCall("{call getAllPrdCategoryAdmin()}");
            rs = calla.executeQuery();
            while (rs.next()) {
                PrdCategory prdCategory = new PrdCategory();
                prdCategory.setPrdCategoryID(rs.getInt("PrdCategoryId"));
                prdCategory.setPrdCategoryTitle(rs.getString("PrdCategoryTitle"));
                prdCategory.setPrdCategoryDescription(rs.getString("PrdCategoryDescription"));
                prdCategory.setCreateDate(rs.getDate("CreateDate"));
                prdCategory.setUpdateDate(rs.getDate("UpdateDate"));
                prdCategory.setParentId(rs.getInt("ParentId"));
                prdCategory.setPriority(rs.getInt("Priority"));
                prdCategory.setIsActive(rs.getBoolean("IsActive"));
                listpPrdCategorys.add(prdCategory);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, calla);
        }
        return listpPrdCategorys;
    }
    public List<PrdCategory> listPrdIstrue() {
        Connection conn = null;
        CallableStatement callst = null;
        List<PrdCategory> ListPrd = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getAllPrdCategoryIndex()}");

            ResultSet rs = callst.executeQuery();
            while (rs.next()) {
                PrdCategory prd = new PrdCategory();
                //set cac thuoc tinh
                prd.setPrdCategoryID(rs.getInt("PrdCategoryId"));
               prd.setPrdCategoryTitle(rs.getString("PrdCategoryTitle"));
                prd.setIsActive(rs.getBoolean("IsActive"));
            
                ListPrd.add(prd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return ListPrd;
    }

    public boolean deleteprdCategory(int prdCategoryID) {
        //Ket noi
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call deleteprdCategoryAdmin(?)}");
            //Set gia tri cac tham so truyyen vao
            callSt.setInt(1, prdCategoryID);
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

    public boolean updateprdCategory(PrdCategory prdCategory) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call updatePrdCategoryAdmin(?,?,?,?,?)}");
            callSt.setInt(1, prdCategory.getPrdCategoryID());
            callSt.setString(2, prdCategory.getPrdCategoryTitle());
            callSt.setString(3, prdCategory.getPrdCategoryDescription());
           
            callSt.setInt(4, prdCategory.getPriority());
            callSt.setBoolean(5, prdCategory.isIsActive());
            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }

    public PrdCategory getByprdCategoryId(int prdCategoryID) {
        Connection conn = null;
        CallableStatement callSt = null;
        ResultSet rs;
        PrdCategory prdCategory = new PrdCategory();
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call getByprdCategoryIdAdmin(?)}");
            callSt.setInt(1, prdCategoryID);
            rs = callSt.executeQuery();
            while (rs.next()) {
                prdCategory.setPrdCategoryID(rs.getInt("PrdCategoryId"));
                prdCategory.setPrdCategoryTitle(rs.getString("PrdCategoryTitle"));
                prdCategory.setPrdCategoryDescription(rs.getString("PrdCategoryDescription"));
                prdCategory.setParentId(rs.getInt("ParentId"));
                prdCategory.setPriority(rs.getInt("Priority"));
                prdCategory.setIsActive(rs.getBoolean("IsActive"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return prdCategory;
    }

    public boolean insertprdCategory(PrdCategory prdCategory) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call insertprdCategoryAdmin(?,?,?,?)}");
            callSt.setString(1, prdCategory.getPrdCategoryTitle());
            callSt.setString(2, prdCategory.getPrdCategoryDescription());
          
            callSt.setInt(3, prdCategory.getPriority());
            callSt.setBoolean(4, prdCategory.isIsActive());
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
