/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.model.backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import watch.entity.Comment;
import watch.entity.OrderProduct;
import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class indexModelBackend {
     public Comment totalComment(){
        Connection conn = null;
        CallableStatement callSt = null;
         Comment comment = new Comment();
        ResultSet rs;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call totalComment()}");
       
            rs = callSt.executeQuery();
            if(rs.next()){
               
           
                comment.setTotalComment(rs.getInt("tong"));
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return comment;
    }
      public OrderProduct totalOrder(){
        Connection conn = null;
        CallableStatement callSt = null;
         OrderProduct orPro = new OrderProduct();
        ResultSet rs;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call totalOrder()}");
       
            rs = callSt.executeQuery();
            if(rs.next()){
               
           
                orPro.setCountOrder(rs.getInt("Tong hoa don"));
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return orPro;
    }
    
}
