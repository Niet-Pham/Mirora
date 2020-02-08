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
import watch.entity.PrdCategory;
import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class prdCategoryModel {
     public List<PrdCategory> listPrd() {
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
    
}
