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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.Manufacturer;
import watch.entity.PrdCategory;
import watch.entity.Products;
import watch.model.fontend.Findmodel;
import watch.model.fontend.ManufacturerModel;
import watch.model.fontend.prdCategoryModel;

/**
 *
 * @author Đức Huy
 */
@Controller
public class findController {

    private ManufacturerModel manufacturerModel;
    private prdCategoryModel prdCategoryModel1;

    public findController() {
        manufacturerModel = new ManufacturerModel();
        prdCategoryModel1 = new prdCategoryModel();
    }

    @RequestMapping(value = "/findProduct")
    public ModelAndView findProduct(HttpSession session, HttpServletRequest request) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //So luong ban ghi tren 1 trang
        String productName = request.getParameter("search");
        Findmodel fm = new Findmodel();
        List<Products> listProduct = fm.findProductByName(productName);
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        model.getModelMap().put("listProduct", listProduct);
        return model;

    }
}
