/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.backend;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.PrdCategory;
import watch.model.backend.prdCategoryAdminModel;

/**
 *
 * @author Đức Huy
 */
@Controller
public class prdCategoryController {

    private prdCategoryAdminModel prdAdminModel;

    public prdCategoryController() {
        prdAdminModel = new prdCategoryAdminModel();
    }

    @RequestMapping(value = "/getAllPrdCategory")
    public ModelAndView getAll() {
        ModelAndView model = new ModelAndView("backendadmin/prdCategory/prdTable");
        List<PrdCategory> listPrdCategorys = prdAdminModel.getAll();
        model.addObject("listPrdCategorys", listPrdCategorys);
        return model;
    }

    @RequestMapping(value = "/deletePrdCategory")
    public String deleteProduct(int prdCategoryId) {
        boolean check = prdAdminModel.deleteprdCategory(prdCategoryId);
        if (check) {
            return "redirect:getAllPrdCategory.htm";
        } else {
            return "backendadmin/prdCategory/error";
        }
    }

    @RequestMapping(value = "/initPrdCategory")
    public ModelAndView initUpdate(int prdCategoryId) {
        ModelAndView model = new ModelAndView("updatePrdCategory");
        PrdCategory updatePrdCategory = prdAdminModel.getByprdCategoryId(prdCategoryId);
        model.addObject("updatePrdCategory", updatePrdCategory);
        return model;
    }

    @RequestMapping(value = "/updatePrdCategory")
    public String updateProduct(PrdCategory prdCategory) {
        boolean check = prdAdminModel.updateprdCategory(prdCategory);
        if (check) {
            return "redirect:getAllPrdCategory.htm";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/initInsertPrdCategory")
    public ModelAndView initProduct() {
        ModelAndView model = new ModelAndView("backendadmin/prdCategory/insertPrd");
        PrdCategory newprdCategory = new PrdCategory();
        model.addObject("newprdCategory", newprdCategory);
        return model;
    }

    @RequestMapping(value = "/insertPrdCategory")
    public String insertPrdCategory(PrdCategory newprdCategory, HttpServletRequest request) {

        boolean check = prdAdminModel.insertprdCategory(newprdCategory);
        if (check) {
            return "redirect:getAllPrdCategory.htm";

        } else {
            return "backendadmin/prdCategory/error";
        }
    }

    @RequestMapping(value = "/detailPrd")
    public ModelAndView detailPrd(String categoryId) {
        ModelAndView model = new ModelAndView("backendadmin/prdCategory/detailPrd");
        PrdCategory detailPr = prdAdminModel.getByprdCategoryId(Integer.parseInt(categoryId));
        model.addObject("detailPr", detailPr);
        return model;
    }
       @RequestMapping(value = "/initUpdate")
public ModelAndView initUpdate(String categoryId)   
{
    ModelAndView model = new ModelAndView("backendadmin/prdCategory/updateprdCategory");
    PrdCategory cate = prdAdminModel.getByprdCategoryId(Integer.parseInt(categoryId));
    model.addObject("cate", cate);
    return model;
}
  @RequestMapping(value = "/updatePrdCategoryAdmin")
    public String updatePrdCategory(PrdCategory cate) {

        boolean check = prdAdminModel.updateprdCategory(cate);
        if (check) {
            return "redirect:getAllPrdCategory.htm";

        } else {
            return "backendadmin/prdCategory/error";
        }
    }

}
