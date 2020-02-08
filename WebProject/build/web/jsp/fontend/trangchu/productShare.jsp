<%-- 
    Document   : productShare
    Created on : Jan 11, 2019, 10:10:27 AM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<div class="tab-pane fade" id="nav-onsale" role="tabpanel">
    <div class="row">
        <c:forEach items="${lstprShare}" var="prShare">

            <div class="col-sm-3">
                <div class="mirora-product">
                    <div class="product-img">
                        <img src="/WebProject${prShare.getAnhChinh()}" alt="Product" class="primary-image" />
                        <img src="/WebProject${prShare.getAnhChinh2()}" alt="Product" class="secondary-image" />
                        <div class="product-img-overlay">
                            <span class="product-label discount" >
                                ${prShare.getProductDiscount()}%
                            </span>
                            <a href="<%=request.getContextPath()%>/getproductById.htm?productID=${prShare.getProductId()}&&manufacturer=${prShare.getManufacturerId()}" class="btn btn-transparent btn-fullwidth btn-medium btn-style-1">Quick View</a>
                        </div>
                    </div>
                    <div class="product-content text-center">
                        <span>${prShare.getManufacturerName()}</span>
                        <h4><a href="<%=request.getContextPath()%>/getproductById.htm?productID=${prShare.getProductId()}&&manufacturer=${prShare.getManufacturerId()}">${prShare.getProductName()}</a></h4>
                        <div class="product-price-wrapper">
                              <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${prShare.getProductPriceAfterDiscount()}"></fmt:formatNumber>đ</span>
                            <span class="product-price-old">
                                                   <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${prShare.getProductPrice()}"></fmt:formatNumber>đ</span>
                            </span>
                        </div>
                    </div>
                    <div class="mirora_product_action text-center position-absolute">
                        <div class="product-rating" >
                            <c:if test="${prShare.getDTB()==0}">
                                <span>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star"></i>
                                </span>
                            </c:if>  
                            <c:if test="${prShare.getDTB()==1}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star"></i></span>
                                </c:if> 
                                <c:if test="${prShare.getDTB()==2}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star"></i></span>
                                </c:if> 
                                <c:if test="${prShare.getDTB()==3}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star "></i>
                                    <i class="fa fa-star"></i></span>
                                </c:if> 
                                <c:if test="${prShare.getDTB()==4}">
                                <span>
                                    <i class="fa fa-star theme-star "></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star theme-star"></i>
                                    <i class="fa fa-star"></i></span>
                                </c:if> 
                                <c:if test="${prShare.getDTB()==5}">
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
                            ${prShare.getProductTitle()}
                        </p>
                        <div class="product-action">
                            <a class="same-action" href="wishlist.html" title="wishlist">
                                <i class="fa fa-heart-o"></i>
                            </a>
                            <a class="add_cart cart-item action-cart" href="<%=request.getContextPath()%>/addCart.htm?productId=${prShare.productId}" title="wishlist"><span>Thêm vào giỏ</span></a>
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
