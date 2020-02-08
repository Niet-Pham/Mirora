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
import watch.entity.OrderDetail;
import watch.entity.OrderProduct;
import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
public class orderAdminModel {

    public List<OrderProduct> getAllOrder() {
        Connection conn = null;
        CallableStatement calla = null;
        ResultSet rs;
        List<OrderProduct> listOrderProducts = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            calla = conn.prepareCall("{call getAllOrderAdmin()}");
            rs = calla.executeQuery();
            while (rs.next()) {
                OrderProduct order = new OrderProduct();
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
                listOrderProducts.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, calla);
        }
        return listOrderProducts;
    }

    public OrderProduct getOrderByOrdelId(String orderId) {
        Connection conn = null;
        CallableStatement callst = null;
        OrderProduct order = new OrderProduct();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getOrderByOrderId(?)}");
            callst.setInt(1, Integer.parseInt(orderId));
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
    public List<OrderDetail> getallOrderDetailbyOrId(String orderId) {
        Connection conn = null;
        CallableStatement callst = null;
        List<OrderDetail> lstOrder = new ArrayList<>();
        try {
            conn = ConnectionDb.openConnection();
            callst = conn.prepareCall("{call getallOrderDetailByOrderID(?)}");
            callst.setInt(1, Integer.parseInt(orderId));
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
    public boolean updateOrderADmin(OrderProduct or) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call updateOrderAdmin(?,?)}");

            callSt.setInt(1, or.getOrderId());
            callSt.setInt(2, or.getIsActive());
        

            callSt.executeUpdate();

        } catch (Exception e) {
            check = false;
            e.printStackTrace();

        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }
      public boolean removeAdminOrder(int orderId) {
        //Ket noi
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check;
        try {
            conn = ConnectionDb.openConnection();
            callSt = conn.prepareCall("{call deleteOrderAdmin(?,?)}");
            callSt.setInt(1, orderId);
            //Set gia tri cac tham so truyyen vao
           callSt.registerOutParameter(2, Types.BIT);
                callSt.execute();
            check = callSt.getBoolean(2);
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        } finally {
            ConnectionDb.closeConnection(conn, callSt);
        }
        return check;
    }

}
