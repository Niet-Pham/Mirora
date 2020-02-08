/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.backend;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.OrderDetail;
import watch.entity.OrderProduct;
import watch.model.backend.orderAdminModel;

/**
 *
 * @author Đức Huy
 */
@Controller
public class orderAdminController {
    private orderAdminModel orderAdminmodel;
    
    public orderAdminController() {
        orderAdminmodel = new orderAdminModel();
    }
     @RequestMapping(value = "/getAllOrderAdmin")
    public ModelAndView getAll() {
        ModelAndView model = new ModelAndView("backendadmin/Order/OrderTable");
         List<OrderProduct> listorder = orderAdminmodel.getAllOrder();
        model.addObject("listorder", listorder);
        return model;
    }
      @RequestMapping(value = "/detailOrder")
     public ModelAndView detailPrd(String orderId) {
        ModelAndView model = new ModelAndView("backendadmin/Order/orderDetail");
        OrderProduct order = orderAdminmodel.getOrderByOrdelId(orderId);
        List<OrderDetail> listordetail = orderAdminmodel.getallOrderDetailbyOrId(orderId);
        model.getModelMap().put("order", order);
        model.getModelMap().put("listordetail", listordetail);
        return model;
    }
      @RequestMapping(value = "/initUpdateOrder")
     public ModelAndView initUpdateOrder(String orderId) {
        ModelAndView model = new ModelAndView("backendadmin/Order/upDateOrder");
        OrderProduct order = orderAdminmodel.getOrderByOrdelId(orderId);
        List<OrderDetail> listordetail = orderAdminmodel.getallOrderDetailbyOrId(orderId);
        model.getModelMap().put("order", order);
        model.getModelMap().put("listordetail", listordetail);
        return model;
    }
       @RequestMapping(value = "/updateOrderAdmin")
    public String updatePrdCategory(OrderProduct order) {

        boolean check = orderAdminmodel.updateOrderADmin(order);
        if (check) {
            return "redirect:getAllOrderAdmin.htm";

        } else {
            return "backendadmin/prdCategory/error";
        }
    }
      @RequestMapping(value = "/removeOrderAdmin")
    public String deleteOrderAdmin(int orderId) {
        boolean check = orderAdminmodel.removeAdminOrder(orderId);
        if (check) {
            return "redirect:getAllOrderAdmin.htm";
        } else {
            return "backendadmin/prdCategory/error";
        }
    }
    
    
}
