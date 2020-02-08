/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.fontend;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.Account;
import watch.entity.Comment;
import watch.entity.Manufacturer;
import watch.entity.OrderProduct;
import watch.entity.PrdCategory;
import watch.model.fontend.AccountModel;
import watch.model.fontend.ManufacturerModel;
import watch.model.fontend.orderModel;
import watch.model.fontend.prdCategoryModel;

/**
 *
 * @author Đức Huy
 */
@Controller
//@RequestMapping(value = "member")
public class accountController {

    private AccountModel accountmodel;
    private orderModel ordermodel;
        private ManufacturerModel manufacturerModel;
    private prdCategoryModel prdCategoryModel1;
    public accountController() {
        accountmodel = new AccountModel();
        ordermodel = new orderModel();
        manufacturerModel = new ManufacturerModel();
        prdCategoryModel1 = new prdCategoryModel();
    }

    @RequestMapping(value = "/initDangky")
    public ModelAndView initInsert() {
        ModelAndView model = new ModelAndView("fontend/loginDangky/DangkyDangnhap");
        Account newAcc = new Account();
       
          model.getModelMap().put("newAcc", newAcc);
        
        return model;
    }

    @RequestMapping(value = "/insertAccount")
    public String insertAccount(Account ac) {
        List<Account> lstAcc = accountmodel.getAllAccount();
        for (int i = 0; i < lstAcc.size(); i++) {
            if((ac.getUserName().equals(lstAcc.get(i).getUserName()))||(ac.getEmail().equals(lstAcc.get(i).getEmail())))
            {
                 return "fontend/loginDangky/error";
            }
        }
        boolean check = accountmodel.Dangky(ac);
        if (check) {
            return "redirect:initDangky.htm";
        } else {
            return "fontend/loginDangky/error";
        }
    }
     @RequestMapping(value = "/loginAccount")
    public String loginAccount(Account ac,HttpSession session) {
       
        boolean check = accountmodel.Dangnhap(ac);
        if (check) {
             Account acc = accountmodel.getAccountbyuserName(ac.getUserName());
             String userName = String.valueOf(acc.getUserName());
             String hoten = acc.getFirstName()+' '+ acc.getLastName();
             String accId = String.valueOf(acc.getAccountId());
             String address = String.valueOf(acc.getAddress());
             String phone = String.valueOf(acc.getPhone());
             session.setAttribute("hoten", hoten);
             session.setAttribute("userName", userName);
             session.setAttribute("email", acc.getEmail());
             session.setAttribute("accId", accId);
                  session.setAttribute("address", address);
                      session.setAttribute("phone", phone);
           
            
             productController pc = new productController();
             
                     
            return "redirect:getData.htm";
           // <%=request.getContextPath()%>/index/getData.htm
        } else {
            return "fontend/loginDangky/loginfalse";
        }
    }
     @RequestMapping(value = "/logout")
    public String logoutAccount(HttpSession session) {
       
        session.removeAttribute("hoten");
          session.removeAttribute("email");
            session.removeAttribute("accId");
            session.removeAttribute("productId");
            session.removeAttribute("userName");
            session.removeAttribute("manufacturer");
            return "fontend/trangchu/index";
        
    }
     @RequestMapping(value = "/accountDetail")
    public ModelAndView accountDetail(HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/loginDangky/myAccount");
        String userName = (String) session.getAttribute("userName");
        String accId = (String) session.getAttribute("accId");
        List<OrderProduct> listOr = ordermodel.getallOrderByAccountId(accId);
        Account acc = accountmodel.getAccountbyuserName(userName);
        Account accPass = new Account();
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
          model.getModelMap().put("acc", acc);
           model.getModelMap().put("listOr", listOr);
           model.getModelMap().put("accPass", accPass);
        
        return model;
    }
    @RequestMapping(value = "/UpdateAccDetail")
 public String updateAccountDetail(Account ac,HttpSession session)
  {
      //Thuc hien cap nhat
      String accID = (String) session.getAttribute("accId");
      boolean check = accountmodel.updateAccount(ac,accID);
      if(check)
      {
          return "redirect:accountDetail.htm";
          
      }else
           return "redirect:accountDetail.htm";
      
  }
    @RequestMapping(value = "/UpdatePassword")
 public String UpdatePassword(Account ac,HttpSession session)
  {
      //Thuc hien cap nhat
      String accID = (String) session.getAttribute("accId");
      boolean check = accountmodel.updatepasswordAccount(ac, accID);
      if(check)
      {
          return "redirect:accountDetail.htm";
          
      }else
           return "redirect:accountDetail.htm";
      
  }

}
