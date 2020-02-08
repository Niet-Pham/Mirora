/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.backend;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.Account;
import watch.model.backend.acountAdminModel;
import watch.model.backend.prdCategoryAdminModel;
import watch.model.fontend.AccountModel;

/**
 *
 * @author Đức Huy
 */
@Controller
public class accountBackendController {
    private acountAdminModel acountAdminModel;
    private prdCategoryAdminModel prdAdminModel;

    public accountBackendController() {
        acountAdminModel = new acountAdminModel();
        prdAdminModel = new prdCategoryAdminModel();
    }
     @RequestMapping(value = "/admin")
    public ModelAndView initAccount(){
        ModelAndView model = new ModelAndView("backendadmin/trangchu/login");
        Account account = new Account();
        model.getModelMap().put("account", account);
        return model;
    }
      @RequestMapping(value = "/loginAccountAdmin")
       public String loginAccount(Account ac, HttpSession session){
        boolean check = acountAdminModel.Dangnhap(ac);
        if (check) {
            Account acc = acountAdminModel.getAccountbyuserName(ac.getUserName());
            String userName = String.valueOf(acc.getUserName());
            String hoTen = acc.getFirstName() +' '+acc.getLastName();
            String accId = String.valueOf(acc.getAccountId());
            session.setAttribute("hoTenadmin", hoTen);
            session.setAttribute("userNameadmin", userName);
           
            session.setAttribute("accIdadmin", accId);
            return "redirect:IndexAdmin.htm";
        } else {
            return "backendadmin/AccountAdmin/loi";
        }
    }
         @RequestMapping(value = "/logoutAdmin")
    public String logoutAccountadmin(HttpSession session) {
      
     ;
            session.removeAttribute("hoTenadmin");
            session.removeAttribute("userNameadmin");
            session.removeAttribute("accIdadmin");
            return "redirect:admin.htm";
        
    }
    @RequestMapping(value = "/getAllAccountAdmin")
    public ModelAndView getAllAccountAdmin(HttpSession session){
        ModelAndView model = null;
            String checktruycap = (String) session.getAttribute("accIdadmin");
            if(checktruycap ==null)
            {
                model = new ModelAndView("backendadmin/AccountAdmin/loi");
               
            }
            else{
                model = new ModelAndView("backendadmin/AccountAdmin/adminTable");}
            AccountModel acml = new AccountModel();
        List<Account> lstAcc = acml.getAllAccount();
        model.getModelMap().put("lstAcc", lstAcc);
        return model;
    }
     @RequestMapping(value = "/initInsertAccount")
    public ModelAndView initInsertAccount(HttpSession session){
        ModelAndView model = null;
            String checktruycap = (String) session.getAttribute("accIdadmin");
            if(checktruycap ==null)
            {
                model = new ModelAndView("backendadmin/AccountAdmin/loi");
               
            }
            else{
                model = new ModelAndView("backendadmin/AccountAdmin/insertAccAdmin");}
          Account ac = new Account();
                
     
        model.getModelMap().put("ac", ac);
        return model;
    }
    @RequestMapping(value = "insertAccAdmin")
    public String insertAccAdmin(Account ac)
    {   AccountModel acmodel=new AccountModel();
         List<Account> lstAcc = acmodel.getAllAccount();
        for (int i = 0; i < lstAcc.size(); i++) {
            if((ac.getUserName().equals(lstAcc.get(i).getUserName()))||(ac.getEmail().equals(lstAcc.get(i).getEmail())))
            {
                 return "backendadmin/AccountAdmin/loi";
            }
        }
        boolean check = acountAdminModel.insertAccountAdmin(ac);
        if(check = true)
        {
            return "redirect:getAllAccountAdmin.htm";
        }
        else
        {
             return "backendadmin/AccountAdmin/loi";
        }
        
    }
     @RequestMapping(value = "/initUpdateacc")
    public ModelAndView initUpdateacc(String accId,HttpSession session){
        ModelAndView model = null;
            String checktruycap = (String) session.getAttribute("accIdadmin");
            if(checktruycap ==null)
            {
                model = new ModelAndView("backendadmin/AccountAdmin/loi");
               
            }
            else{
                model = new ModelAndView("backendadmin/AccountAdmin/upDateaAccAdmin");}
          Account ac = acountAdminModel.getAccountById(accId);
                
     
        model.getModelMap().put("ac", ac);
        return model;
    }
     @RequestMapping(value = "updateAccountAdmin")
    public String updateAccountAdmin(Account ac)
    {  
        boolean check = acountAdminModel.updateAccountAdmin(ac);
        if(check = true)
        {
            return "redirect:getAllAccountAdmin.htm";
        }
        else
        {
             return "backendadmin/AccountAdmin/loi";
        }
        
    }
    @RequestMapping(value = "removeAccAdmin")
    public String removeAccAdmin(String accId)
    {   
        boolean check = acountAdminModel.removeAccountAdmin(accId);
        if(check = true)
        {
            return "redirect:getAllAccountAdmin.htm";
        }
        else
        {
             return "backendadmin/AccountAdmin/loi";
        }
        
    }
    
    
}
