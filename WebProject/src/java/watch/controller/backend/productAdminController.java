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
import watch.entity.Manufacturer;
import watch.entity.OrderProduct;
import watch.entity.PrdCategory;
import watch.entity.Products;
import watch.model.fontend.ManufacturerModel;
import watch.model.backend.prdCategoryAdminModel;
import watch.model.backend.productAdminModel;

/**
 *
 * @author Đức Huy
 */
@Controller
public class productAdminController {
    private productAdminModel productAdminModel;
    private prdCategoryAdminModel prdCategoryModel;
    private ManufacturerModel manufactuerModel;

    public productAdminController() {
        productAdminModel = new productAdminModel();
        prdCategoryModel = new prdCategoryAdminModel();
        manufactuerModel= new ManufacturerModel();
    }
     @RequestMapping(value = "/getAllProductAdmin")
    public ModelAndView getAll() {
        ModelAndView model = new ModelAndView("backendadmin/Product/ProductTable");
         List<Products> listProduct = productAdminModel.getAllProductAdmin();
        model.addObject("listProduct", listProduct);
        return model;
    }
      @RequestMapping(value = "/initInsertProduct")
    public ModelAndView initProduct() {
        ModelAndView model = new ModelAndView("backendadmin/Product/insertProduct");
          Products newpro= new Products();
          List<PrdCategory> lstPrdCate = prdCategoryModel.listPrdIstrue();
              List<Manufacturer> lstmanu = manufactuerModel.listManufacturer();
        model.getModelMap().put("newpro", newpro);
             model.getModelMap().put("lstPrdCate", lstPrdCate);
                  model.getModelMap().put("lstmanu", lstmanu);
        return model;
    }
      @RequestMapping(value = "/insertProductAdmin")
    public String insertProduct(Products newpro, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, Exception {
        /* ModelAndView model = new ModelAndView("ChitietProduct");*/
        //Lay duong dan anh
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
                    if (newpro.getAnhChinh()==null)
                    {
                    newpro.setAnhChinh(imageURL);}
                    else{
                        newpro.setAnhChinh2(imageURL);
                    }
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
         String prdName = new String(params.get("productName").toString().getBytes("iso-8859-1"), "UTF-8");
            String prdCategoryId = (String) params.get("prdCategoryId");
             String ManufacturerId = (String) params.get("ManufacturerId");
             String productPrice = (String) params.get("productPrice");
             String productDiscount = (String) params.get("productDiscount");
             String priority = (String) params.get("priority");
             String productDescription = new String(params.get("productDescription").toString().getBytes("iso-8859-1"), "UTF-8");
              String productTitle = new String(params.get("productTitle").toString().getBytes("iso-8859-1"), "UTF-8");
                  String isHotProduct = (String) params.get("isHotProduct");
                    String isActive = (String) params.get("isActive");
                    newpro.setProductName(prdName);
                    newpro.setPrdCategoryId(Integer.parseInt(prdCategoryId));
                    newpro.setManufacturerId(Integer.parseInt(ManufacturerId));
                    newpro.setProductPrice(Float.parseFloat(productPrice));
                    newpro.setProductDiscount(Float.parseFloat(productDiscount));
                    newpro.setPriority(Integer.parseInt(priority));
                    newpro.setProductDescription(productDescription);
                    newpro.setProductTitle(productTitle);
                    newpro.setIsActive(Boolean.parseBoolean(isActive));
                    newpro.setIsHotProduct(Boolean.parseBoolean(isHotProduct));
        boolean check = productAdminModel.insertProducts(newpro);
        if (check) {
            return "redirect:getAllProductAdmin.htm";

        } else {
            return "backendadmin/prdCategory/error";
       }

    }
     @RequestMapping(value = "/DetailProduct")
    public ModelAndView DetailProduct(String productId) {
        ModelAndView model = new ModelAndView("backendadmin/Product/productDetail");
          Products detailpro= productAdminModel.getProductAdminbyProductId(productId);
         // List<PrdCategory> lstPrdCate = prdCategoryModel.listPrdIstrue();
              //List<Manufacturer> lstmanu = manufactuerModel.listManufacturerAdmin();
        model.getModelMap().put("detailpro", detailpro);
             //model.getModelMap().put("lstPrdCate", lstPrdCate);
                  //model.getModelMap().put("lstmanu", lstmanu);
        return model;
    }
    @RequestMapping(value = "/initUpdateProductAdmin")
    public ModelAndView initUpdateProductAdmin(String productId) {
        ModelAndView model = new ModelAndView("backendadmin/Product/updateProduct");
          Products pro= productAdminModel.getProductAdminbyProductId(productId);
          List<PrdCategory> lstPrdCate = prdCategoryModel.listPrdIstrue();
              List<Manufacturer> lstmanu = manufactuerModel.listManufacturer();
        model.getModelMap().put("pro", pro);
             model.getModelMap().put("lstPrdCate", lstPrdCate);
                  model.getModelMap().put("lstmanu", lstmanu);
        return model;
    }
     @RequestMapping(value = "/updateProductAdmin")
    public String updateProductAdmin(Products pro, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, FileUploadException {
        /* ModelAndView model = new ModelAndView("ChitietProduct");*/
        //Lay duong dan anh
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
                    if (pro.getAnhChinh()==null)
                    {
                    pro.setAnhChinh(imageURL);}
                    else{
                        pro.setAnhChinh2(imageURL);
                    }
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
         String prdName = new String(params.get("productName").toString().getBytes("iso-8859-1"), "UTF-8");
            String prdCategoryId = (String) params.get("prdCategoryId");
             String productId = (String) params.get("productId");
             String ManufacturerId = (String) params.get("ManufacturerId");
             String productPrice = (String) params.get("productPrice");
             String productDiscount = (String) params.get("productDiscount");
             String priority = (String) params.get("priority");
             String productDescription = new String(params.get("productDescription").toString().getBytes("iso-8859-1"), "UTF-8");
              String productTitle = new String(params.get("productTitle").toString().getBytes("iso-8859-1"), "UTF-8");
                  String isHotProduct = (String) params.get("isHotProduct");
                    String isActive = (String) params.get("isActive");
                    pro.setProductName(prdName);
                    pro.setPrdCategoryId(Integer.parseInt(prdCategoryId));
                    pro.setManufacturerId(Integer.parseInt(ManufacturerId));
                    pro.setProductPrice(Float.parseFloat(productPrice));
                    pro.setProductDiscount(Float.parseFloat(productDiscount));
                    pro.setPriority(Integer.parseInt(priority));
                    pro.setProductDescription(productDescription);
                    pro.setProductTitle(productTitle);
                    pro.setProductId(Integer.parseInt(productId));
                    pro.setIsActive(Boolean.parseBoolean(isActive));
                    pro.setIsHotProduct(Boolean.parseBoolean(isHotProduct));
        boolean check = productAdminModel.updateProduct(pro);
        if (check) {
            return "redirect:getAllProductAdmin.htm";

        } else {
            return "backendadmin/prdCategory/error";
       }
       
    }
     @RequestMapping(value = "/removeProductAdmin")
    public String deleteProduct(String productId){
       boolean check = productAdminModel.deleteProduct(productId);
       if (check) {
            return "redirect:getAllProductAdmin.htm";
        }
        else{
            return "backendadmin/prdCategory/error";
        }
    }
}
