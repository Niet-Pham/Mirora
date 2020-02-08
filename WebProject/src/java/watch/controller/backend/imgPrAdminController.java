/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.backend;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.ImageProduct;
import watch.entity.Products;
import watch.model.backend.imageProductModel;
import watch.model.backend.productAdminModel;
import watch.model.fontend.ProductModel;

/**
 *
 * @author Đức Huy
 */
@Controller
public class imgPrAdminController {
    private imageProductModel imgPrModel;
    private ProductModel productModel;
    public imgPrAdminController() {
        imgPrModel = new imageProductModel();
        productModel = new ProductModel();
    }
       @RequestMapping(value = "/getAllImageProductAdmin")
    public ModelAndView getAll() {
        ModelAndView model = new ModelAndView("backendadmin/ImageProduct/imgProductTable");
         List<ImageProduct> listImg = imgPrModel.getAllImageProductAdmin();
        model.addObject("listImg", listImg);
        return model;
    }
    @RequestMapping(value = "/initInsertImgProduct")
    public ModelAndView initinsertImgProduct() {
        ModelAndView model = new ModelAndView("backendadmin/ImageProduct/initInsertImgProduct");
          ImageProduct newImg= new ImageProduct();
          List<Products> lstPrd = productModel.getAllProduct();
         
        model.getModelMap().put("lstPrd", lstPrd);
             model.getModelMap().put("newImg", newImg);
         
        return model;
    }
     @RequestMapping(value = "/insertImg")
    public String insertProduct(ImageProduct img, HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException, FileUploadException {
             response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String path = request.getRealPath("/images");
        //Duong dan anh build
     
        path = path.substring(0, path.indexOf("\\build"));
        //Duong dan anh den thu muc images trong build
        path = path + "\\web\\images";
              String fileName = "";
       // List items = null;
        //Khoi tao factory
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //Khoi tao sereletFileupload tu factory
        ServletFileUpload uploader = new ServletFileUpload(factory);
         uploader.setHeaderEncoding("UTF-8");
         List<FileItem> listItems = uploader.parseRequest(request);
        try {
            //Lay cac item trong request
            
            //Duyet tung item lay ra thong tin cuar product va anh
            for (FileItem item : listItems) {
                if (item.isFormField() == false) {
                    //Thong tin anh
                    //LAy thong tin duong dan anh set vao truong image cua product
                    String imageURL = "/images/" + item.getName();
                 
                    img.setUrl(imageURL);
                 
                    //Up load anh vao thu muc images
                    item.write(new File(path + "/" + item.getName()));

                } 
            }
            }

         catch (Exception e) {
            e.printStackTrace();
        }
           Hashtable params = new Hashtable();
        try {
            //items = uploader.parseRequest(request);
            Iterator iterator = listItems.iterator();
            while (iterator.hasNext()) {
                FileItem item = (FileItem) iterator.next();
                if (item.isFormField()) {
                    params.put(item.getFieldName(), item.getString());
                } else {
                    fileName = item.getName();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
            String productId = (String) params.get("productId");
             String isActive = (String) params.get("isActive");
          
           
            img.setProductId(Integer.parseInt(productId));
             img.setIsActive(Boolean.parseBoolean(isActive));
            
            
        boolean check = imgPrModel.insertImgProducts(img);
        if (check) {
            return "redirect:getAllImageProductAdmin.htm";

        } else {
            return "backendadmin/prdCategory/error";
       }
    }
      @RequestMapping(value = "/initUpdateImgAdmin")
    public ModelAndView initUpdateImgProduct(String imgId) {
        ModelAndView model = new ModelAndView("backendadmin/ImageProduct/updateImgProduct");
          ImageProduct UpImg = imgPrModel.getImageProductAdminbyImgId(imgId);
          List<Products> lstPrd = productModel.getAllProduct();
         
        model.getModelMap().put("lstPrd", lstPrd);
             model.getModelMap().put("UpImg", UpImg);
         
        return model;
    }
     @RequestMapping(value = "/updateImg")
    public String updateImg(ImageProduct imgPr, HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException, FileUploadException {
          response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String path = request.getRealPath("/images");
        //Duong dan anh build
     
        path = path.substring(0, path.indexOf("\\build"));
        //Duong dan anh den thu muc images trong build
        path = path + "\\web\\images";
              String fileName = "";
       // List items = null;
        //Khoi tao factory
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //Khoi tao sereletFileupload tu factory
        ServletFileUpload uploader = new ServletFileUpload(factory);
         uploader.setHeaderEncoding("UTF-8");
         List<FileItem> listItems = uploader.parseRequest(request);
        try {
            //Lay cac item trong request
            
            //Duyet tung item lay ra thong tin cuar product va anh
            for (FileItem item : listItems) {
                if (item.isFormField() == false) {
                    //Thong tin anh
                    //LAy thong tin duong dan anh set vao truong image cua product
                    String imageURL = "/images/" + item.getName();
                 
                    imgPr.setUrl(imageURL);
                 
                    //Up load anh vao thu muc images
                    item.write(new File(path + "/" + item.getName()));

                } 
            }
            }

         catch (Exception e) {
            e.printStackTrace();
        }
           Hashtable params = new Hashtable();
        try {
            //items = uploader.parseRequest(request);
            Iterator iterator = listItems.iterator();
            while (iterator.hasNext()) {
                FileItem item = (FileItem) iterator.next();
                if (item.isFormField()) {
                    params.put(item.getFieldName(), item.getString());
                } else {
                    fileName = item.getName();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            String imgId = (String) params.get("imageId");
            String productId = (String) params.get("productId");
             String isActive = (String) params.get("isActive");
          
           
            imgPr.setProductId(Integer.parseInt(productId));
             imgPr.setIsActive(Boolean.parseBoolean(isActive));
             imgPr.setImageId(Integer.parseInt(imgId));
            
       
          boolean check = imgPrModel.UpdateImg(imgPr);
                   if (check) {
            return "redirect:getAllImageProductAdmin.htm";

        } else {
            return "backendadmin/prdCategory/error";
       }
    }
    @RequestMapping(value = "/removeImgAdmin")
    public String removeImg(String imgId){
        
        boolean check = imgPrModel.deleteImg(Integer.parseInt(imgId));
                    if (check) {
            return "redirect:getAllImageProductAdmin.htm";

        } else {
            return "backendadmin/prdCategory/error";}
    }
}
