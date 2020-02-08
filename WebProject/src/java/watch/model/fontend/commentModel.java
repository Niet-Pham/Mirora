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
import watch.entity.Account;
import watch.entity.Comment;
import watch.util.ConnectionDb;
import watch.util.MD5Library;

/**
 *
 * @author Đức Huy
 */
public class commentModel {
    
    public boolean commentProduct(Comment cmt,int accId, String productId) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call commentProduct(?,?,?,?)}");

            callSt.setInt(1, accId);
            callSt.setInt(2, Integer.parseInt(productId));
            callSt.setString(3, cmt.getContent());
            callSt.setFloat(4, cmt.getRatting());
            callSt.executeUpdate();

        } catch (Exception e) {
           check= false; 
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
    public List<Comment> getAllComment(String productID) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Comment> listComment = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call getCommentByProductId(?)}");
            callSt.setInt(1, Integer.parseInt(productID));
            //Thu hien
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Comment cmt = new Comment();
                cmt.setName(rs.getString("FistName")+' ' +rs.getString("LastName"));
                
                cmt.setContent(rs.getString("Content"));
                cmt.setCreateDate(rs.getDate("CreateDate"));
                cmt.setRatting(rs.getFloat("Rating"));

                listComment.add(cmt);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return listComment;

    }
    //Tinh diem trung binh danh gia
     public Comment avgRattingProduct(String productID) {
        Connection conn = null;
        CallableStatement callSt = null;
        Comment cmt = new Comment();
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call avgRatting(?)}");
            callSt.setInt(1, Integer.parseInt(productID));
            //Thu hien
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
               
                
                cmt.setAvgRatting(rs.getFloat("avgratting"));

                
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return cmt;

    }

    
    
}
