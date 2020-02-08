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
import watch.entity.Comment;
import watch.entity.PrdCategory;
import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class commentAdminModel {

    public List<Comment> getAllCommentAdmin(){
        Connection conn = null;
        CallableStatement callSt = null;
        List<Comment> listComments = new ArrayList<>();
        ResultSet rs;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call getAllCommentAdmin()}");
            rs = callSt.executeQuery();
            while(rs.next()){
                Comment comment = new Comment();
                comment.setAccountId(rs.getInt("accountId"));
                comment.setProductId(rs.getInt("ProductId"));
                comment.setContent(rs.getString("Content"));
                comment.setCreateDate(rs.getDate("CreateDate"));
                comment.setStatus(rs.getBoolean("Status"));
                comment.setRatting(rs.getFloat("Rating"));
                listComments.add(comment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return listComments;
    }
        public Comment getCommentbyAccPrAdmin(String accId, String proId){
        Connection conn = null;
        CallableStatement callSt = null;
         Comment comment = new Comment();
        ResultSet rs;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call getCommentbyAccAndPrAdmin(?,?)}");
            callSt.setInt(1, Integer.parseInt(accId));
             callSt.setInt(2, Integer.parseInt(proId));
            rs = callSt.executeQuery();
            if(rs.next()){
               
                comment.setAccountId(rs.getInt("accountId"));
                comment.setProductId(rs.getInt("ProductId"));
                comment.setContent(rs.getString("Content"));
                comment.setCreateDate(rs.getDate("CreateDate"));
                comment.setStatus(rs.getBoolean("Status"));
                comment.setRatting(rs.getFloat("Rating"));
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDb.closeConnection(conn, callSt);
        }
        return comment;
    }
         public boolean updateCommentADmin(Comment cmt) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call updateCommentAdmin(?,?,?)}");
            callSt.setInt(1, cmt.getAccountId());
            callSt.setInt(2, cmt.getProductId());
            callSt.setBoolean(3, cmt.isStatus());
      
            callSt.executeUpdate();
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
          public boolean deletecomment(String accID,String proId) {
        //Ket noi
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call deleteCommentAdmin(?,?)}");
            //Set gia tri cac tham so truyyen vao
            callSt.setInt(1, Integer.parseInt(accID));
             callSt.setInt(2, Integer.parseInt(proId));
            
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
}

