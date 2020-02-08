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
import watch.entity.Comment;
import watch.entity.OrderProduct;
import watch.entity.Products;
import watch.model.backend.indexModelBackend;

/**
 *
 * @author Đức Huy
 */
@Controller
public class indexBackEndController {
    private indexModelBackend indexModelBacend;

    public indexBackEndController() {
        indexModelBacend = new indexModelBackend();
    }
    
     @RequestMapping(value = "/IndexAdmin")
    public ModelAndView getAll() {
        ModelAndView model = new ModelAndView("backendadmin/trangchu/indextrangchu");
         Comment comt = indexModelBacend.totalComment();
         OrderProduct or = indexModelBacend.totalOrder();
        model.getModelMap().put("comt", comt);
         model.getModelMap().put("order", or);
        
        return model;
    }
}
