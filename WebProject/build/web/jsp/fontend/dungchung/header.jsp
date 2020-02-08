<%-- 
    Document   : header
    Created on : Jan 3, 2019, 10:11:34 AM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- Header Area Start -->
<header class="header headery-style-1">
    <div class="header-top header-top-1">
        <div class="container">
            <div class="row no-gutters align-items-center">
                <div class="col-lg-8 d-flex align-items-center flex-column flex-lg-row">
                    <ul class="social social-round mr--20">
                        <li class="social__item">
                            <a href="twitter.com" class="social__link">
                                <i class="fa fa-twitter"></i>
                            </a>
                        </li>
                        <li class="social__item">
                            <a href="plus.google.com" class="social__link">
                                <i class="fa fa-google-plus"></i>
                            </a>
                        </li>
                        <li class="social__item">
                            <a href="facebook.com" class="social__link">
                                <i class="fa fa-facebook"></i>
                            </a>
                        </li>
                        <li class="social__item">
                            <a href="youtube.com" class="social__link">
                                <i class="fa fa-youtube"></i>
                            </a>
                        </li>
                        <li class="social__item">
                            <a href="instagram.com" class="social__link">
                                <i class="fa fa-instagram"></i>
                            </a>
                        </li>
                    </ul>
                    <p class="header-text">Free ship với hóa đơn nếu nhập mã code <span>“Watches2018”</span></p>
                </div>
                <div class="col-lg-4">
                    <div class="header-top-nav d-flex justify-content-lg-end justify-content-center">
                       
                       
                        <div class="user-info header-top-nav__item">
                            <div class="dropdown header-top__dropdown">
                                <c:if test="${hoten==null}" >
                                    <a class="dropdown-toggle" id="userID" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Tài khoản
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <div class="dropdown-menu" aria-labelledby="userID">
                                        <a style="font-weight: 200" class="dropdown-item" href="<%=request.getContextPath()%>/initDangky.htm">Đăng ký/Đăng nhập</a>

                                    </div>
                                </c:if>
                                <c:if test="${hoten!=null}" >
                                    <a class="dropdown-toggle" id="userID" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Xin chào ${hoten}!
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                        <div class="dropdown-menu" aria-labelledby="userID">
                                        <a class="dropdown-item" href="<%=request.getContextPath()%>/accountDetail.htm">Thông tin tài khoản</a>
                                            <a class="dropdown-item" href="<%=request.getContextPath()%>/logout.htm">Đăng xuất</a>
                                    </div>
                                   
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="header-middle header-top-1">
        <div class="container">
            <div class="row no-gutters align-items-center">
                <div class="col-md-5 col-sm-6 order-lg-1 order-2">
                    <div class="contact-info">
                        <img src="/WebProject/jsp/fontend/assets/img/icons/icon_phone.png" alt="Phone Icon">
                        <p>Mua hàng <br>(012) 800 456 789</p>
                    </div>
                </div>
                <div class="col-lg-2 col-12 order-lg-2 order-1 text-center">
                    <a href="index.html" class="logo-box mb-md--30">
                        <img src="/WebProject/jsp/fontend/assets/img/logo/logo.png" alt="logo">
                    </a>
                </div>
                <div class="col-lg-5 col-md-7 col-sm-6 order-lg-3 order-3">
                    <div class="header-toolbar">
                        <div class="search-form-wrapper search-hide">
                            <form action="findProduct.htm" class="search-form">
                                <input type="text" name="search" id="search" class="search-form__input" placeholder="Tìm kiếm sản phẩm">
                                <button type="submit" class="search-form__submit">
                                    <i class="icon_search"></i>
                                </button>
                            </form>
                        </div>
                        <ul class="header-toolbar-icons">
                            <li class="search-box">
                                <a href="#" class="bordered-icon search-btn" aria-expanded="false"><i class="icon_search"></i></a>
                            </li>
                        
                            <li class="mini-cart-icon">
                                <div class="mini-cart mini-cart--1">
                                    
                                    <a class="mini-cart__dropdown-toggle bordered-icon" id="cartDropdown">
                                        <span class="mini-cart__count">${listCart.size()}</span>
                                        <i class="icon_cart_alt mini-cart__icon"></i>
                                        <span class="mini-cart__ammount"><fmt:formatNumber maxFractionDigits="3" value="${totalAmount}"></fmt:formatNumber>đ<i class="fa fa-angle-down"></i></span>
                                    </a>
                                   
                                    <div class="mini-cart__dropdown-menu">
                                        
                                        <div class="mini-cart__content" id="miniCart">
                                           
                                            <div class="mini-cart__item">
                                                <c:forEach items="${listCart}" var="cart">
                                                <div class="mini-cart__item--single">
                                                    <div class="mini-cart__item--image">
                                                        <img src="/WebProject${cart.product.anhChinh}" alt="product">
                                                    </div>
                                                    <div class="mini-cart__item--content">
                                                        <h4 class="mini-cart__item--name"><a href="<%=request.getContextPath()%>/getproductById.htm?productID=${cart.product.getProductId()}&&manufacturer=${cart.product.getManufacturerId()}">${cart.product.productName}</a> </h4>
                                                        <p class="mini-cart__item--quantity">x${cart.quantity}</p>
                                                        <p class="mini-cart__item--price"><fmt:formatNumber maxFractionDigits="3" value="${cart.product.getProductPriceAfterDiscount()*cart.quantity}"></fmt:formatNumber>đ</p>
                                                    </div>
                                                    <a class="mini-cart__item--remove" href="<%=request.getContextPath()%>/removeCart.htm?productId=${cart.product.getProductId()}"><i class="icon_close"></i></a>
                                                </div>
                                              </c:forEach>
                                            </div>
                                            <div class="mini-cart__calculation">
                                                <p>
                                                    <span class="mini-cart__calculation--item">Tổng tiền :</span>
                                                    <span class="mini-cart__calculation--ammount"><fmt:formatNumber maxFractionDigits="3" value="${totalAmount}"></fmt:formatNumber>đ</span>
                                                </p>
                                                
                                              
                                                
                                            </div>
                                            <div class="mini-cart__btn">
                                                <a href="<%=request.getContextPath()%>/addCart1.htm" class="btn btn-fullwidth btn-style-1">Xem giỏ hàng</a>
                                                <a href="<%=request.getContextPath()%>/checkout.htm" class="btn btn-fullwidth btn-style-1">Đặt hàng</a>
                                               
                                            </div>
                                           
                                        </div>
                                                 
                                    </div>
                                               
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>  
            </div>
        </div>
    </div>
    <div class="header-bottom header-top-1 position-relative navigation-wrap fixed-header">
        <div class="container position-static">
            <div class="row">
                <div class="col-12 position-static text-center">
                    <nav class="main-navigation">
                        <ul class="mainmenu">
                            <li class="mainmenu__item">
                                <a href="<%=request.getContextPath()%>/getData.htm" class="mainmenu__link">Trang chủ</a>

                            </li>
                            <li class="mainmenu__item menu-item-has-children">
                                <a href="<%=request.getContextPath()%>/getShopProduct.htm" class="mainmenu__link">Sản phẩm</a>
                                <ul class="megamenu five-column">
                                    <li>
                                        <a class="megamenu-title" href="#">Thương hiệu</a>
                                        <ul>
                                            <c:forEach items="${listmanu}" var="mn">
                                                <li> <a href="<%=request.getContextPath()%>/getShopProductByManufacruerId.htm?idtruyenvao=${mn.manufacturerId}">${mn.getManufacturerName()}</a> </li>
                                               </c:forEach>
                                        </ul>
                                    </li>
                                    <li>
                                        <a class="megamenu-title" href="#">Loại đồng hồ</a>
                                        <ul>
                                            <c:forEach items="${listPrd}" var="listPrd">
                                                <li> <a href="<%=request.getContextPath()%>/getShopProductByPrd.htm?prdCategoryId=${listPrd.prdCategoryID}">${listPrd.prdCategoryTitle}</a> </li>
                                               </c:forEach>
                                        </ul>
                                    </li>
                                    <li>
                                        <a class="megamenu-title" href="#">Khoảng giá</a>
                                        <ul>
                                            <li> <a href="<%=request.getContextPath()%>/getShopProductByPrice.htm?dau=0&&cuoi=20000000">0-20 triệu    </a> </li>
                                               <li> <a href="<%=request.getContextPath()%>/getShopProductByPrice.htm?dau=20000000&&cuoi=50000000">20-50 triệu    </a> </li>
                                               <li> <a href="<%=request.getContextPath()%>/getShopProductByPrice.htm?dau=50000000&&cuoi=1000000000000000000000000000000000">>50 triệu    </a> </li>
                                        </ul>
                                    </li>
                                  
                                   
                                </ul>
                            </li>
                            <li class="mainmenu__item">
                                <a href="/WebProject/jsp/fontend/TinTuc/indexTintuc.jsp" class="mainmenu__link">Tin tức</a>
                               
                            </li>
                           
                            <li class="mainmenu__item">
                                <a href="/WebProject/jsp/fontend/TinTuc/veMirora.jsp" class="mainmenu__link">Về Mirora</a>
                            </li>
                            <li class="mainmenu__item">
                                <a href="/WebProject/jsp/fontend/TinTuc/veMirora.jsp" class="mainmenu__link">Liên hệ</a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
            <div class="row no-gutters">
                <div class="col-12">
                    <div class="mobile-menu"></div>
                </div>
            </div>
        </div>
    </div>
</header>
<!-- Header Area End -->