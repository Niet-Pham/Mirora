/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.fontend;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.Account;
import watch.entity.Manufacturer;
import watch.entity.OrderDetail;
import watch.entity.OrderProduct;
import watch.entity.PrdCategory;
import watch.entity.Products;
import watch.model.fontend.ManufacturerModel;

import watch.model.fontend.ProductModel;
import watch.model.fontend.orderModel;
import watch.model.fontend.prdCategoryModel;

/**
 *
 * @author Đức Huy
 */
@Controller

public class cartController {

    private ProductModel productModel;
    private ManufacturerModel manufacturerModel;
    private prdCategoryModel prdCategoryModel1;
    private orderModel ordermodel;

    public cartController() {
        productModel = new ProductModel();
        manufacturerModel = new ManufacturerModel();
        prdCategoryModel1 = new prdCategoryModel();
        ordermodel = new orderModel();
    }

    @RequestMapping(value = "/addCart")
    public String addCart(HttpSession session, String productId) {

        if (productId != null) {

            session.setAttribute("productId", productId);
        }

        return "redirect:addCart1.htm";

    }

    @RequestMapping(value = "/addCart1")
    public ModelAndView addCart1(HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/GioHang/cart");
        String prId;

        prId = (String) session.getAttribute("productId");
        if (prId != null) {
            //Lay listCart tu session
            List<OrderDetail> listCart = (List<OrderDetail>) session.getAttribute("listCart");
            //Lay thong tin san pham khach hang muon mua
            Products pro = productModel.getProductById(prId);
            //-Tao cart moi
            OrderDetail cart = new OrderDetail(1, 1, pro, 1, pro.getProductName(), 0);
            //Kiem tra listCart
            if (listCart == null) {
                //Truong hop day la san pham dau tien khach hang mua
                //-Khoi tao doi tuong listCart
                listCart = new ArrayList<>();

                //-add cart vao listCart
                listCart.add(cart);

            } else {
                //Truong hop khach hang da mua hang
                //-Kiem tra san pham da co trong listCart chua
                boolean checkExist = true;
                for (int i = 0; i < listCart.size(); i++) {
                    if (listCart.get(i).getProduct().getProductId() == Integer.parseInt(prId)) {
                        //Da ton tai san pham trong listCart
                        //Cong so luong len 1
                        listCart.get(i).setQuantity(listCart.get(i).getQuantity() + 1);
                        //dat lai checkExist = false
                        checkExist = false;
                        break;
                    }
                }
                if (checkExist) {
                    //San pham chua ton tai trong listCart
                    listCart.add(cart);
                }
            }

            //add listCart vao session
            session.setAttribute("listCart", listCart);
            //add tong tien cua don hang vao session
            session.setAttribute("totalAmount", calTotalAmount(listCart));
        }
        session.removeAttribute("productId");
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        return model;

    }

    public float calTotalAmount(List<OrderDetail> listCart) {
        float totalAmount = 0;
        for (OrderDetail cart : listCart) {
            totalAmount += cart.getQuantity() * cart.getProduct().getProductPriceAfterDiscount();
        }
        return totalAmount;
    }

    @RequestMapping(value = "/updateCart")
    public String updateCart(HttpServletRequest request, HttpSession session) {
        //Lay mang so luong trong request
        String[] arrQuantity = request.getParameterValues("qty");
        //Lay listCart tu session
        List<OrderDetail> listCart = (List<OrderDetail>) session.getAttribute("listCart");
        //Cap nhat so luong
        for (int i = 0; i < listCart.size(); i++) {
            //cap nhat so luong don hang chi tiet thu i
            listCart.get(i).setQuantity(Integer.parseInt(arrQuantity[i]));
        }
        //set listCart vao session
        session.setAttribute("listCart", listCart);
        //set totalAmout vao session
        session.setAttribute("totalAmount", calTotalAmount(listCart));
        return "fontend/GioHang/cart";
    }

    @RequestMapping(value = "/removeCart")
    public String removeCart(String productId, HttpSession session) {
        //Lay listCart tu session
        List<OrderDetail> listCart = (List<OrderDetail>) session.getAttribute("listCart");
        //Xoa san pham trong listCart
        for (OrderDetail cart : listCart) {
            if (cart.getProduct().getProductId() == Integer.parseInt(productId)) {
                listCart.remove(cart);
                break;
            }
        }
        //set listCart vao session
        session.setAttribute("listCart", listCart);
        //set totalAmout vao session
        session.setAttribute("totalAmount", calTotalAmount(listCart));
        return "fontend/GioHang/cart";
    }

    @RequestMapping(value = "/checkout")
    public ModelAndView checkOut(HttpSession session) {
        ModelAndView model = null;
        String userName = (String) session.getAttribute("userName");
        if (userName == null) {
            model = new ModelAndView("fontend/GioHang/error");
        } else {
            model = new ModelAndView("fontend/GioHang/checkOut");
        }
        OrderProduct or = new OrderProduct();

        model.getModelMap().put("or", or);

        return model;
    }

    @RequestMapping(value = "/finishCheckout")
    public String finishOrder(OrderProduct or, HttpSession session) {

        String hoten = (String) session.getAttribute("hoten");
        String address = (String) session.getAttribute("address");
        String phone = (String) session.getAttribute("phone");
        String email = (String) session.getAttribute("email");
        String accID = (String) session.getAttribute("accId");
        List<OrderDetail> listCart = (List<OrderDetail>) session.getAttribute("listCart");
        float total = (float) session.getAttribute("totalAmount");
        or.setTotalAmount(total);
        or.setAccountId(Integer.parseInt(accID));

        boolean check = false;
        if (or.getName().equals("")) {
            or.setName(hoten);
            or.setEmail(email);
            or.setAddress(address);
            or.setPhone(phone);
        }

        if (or.getPaymentId() == 1) {
            int orId = ordermodel.insertOrder(or);
            if (orId != 0) {
                for (OrderDetail cart : listCart) {
                    OrderDetail od = new OrderDetail();
                    od.setOrderId(orId);
                    od.setQuantity(cart.getQuantity());
                    od.setProductId(cart.getProduct().getProductId());
                    ordermodel.insertOrderDetail(od);
                    check = ordermodel.updateBuyItemAfterOrder(od);
                }

            }

            if (check = true) {

                session.removeAttribute("listCart");
                session.removeAttribute("totalAmount");
                return "redirect:getData.htm";

            }
        }
        if (or.getPaymentId() == 2) {
            List<OrderProduct> listOrrder = new ArrayList<>();
            listOrrder.add(or);
            session.setAttribute("listOrrder", listOrrder);
            return "redirect:paymentBank.htm";
        } else {
            return "fontend/GioHang/error";
        }

    }

    @RequestMapping(value = "/viewOrder")
    public ModelAndView getOrdelById(String orId, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/loginDangky/xemDonHang");
        OrderProduct op = ordermodel.getOrderByOrdelId(orId);
        List<OrderDetail> listod = ordermodel.getallOrderDetailbyOrId(orId);

        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        model.getModelMap().put("op", op);
        model.getModelMap().put("listod", listod);

        return model;

    }

    @RequestMapping(value = "/removeOrder")
    public String removeOrder(String orId) {
        //Thuc hien xoa
        boolean check = ordermodel.removeOrdel(orId);
        if (check) {
            return "redirect:accountDetail.htm";

        } else {
            return "redirect:accountDetail.htm";
        }

    }

    @RequestMapping(value = "/paymentBank")
    public ModelAndView paymentBank(HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/GioHang/PaymentBank");
        List<OrderProduct> listOrrderBank = (List<OrderProduct>) session.getAttribute("listOrrder");
        OrderProduct orInfor = listOrrderBank.get(0);

        model.getModelMap().put("orInfor", orInfor);

        return model;
    }

    @RequestMapping(value = "/finishCheckoutPaymentBank")
    public String finishOrderBank(OrderProduct or, HttpSession session, HttpServletRequest request) {

        String merchantName = "WEBMIRORA";
        String accNo = request.getParameter("AccNo");
        String accName = request.getParameter("AccName");
         List<OrderProduct> listOrrderBank = (List<OrderProduct>) session.getAttribute("listOrrder");
        or = listOrrderBank.get(0);

          List<OrderDetail> listCart = (List<OrderDetail>) session.getAttribute("listCart");
        float total = (float) session.getAttribute("totalAmount");
     
        String StringRs = checkOrder(merchantName, accNo, accName, total);
        //Xu ly chuoi check order nhan đk
        String arayRs[] = StringRs.split("#");
        String returnCode = arayRs[0];
        int transactionId = Integer.parseInt(arayRs[1]);
        boolean check = false;
        //Kiem tra check order
        if (returnCode.equals("00")) {
            //Thành công kiểm tra finnish order
            String returnCodeFinishOrder = finishOrder_1(transactionId, merchantName);
            if (returnCodeFinishOrder.equals("00")) {
                //Thanh toan thanh cong va chuyen sag trang thanh toan thành cong
                  int orId = ordermodel.insertOrder(or);
            if (orId != 0) {
                for (OrderDetail cart : listCart) {
                    OrderDetail od = new OrderDetail();
                    od.setOrderId(orId);
                    od.setQuantity(cart.getQuantity());
                    od.setProductId(cart.getProduct().getProductId());
                    ordermodel.insertOrderDetail(od);
                    
                    check = ordermodel.updateBuyItemAfterOrder(od);
                }

            }

            if (check = true) {

              session.removeAttribute("listCart");
                session.removeAttribute("totalAmount");
                 session.removeAttribute("listOrrder");
                return "fontend/GioHang/PaymentSucces";

            }
                
            }

        } 
            return "fontend/GioHang/paymentFalse";


    }

    private static String checkOrder(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, float arg3) {
        watch.ws.PaymentWebService_Service service = new watch.ws.PaymentWebService_Service();
        watch.ws.PaymentWebService port = service.getPaymentWebServicePort();
        return port.checkOrder(arg0, arg1, arg2, arg3);
    }

    private static String finishOrder_1(int arg0, java.lang.String arg1) {
        watch.ws.PaymentWebService_Service service = new watch.ws.PaymentWebService_Service();
        watch.ws.PaymentWebService port = service.getPaymentWebServicePort();
        return port.finishOrder(arg0, arg1);
    }
}
