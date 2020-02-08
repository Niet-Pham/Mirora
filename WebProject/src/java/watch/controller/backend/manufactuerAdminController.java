/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.backend;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.Manufacturer;
import watch.entity.PrdCategory;
import watch.model.backend.ManufacturerModel;

/**
 *
 * @author Đức Huy
 */
@Controller
public class manufactuerAdminController {
    private ManufacturerModel manufactuerModel;

    public manufactuerAdminController() {
        manufactuerModel = new ManufacturerModel();
                
    }
     @RequestMapping(value = "/getAllManufactuerAdmin")
    public ModelAndView getAllmanu() {
        ModelAndView model = new ModelAndView("backendadmin/Manufactuer/manuTable");
        List<Manufacturer> listmanu = manufactuerModel.listManufacturerAdmin();
        model.addObject("listmanu", listmanu);
        return model;
    }
      @RequestMapping(value = "/deleteManuAdmin")
    public String deleteProduct(int manuId) {
        boolean check = manufactuerModel.deleteManufactuer(manuId);
        if (check) {
            return "redirect:getAllManufactuerAdmin.htm";
        } else {
            return "backendadmin/prdCategory/error";
        }
    }
     @RequestMapping(value = "/initInsertManufactuer")
    public ModelAndView initInsertManu() {
        ModelAndView model = new ModelAndView("backendadmin/Manufactuer/InsertManu");
        Manufacturer manu = new Manufacturer();
        model.addObject("manu", manu);
        return model;
    }
    @RequestMapping(value = "/insertManuAdmin")
    public String insertMAnu(Manufacturer manu, HttpServletRequest request) {

        boolean check = manufactuerModel.insertManu(manu);
        if (check) {
            return "redirect:getAllManufactuerAdmin.htm";

        } else {
            return "backendadmin/prdCategory/error";
        }
    }
     @RequestMapping(value = "/initUpdateManufactuerAdmin")
    public ModelAndView initUpdateManu(String manuId) {
        ModelAndView model = new ModelAndView("backendadmin/Manufactuer/UpdateManu");
        Manufacturer manu = manufactuerModel.ManufacturerAdminById(manuId);
        model.addObject("manu", manu);
        return model;
    }
     @RequestMapping(value = "/UpdateManuADmin")
    public String updateMAnu(Manufacturer manu, HttpServletRequest request) {

        boolean check = manufactuerModel.UpdateManu(manu);
        if (check) {
            return "redirect:getAllManufactuerAdmin.htm";

        } else {
            return "backendadmin/prdCategory/error";
        }
    }
    
    
}
