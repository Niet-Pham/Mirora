<%-- 
    Document   : ProductHot
    Created on : Jan 12, 2019, 10:10:40 PM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="tab-pane fade show active" id="nav-featured" role="tabpanel">
    <div class="row">
        <c:forEach items="${ListPrHot}" var="prHot">

            <div class="col-sm-3">
                <div class="mirora-product">
                    <div class="product-img">
                        <img src="/WebProject${prHot.getAnhChinh()}" alt="Product" class="primary-image" />
                        <img src="/WebProject${prHot.getAnhChinh2()}" alt="Product" class="secondary-image" />
                        <div class="product-img-overlay">
                            <span class="product-label discount" >
                                ${prHot.getProductDiscount()}%
                            </span>
                            <a href="<%=request.getContextPath()%>/getproductById.htm?productID=${prHot.getProductId()}&&manufacturer=${prHot.getManufacturerId()}" href="getproductById2.htm?productID=${prHot.getProductId()}" class="btn btn-transparent btn-fullwidth btn-medium btn-style-1">Xem ngay</a>
                        </div>
                    </div>
                    <div class="product-content text-center">
                        <span>${prHot.getManufacturerName()}</span>
                        <h4><a href="getproductById.htm?productID=${prHot.getProductId()}&&manufacturer=${prHot.getManufacturerId()}">${prHot.getProductName()}</a></h4>
                        <div class="product-price-wrapper">
                         
                             <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${prHot.getProductPriceAfterDiscount()}"></fmt:formatNumber>đ</span>
                            <span class="product-price-old">
                                
                                <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${prHot.getProductPrice()}"></fmt:formatNumber>đ</span>
                            </span>
                        </div>
                    </div>
                    <div class="mirora_product_action text-center position-absolute">
                        <div class="product-rating" >
                            <c:if test="${prHot.getDTB()==0}">
                                <span>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star"></i>
                                </span>
                            </c:if>  
                            <c:if test="${prHot.getDTB()==1}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star"></i></span>
                                </c:if> 
                                <c:if test="${prHot.getDTB()==2}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star"></i></span>
                                </c:if> 
                                <c:if test="${prHot.getDTB()==3}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star"></i></span>
                                </c:if> 
                                <c:if test="${prHot.getDTB()==4}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star"></i></span>
                                </c:if> 
                                <c:if test="${prHot.getDTB()==5}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                </span>
                            </c:if> 
                        </div>
                        <p>
                            ${prHot.getProductTitle()}
                        </p>
                        <div class="product-action">
                            <a class="same-action" href="wishlist.html" title="wishlist">
                                <i class="fa fa-heart-o"></i>
                            </a>
                            <a class="add_cart cart-item action-cart" href="<%=request.getContextPath()%>/addCart.htm?productId=${prHot.productId}" title="wishlist"><span>Thêm vào giỏ</span></a>
                            <a class="same-action compare-mrg" data-toggle="modal" data-target="#productModal" href="compare.html">
                                <i class="fa fa-sliders fa-rotate-90"></i>
                            </a>
                        </div>
                    </div>
                </div>

            </div>

        </c:forEach>

    </div>
</div>
