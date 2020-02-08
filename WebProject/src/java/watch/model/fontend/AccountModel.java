/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.model.fontend;

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
public class AccountModel {

    public boolean Dangky(Account ac) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call DangKy(?,?,?,?,?,?,?)}");

            callSt.setString(1, ac.getUserName());
            callSt.setString(2, ac.getEmail());
            callSt.setString(3, MD5Library.md5(ac.getPassWord()));
            callSt.setString(4, ac.getFirstName());
            callSt.setString(5, ac.getLastName());
            callSt.setString(6, ac.getPhone());
            callSt.setString(7, ac.getAddress() + ',' + ac.getCity() + ',' + ac.getNation());

            callSt.executeUpdate();

        } catch (Exception e) {
            check = false;
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }

    public List<Account> getAllAccount() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Account> listAccount = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call getAllAccount()}");
            //Thu hien
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Account ac = new Account();
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

                listAccount.add(ac);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return listAccount;

    }
    
    
    //Dang nhap
     public boolean Dangnhap(Account ac) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call Dangnhap(?,?,?)}");

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
            callSt =conn.prepareCall("{call accountDetail(?)}");
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
      public boolean updateAccount(Account ac, String accID) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call UpdateDetailKhachHang(?,?,?,?,?,?)}");

            callSt.setInt(1, Integer.parseInt(accID));
            callSt.setString(2, ac.getFirstName());
            callSt.setString(3, ac.getLastName());
            callSt.setString(4, ac.getAddress());
            
            callSt.setString(5, ac.getPhone());
            callSt.setString(6, ac.getEmail());

            callSt.executeUpdate();

        } catch (Exception e) {
            check = false;
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
      //Thay ddoi mat khau truy cap
        public boolean updatepasswordAccount(Account ac, String accID) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call updatepassword(?,?,?)}");

            callSt.setInt(1, Integer.parseInt(accID));
            callSt.setString(2, MD5Library.md5(ac.getPassWord()));
            callSt.setString(3, MD5Library.md5(ac.getNewpassWord()));
     

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
