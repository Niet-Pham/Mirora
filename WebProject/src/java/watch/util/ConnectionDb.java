/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Đức Huy
 */
public class ConnectionDb {
    
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Project";
    private static final String USERNAME= "sa";
    private static final String PASSWORD = "144014";
    
    public static Connection openConnection(){
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn= DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public static void closeConnection(Connection conn, CallableStatement callSt)
    {
        if(conn != null)
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(callSt != null)
        {
            try {
                callSt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
       /*public static void main(String[] args) {
     Connection conn = null;
     try {
     conn = openConnection();
     System.out.println("ket noi thanh cong");
     } catch (Exception e) {
     System.out.println("ket noi khong thanh cong");
     }
     }*/
}
