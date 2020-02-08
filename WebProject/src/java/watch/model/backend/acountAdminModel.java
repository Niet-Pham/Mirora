/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.model.backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import watch.entity.Account;
import watch.util.ConnectionDb;
import watch.util.MD5Library;

/**
 *
 * @author Đức Huy
 */
public class acountAdminModel {
    public boolean Dangnhap(Account ac) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call adminDangNhap(?,?,?)}");

            callSt.setString(1, ac.getUserName());
            
            callSt.setString(2, MD5Library.md5(ac.getPassWord()));
            callSt.registerOutParameter(3, Types.BIT);

            callSt.execute();
            check= callSt.getBoolean(3);

        } catch (Exception e) {
            check = false;
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
    
    public Account getAccountbyuserName(String userName)
    {
        Connection conn = null;
        CallableStatement callSt = null;
       Account ac = new Account();
        try {
            conn = ConnectionDb.openConnection();
            callSt =conn.prepareCall("{call accountDetailAdmin(?)}");
            callSt.setString(1, userName);
            //Thu hien
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) { 
                ac.setAccountId(rs.getInt("accountId"));
                ac.setFirstName(rs.getString("FistName"));
                ac.setLastName(rs.getString("LastName"));
                ac.setEmail(rs.getString("Email"));
                ac.setPhone(rs.getString("Phone"));
                ac.setAddress(rs.getString("Address"));
                ac.setUserName(rs.getString("userName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return ac;
    }
     public boolean insertAccountAdmin(Account ac) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call insertAccountAdmin(?,?,?,?,?,?,?,?,?)}");

            callSt.setString(1, ac.getUserName());
            callSt.setString(2, ac.getEmail());
            callSt.setString(3, MD5Library.md5(ac.getPassWord()));
            callSt.setBoolean(4, ac.isIsActive());
            callSt.setInt(5, ac.getUserRole());
                    
            callSt.setString(6, ac.getFirstName());
            callSt.setString(7, ac.getLastName());
            callSt.setString(8, ac.getPhone());
            callSt.setString(9, ac.getAddress());

            callSt.executeUpdate();

        } catch (Exception e) {
            check = false;
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
      public Account getAccountById(String accId) {
        Connection conn = null;
        CallableStatement callSt = null;
       Account ac = new Account();
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call getAccountbyIdAdmin(?)}");
            callSt.setInt(1, Integer.parseInt(accId));
            //Thu hien
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                ac.setAccountId(rs.getInt("accountId"));
                ac.setUserName(rs.getString("userName"));
                ac.setEmail(rs.getString("Email"));
                ac.setAccountId(rs.getInt("accountId"));
                ac.setPassWord(rs.getString("PassWord"));
                ac.setIsActive(rs.getBoolean("IsActive"));
                ac.setCreateDate(rs.getDate("CreateDate"));
                ac.setUserRole(rs.getInt("UserRole"));
                ac.setPoints(rs.getFloat("Points"));
                ac.setFirstName(rs.getString("FistName"));
                ac.setLastName(rs.getString("LastName"));
                ac.setPhone(rs.getString("Phone"));
                ac.setAddress(rs.getString("Address"));

            
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return ac;

    }
        public boolean updateAccountAdmin(Account ac) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call updateAccountAdmin(?,?,?,?,?,?,?,?,?,?)}");
            callSt.setInt(1, ac.getAccountId());
              callSt.setString(2, ac.getUserName());
            callSt.setString(3, ac.getEmail());
            callSt.setString(4, MD5Library.md5(ac.getPassWord()));
            callSt.setBoolean(5, ac.isIsActive());
            callSt.setInt(6, ac.getUserRole());
                    
            callSt.setString(7, ac.getFirstName());
            callSt.setString(8, ac.getLastName());
            callSt.setString(9, ac.getPhone());
            callSt.setString(10, ac.getAddress());


            callSt.executeUpdate();

        } catch (Exception e) {
            check = false;
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean removeAccountAdmin(String AccId) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call removeAccountAdmin(?)}");
            callSt.setInt(1, Integer.parseInt(AccId));
        


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
