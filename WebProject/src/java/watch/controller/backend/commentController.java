/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.backend;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.Comment;
import watch.entity.PrdCategory;
import watch.model.backend.commentAdminModel;

/**
 *
 * @author Đức Huy
 */
@Controller
public class commentController {
    private commentAdminModel commentAdminModel;

    public commentController() {
        commentAdminModel = new commentAdminModel();
    }
      @RequestMapping(value = "/GetAllAdminComment")
    public ModelAndView getAll(){
        ModelAndView model = new ModelAndView("backendadmin/comment/commentTable");
            List<Comment> listComments = commentAdminModel.getAllCommentAdmin();
        model.addObject("listComments", listComments);
        return model;
    }
     @RequestMapping(value = "/initUpdateCommentAdmin")
    public ModelAndView initUpdateCommentAdmin(String accId, String proID){
        ModelAndView model = new ModelAndView("backendadmin/comment/updateCommentadmin");
            Comment Comment = commentAdminModel.getCommentbyAccPrAdmin(accId, proID);
        model.addObject("Comment", Comment);
        return model;
    }
    @RequestMapping(value = "/updateCommentAd")
    public String updateCommentAdmin(Comment Comment, HttpServletRequest request ){
       boolean check = commentAdminModel.updateCommentADmin(Comment);
         if (check) {
            return "redirect:GetAllAdminComment.htm";
        } else {
            return "backendadmin/prdCategory/error";
        }
    }
    @RequestMapping(value = "/removeComment")
    public String removeCommentAdmin(String accId, String proID){
       boolean check = commentAdminModel.deletecomment(accId,proID);
         if (check) {
            return "redirect:GetAllAdminComment.htm";
        } else {
            return "backendadmin/prdCategory/error";
        }
    }
    
}
