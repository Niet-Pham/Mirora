/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.controller.fontend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import watch.entity.Comment;
import watch.entity.ImageProduct;
import watch.entity.Manufacturer;
import watch.entity.PrdCategory;
import watch.entity.Products;
import watch.model.fontend.ManufacturerModel;
import watch.model.fontend.ProductModel;
import watch.model.fontend.commentModel;
import watch.model.fontend.prdCategoryModel;

import watch.util.ConnectionDb;

/**
 *
 * @author Đức Huy
 */
@Controller
//@RequestMapping(value = "index")
public class productController {

    private ProductModel productModel;
    private ManufacturerModel manufacturerModel;
    private prdCategoryModel prdCategoryModel1;

    public productController() {
        productModel = new ProductModel();
        manufacturerModel = new ManufacturerModel();
        prdCategoryModel1 = new prdCategoryModel();
    }

    @RequestMapping(value = "/getData")
    public ModelAndView getDataHome() {
        ModelAndView model = new ModelAndView("fontend/trangchu/index");
        List<Products> listPrNew = productModel.getProductNew();
        List<Products> listPrShare = productModel.getProductShare();
        List<Products> listPrHot = productModel.getProductHot();
        List<Products> listPrBuyItem = productModel.getProductBuyItem();
        List<Products> listPrHotView = productModel.getProductHotView();

        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        model.getModelMap().put("listProductNew", listPrNew);
        model.getModelMap().put("lstprShare", listPrShare);
        model.getModelMap().put("ListPrHot", listPrHot);
        model.getModelMap().put("ListPrBuyitem", listPrBuyItem);
        model.getModelMap().put("ListPrHotView", listPrHotView);

        return model;

    }

    @RequestMapping(value = "/getproductById")
    public ModelAndView getProductById(String productID, String manufacturer, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/getProductById");
        /*Products pr = productModel.getProductById(productID);
         model.addObject("pr", pr);*/
        productModel.updateViewProduct(productID);
        if (productID != null && manufacturer != null) {
            session.setAttribute("productId", productID);
            session.setAttribute("manufacturer", manufacturer);
        }
        String proId = (String) session.getAttribute("productId");
        String mnId = (String) session.getAttribute("manufacturer");

        Products PrbyId = productModel.getProductById(proId);
        List<ImageProduct> listImagebyId = productModel.getImageByProductId(proId);
        List<Products> ListProductByManufacturerId = productModel.getProductByManufacturerId(mnId);
        commentModel commentModel = new commentModel();
        List<Comment> ListComment = commentModel.getAllComment(proId);
        model.getModelMap().put("ListComment", ListComment);
        Comment comment = commentModel.avgRattingProduct(proId);
        Comment cmt = new Comment();
        model.getModelMap().put("comment", comment);
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        model.getModelMap().put("cmt", cmt);
        model.getModelMap().put("ListProductByManufacturerId", ListProductByManufacturerId);
        model.getModelMap().put("PrbyId", PrbyId);
        model.getModelMap().put("listImagebyId", listImagebyId);

        return model;

    }

    @RequestMapping(value = "/comment")
    public String commentProduct(Comment cmt, HttpSession session) {

        /*Products pr = productModel.getProductById(productID);
         model.addObject("pr", pr);*/
        commentModel commentModel = new commentModel();
           //Lay listCart tu session
        //List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        //String accId = (String) session.getAttribute("accId");

        String productId = (String) session.getAttribute("productId");
        int accId = Integer.parseInt((String) session.getAttribute("accId"));
        commentModel.commentProduct(cmt, accId, productId);
        return "redirect:getproductById.htm";

    }

    @RequestMapping(value = "/getShopProduct")
    public ModelAndView getAllProduct( HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //So luong ban ghi tren 1 trang
        int sizeRowofPage = 9;
        HashMap map = productModel.getDataPagination(1, sizeRowofPage);
        String url = (String) map.get("url");
        List<Products> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                /*pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
                 pr.setManufacturerName(rs.getString("ManufacturerName"));*/

                listProduct.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn");
            CallableStatement callst = (CallableStatement) map.get("callst");
            ConnectionDb.closeConnection(conn, callst);
        }
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        //Truyen doi tuong listproduct va chuoi phan trang cho doi tuong model
        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);
        return model;

    }

    /**
     * lấy chuỗi phân trang
     *
     * @param page
     * @return
     */
    @RequestMapping(value = "/getDataPagging")
    public ModelAndView getDataProductPagging(@RequestParam("page") String page, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //Trang hieenj tai
        int pageInt = Integer.parseInt(page);
        //So luong ban ghi treen moi trang
        int sizeRowofPage = 9;
        //Doi tuong map
        HashMap map = productModel.getDataPagination(pageInt, sizeRowofPage);
        //Lay chuoi phan trang hien tai
        String url = (String) map.get("url");
        List<Products> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                /*pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
                 pr.setManufacturerName(rs.getString("ManufacturerName"));*/

                listProduct.add(pr);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn");
            CallableStatement callSt = (CallableStatement) map.get("callst");
            ConnectionDb.closeConnection(conn, callSt);
        }
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        model.getModelMap().put("listmanu", listManu);
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);
        return model;
    }

    @RequestMapping(value = "/getShopProductByManufacruerId")
    public ModelAndView getAllProductByManufacruerId(String idtruyenvao, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //So luong ban ghi tren 1 trang
        int sizeRowofPage = 9;
        HashMap map = productModel.getDataPaginationbyManufactuerId(1, sizeRowofPage, Integer.parseInt(idtruyenvao));
        session.setAttribute("idtruyenvao", idtruyenvao);
        String url = (String) map.get("url1");
        List<Products> listProduct1 = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs1");
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                /*pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
                 pr.setManufacturerName(rs.getString("ManufacturerName"));*/

                listProduct1.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn1");
            CallableStatement callst = (CallableStatement) map.get("callst1");
            ConnectionDb.closeConnection(conn, callst);
        }
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        //Truyen doi tuong listproduct va chuoi phan trang cho doi tuong model
        model.getModelMap().put("listProduct", listProduct1);
        model.getModelMap().put("url", url);
        return model;

    }

    @RequestMapping(value = "/getDataPaggingbyManufactuer")
    public ModelAndView getDataProductPaggingbyManufactuerId(@RequestParam("page") String page, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //Trang hieenj tai
        int pageInt = Integer.parseInt(page);
        int idtruyenvao = Integer.parseInt((String) session.getAttribute("idtruyenvao"));

        //So luong ban ghi treen moi trang
        int sizeRowofPage = 9;
        //Doi tuong map
        HashMap map = productModel.getDataPaginationbyManufactuerId(pageInt, sizeRowofPage, idtruyenvao);
        //Lay chuoi phan trang hien tai
        String url = (String) map.get("url1");
        List<Products> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs1");
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                /*pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
                 pr.setManufacturerName(rs.getString("ManufacturerName"));*/

                listProduct.add(pr);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn1");
            CallableStatement callSt = (CallableStatement) map.get("callst1");
            ConnectionDb.closeConnection(conn, callSt);
        }
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);

        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        model.getModelMap().put("listmanu", listManu);

        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);

        return model;

    }

    @RequestMapping(value = "/getShopProductByPrd")
    public ModelAndView getAllProductByPrd(String prdCategoryId, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //So luong ban ghi tren 1 trang
        int sizeRowofPage = 9;
        HashMap map = productModel.getDataPaginationbyprdCategory(1, sizeRowofPage, Integer.parseInt(prdCategoryId));
        session.setAttribute("prdCategoryId", prdCategoryId);
        String url = (String) map.get("url1");
        List<Products> listProduct1 = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs1");
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                /*pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
                 pr.setManufacturerName(rs.getString("ManufacturerName"));*/

                listProduct1.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn1");
            CallableStatement callst = (CallableStatement) map.get("callst1");
            ConnectionDb.closeConnection(conn, callst);
        }
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        //Truyen doi tuong listproduct va chuoi phan trang cho doi tuong model
        model.getModelMap().put("listProduct", listProduct1);
        model.getModelMap().put("url", url);
        return model;

    }

    @RequestMapping(value = "/getDataPaggingbyprdCategory")
    public ModelAndView getDataProductPaggingbyPrd(@RequestParam("page") String page, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //Trang hieenj tai
        int pageInt = Integer.parseInt(page);
        int idtruyenvao = Integer.parseInt((String) session.getAttribute("prdCategoryId"));

        //So luong ban ghi treen moi trang
        int sizeRowofPage = 9;
        //Doi tuong map
        HashMap map = productModel.getDataPaginationbyprdCategory(pageInt, sizeRowofPage, idtruyenvao);
        //Lay chuoi phan trang hien tai
        String url = (String) map.get("url1");
        List<Products> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs1");
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                /*pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
                 pr.setManufacturerName(rs.getString("ManufacturerName"));*/

                listProduct.add(pr);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn1");
            CallableStatement callSt = (CallableStatement) map.get("callst1");
            ConnectionDb.closeConnection(conn, callSt);
        }
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);

        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        model.getModelMap().put("listmanu", listManu);

        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);

        return model;

    }

    @RequestMapping(value = "/getShopProductByPrice")
    public ModelAndView getAllProductByPrice(String dau, String cuoi, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //So luong ban ghi tren 1 trang
        int sizeRowofPage = 9;
        HashMap map = productModel.getDataPaginationbyPrice(1, sizeRowofPage, Float.parseFloat(dau), Float.parseFloat(cuoi));
        session.setAttribute("dau", dau);
        session.setAttribute("cuoi", cuoi);
        String url = (String) map.get("url");
        List<Products> listProduct1 = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                /*pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
                 pr.setManufacturerName(rs.getString("ManufacturerName"));*/

                listProduct1.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn");
            CallableStatement callst = (CallableStatement) map.get("callst");
            ConnectionDb.closeConnection(conn, callst);
        }
        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);
        model.getModelMap().put("listmanu", listManu);
        //Truyen doi tuong listproduct va chuoi phan trang cho doi tuong model
        model.getModelMap().put("listProduct", listProduct1);
        model.getModelMap().put("url", url);
        return model;

    }

    @RequestMapping(value = "/getDataPaggingbyPrice")
    public ModelAndView getDataPaggingbyPrice(@RequestParam("page") String page, HttpSession session) {
        ModelAndView model = new ModelAndView("fontend/trangchu/ProductShop");
        //Trang hieenj tai
        int pageInt = Integer.parseInt(page);
        float dau = Float.parseFloat((String) session.getAttribute("dau"));
        float cuoi = Float.parseFloat((String) session.getAttribute("cuoi"));
        //So luong ban ghi treen moi trang
        int sizeRowofPage = 9;
        //Doi tuong map
        HashMap map = productModel.getDataPaginationbyPrice(pageInt, sizeRowofPage, dau, cuoi);
        //Lay chuoi phan trang hien tai
        String url = (String) map.get("url");
        List<Products> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
            while (rs.next()) {
                Products pr = new Products();
                //set cac thuoc tinh
                pr.setProductId(rs.getInt("ProductId"));
                pr.setPrdCategoryId(rs.getInt("PrdCategoryId"));
                pr.setProductName(rs.getString("ProductName"));
                //goi phuong thuc chuyen doi dinh dang tien
                pr.setProductPrice(rs.getFloat("ProductPrice"));
                pr.setProductDiscount(rs.getFloat("ProductDiscount"));
                pr.setCreateDate(rs.getDate("CreateDate"));
                pr.setUpdateDate(rs.getDate("UpdateDate"));
                pr.setIsActive(rs.getBoolean("IsActive"));
                pr.setPriority(rs.getInt("Priority"));
                pr.setProductDescription(rs.getString("ProductDescription"));
                pr.setIsHotProduct(rs.getBoolean("IsHotProduct"));
                pr.setProductTitle(rs.getString("ProductTitle"));
                pr.setAnhChinh(rs.getString("AnhChinh"));
                pr.setManufacturerId(rs.getInt("ManufacturerId"));
                pr.setView(rs.getInt("View"));
                pr.setBuyItem(rs.getInt("BuyItem"));
                pr.setProductPriceAfterDiscount(rs.getFloat("ProductPriceAfterDiscount"));
                pr.setAnhChinh2(rs.getString("AnhChinh2"));
                /*pr.setPrdCategoryName(rs.getString("PrdCategoryTitle"));
                 pr.setManufacturerName(rs.getString("ManufacturerName"));*/

                listProduct.add(pr);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn");
            CallableStatement callSt = (CallableStatement) map.get("callst");
            ConnectionDb.closeConnection(conn, callSt);
        }
        List<PrdCategory> listPrd = prdCategoryModel1.listPrd();

        model.getModelMap().put("listPrd", listPrd);

        List<Manufacturer> listManu = manufacturerModel.listManufacturer();
        model.getModelMap().put("listmanu", listManu);

        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);

        return model;

    }

}
