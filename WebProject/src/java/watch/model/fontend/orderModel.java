/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.model.fontend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import watch.entity.OrderDetail;
import watch.entity.OrderProduct;
import watch.entity.Products;
import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class orderModel {

    public int insertOrder(OrderProduct order) {
        Connection conn = null;
        PreparedStatement preSt = null;
        int key = 0;
        try {
            conn = ConnectionDb.openConnection();
            preSt = conn.prepareStatement("INSERT INTO OrderProduct(TotalAmount,IsActive,accountId,Name,Phone,Email,Address,PaymentId) values(?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            preSt.setFloat(1, order.getTotalAmount());
            preSt.setInt(2, 1);
            preSt.setInt(3, order.getAccountId());
            preSt.setString(4, order.getName());
            preSt.setString(5, order.getPhone());
            preSt.setString(6, order.getEmail());
            preSt.setString(7, order.getAddress());
            preSt.setInt(8, order.getPaymentId());
            preSt.executeUpdate();
            ResultSet rs = preSt.getGeneratedKeys();
            while (rs.next()) {

                key = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(orderModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return key;
    }

    public boolean insertOrderDetail(OrderDetail orderDetail) {
        Connection conn = null;
        CallableStatement callst = null;
        boolean check = false;
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call insertOrderDetail(?,?,?)}");
            callst.setInt(1, orderDetail.getOrderId());
            callst.setInt(2, orderDetail.getProductId());
            callst.setInt(3, orderDetail.getQuantity());
            callst.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
            check = false;

        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return check;

    }

    //danh sach cac don dat hang

    public List<OrderProduct> getallOrderByAccountId(String accId) {
        Connection conn = null;
        CallableStatement callst = null;
        List<OrderProduct> lstOrder = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getallOrderByAccountId(?)}");
            callst.setInt(1, Integer.parseInt(accId));
            ResultSet rs = callst.executeQuery();
            while (rs.next()) {
                OrderProduct op = new OrderProduct();
                //set cac thuoc tinh
                op.setOrderId(rs.getInt("OrderId"));
                op.setCreateDate(rs.getDate("CreateDate"));
                op.setTotalAmount(rs.getFloat("TotalAmount"));
                op.setIsActive(rs.getInt("IsActive"));
                op.setAccountId(rs.getInt("accountId"));
                op.setName(rs.getString("Name"));
                op.setPhone(rs.getString("Phone"));
                op.setEmail(rs.getString("Email"));
                op.setAddress(rs.getString("Address"));
                op.setPaymentId(rs.getInt("PaymentId"));

                lstOrder.add(op);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lstOrder;
    }

    public OrderProduct getOrderByOrdelId(String orId) {
        Connection conn = null;
        CallableStatement callst = null;
        OrderProduct order = new OrderProduct();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getOrderByOrderId(?)}");
            callst.setInt(1, Integer.parseInt(orId));
            ResultSet rs = callst.executeQuery();
            if (rs.next()) {

                order.setOrderId(rs.getInt("OrderId"));
                order.setCreateDate(rs.getDate("CreateDate"));
                order.setTotalAmount(rs.getFloat("TotalAmount"));
                order.setIsActive(rs.getInt("IsActive"));
                order.setAccountId(rs.getInt("accountId"));
                order.setName(rs.getString("Name"));
                order.setPhone(rs.getString("Phone"));
                order.setEmail(rs.getString("Email"));
                order.setAddress(rs.getString("Address"));
                order.setPaymentId(rs.getInt("PaymentId"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return order;
    }

    public List<OrderDetail> getallOrderDetailbyOrId(String orId) {
        Connection conn = null;
        CallableStatement callst = null;
        List<OrderDetail> lstOrder = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getallOrderDetailByOrderID(?)}");
            callst.setInt(1, Integer.parseInt(orId));
            ResultSet rs = callst.executeQuery();
            while (rs.next()) {
                OrderDetail od = new OrderDetail();
                //set cac thuoc tinh
                od.setOrderId(rs.getInt("OrderId"));
                od.setProductId(rs.getInt("ProductId"));
                od.setQuantity(rs.getInt("Quantity"));
                od.setProductName(rs.getString("ProductName"));
                od.setPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));

                lstOrder.add(od);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return lstOrder;
    }

    public boolean removeOrdel(String orId) {
        Connection conn = null;
        CallableStatement callst = null;
        boolean check;
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call deleteOrder(?,?)}");
            callst.setInt(1, Integer.parseInt(orId));
            callst.registerOutParameter(2, Types.BIT);
                callst.execute();
            check = callst.getBoolean(2);
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return check;
    }
    //Cap nhat lai so luong san pham da ban
    public boolean updateBuyItemAfterOrder(OrderDetail od) {
        Connection conn = null;
        CallableStatement callst = null;
        boolean check = false;
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call updateBuyItemAfterOrder(?,?)}");
            callst.setInt(1, od.getProductId());
            callst.setInt(2, od.getQuantity());
           
            callst.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
            check = false;

        } finally {
            ConnectionDb.closeConnection(conn, callst);
        }
        return check;

    }

}
