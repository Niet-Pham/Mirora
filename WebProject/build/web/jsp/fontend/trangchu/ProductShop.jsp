<%-- 
    Document   : ProductShop
    Created on : Jan 18, 2019, 2:50:18 PM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html class="no-js" lang="zxx">


    <!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/shop.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:41 GMT -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="meta description">
        <!-- Favicons -->
        <link rel="shortcut icon" href="/WebProject/jsp/fontend/assets/img/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon" href="/WebProject/jsp/fontend/assets/img/icon.png">

        <!-- Title -->
        <title>Mirora - Watch & Luxury Store Bootstrap 4 Template</title>

        <!-- ************************* CSS Files ************************* -->

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="/WebProject/jsp/fontend/assets/css/bootstrap.min.css">

        <!-- Font Awesome CSS -->
        <link rel="stylesheet" href="/WebProject/jsp/fontend/assets/css/font-awesome.min.css">

        <!-- Elegent Icon CSS -->
        <link rel="stylesheet" href="/WebProject/jsp/fontend/assets/css/elegent-icons.css">

        <!-- All Plugins CSS css -->
        <link rel="stylesheet" href="/WebProject/jsp/fontend/assets/css/plugins.css">

        <!-- style css -->
        <link rel="stylesheet" href="/WebProject/jsp/fontend/assets/css/main.css">

        <!-- modernizr JS
        ============================================ -->
        <script src="/WebProject/jsp/fontend/assets/js/vendor/modernizr-2.8.3.min.js"></script>
        <!--[if lt IE 9]>
        <script src="//oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="//oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>


        <!-- Main Wrapper Start -->
        <div class="wrapper bg--shaft">
            <!-- Header Area Start -->
            <jsp:include page="../dungchung/header.jsp"></jsp:include>
                <!-- Header Area End -->

                <!-- Breadcumb area Start -->
                <div class="breadcrumb-area">
                    <div class="container">
                        <div class="row">
                            <div class="col-12 text-center">
                                <h1 class="page-title">Sản phẩm</h1>
                                <ul class="breadcrumb justify-content-center">
                                    <li><a href="index.html">Trang chủ</a></li>
                                    <li class="current"><a href="shop.html">Tất cả sản phẩm</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Breadcumb area End -->

                <!-- Main Content Wrapper Start -->
                <div class="main-content-wrapper">
                    <div class="shop-area pt--40 pb--80 pt-md--30 pb-md--60">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-9 order-lg-2 mb-md--30">
                                    <div class="row">
                                        <div class="col-12">


                                            <!-- Shop Toolbar Start -->
                                            <div class="shop-toolbar">
                                                <div class="product-view-mode" data-default="3">
                                                    <a class="grid-2" data-target="gridview-2" data-toggle="tooltip" data-placement="top" title="2">2</a>
                                                    <a class="active grid-3" data-target="gridview-3" data-toggle="tooltip" data-placement="top" title="3">3</a>
                                                    <a class="grid-4" data-target="gridview-4" data-toggle="tooltip" data-placement="top" title="4">4</a>
                                                    <a class="grid-5" data-target="gridview-5" data-toggle="tooltip" data-placement="top" title="5">5</a>
                                                    <a class="list" data-target="listview" data-toggle="tooltip" data-placement="top" title="5">List</a>
                                                </div>
                                           
                                           
                                             
                                            </div>
                                            <!-- Shop Toolbar End -->
                                        </div>
                                    </div>

                                    <!-- Main Shop wrapper Start -->
                                    <div class="shop-product-wrap grid gridview-3 row no-gutters">
                                    <c:forEach items="${listProduct}" var="pr">
                                        <div class="col-xl-3 col-lg-4 col-md-6 col-12">
                                            <div class="mirora-product mb-md--10">
                                                <div class="product-img">
                                                    <img src="/WebProject${pr.anhChinh}" alt="Product" class="primary-image" />
                                                    <img src="/WebProject${pr.getAnhChinh2()}" alt="Product" class="secondary-image" />
                                                    <div class="product-img-overlay">
                                                        <span class="product-label discount">
                                                            ${pr.getProductDiscount()}%
                                                        </span>
                                                        <a href="<%=request.getContextPath()%>/getproductById.htm?productID=${pr.getProductId()}&&manufacturer=${pr.getManufacturerId()}" class="btn btn-transparent btn-fullwidth btn-medium btn-style-1">Xem ngay</a>
                                                    </div>
                                                </div>
                                                <div class="product-content text-center">
                                                    <span>${pr.getManufacturerName()}</span>
                                                    <h4><a href="<%=request.getContextPath()%>/getproductById.htm?productID=${pr.getProductId()}&&manufacturer=${pr.getManufacturerId()}">${pr.productName}</a></h4>
                                                    <div class="product-price-wrapper">
                                                          <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${pr.getProductPriceAfterDiscount()}"></fmt:formatNumber>đ</span>
                                                     
                                                        <span class="product-price-old">
                                                              <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${pr.getProductPriceAfterDiscount()}"></fmt:formatNumber>đ</span>
                                                           
                                                        </span>
                                                    </div>
                                                </div>
                                                <div class="mirora_product_action text-center position-absolute">
                                                    <div class="product-rating">
                                                        <span>
                                                            <i class="fa fa-star theme-star"></i>
                                                            <i class="fa fa-star theme-star"></i>
                                                            <i class="fa fa-star theme-star"></i>
                                                            <i class="fa fa-star theme-star"></i>
                                                            <i class="fa fa-star"></i>
                                                        </span>
                                                    </div>
                                                    <p>
                                                        ${pr.getProductTitle()}
                                                    </p>
                                                    <div class="product-action">
                                                      
                                                        <a class="add_cart cart-item action-cart" href="<%=request.getContextPath()%>/addCart.htm?productId=${pr.productId}" title="wishlist"><span>Thêm vào giỏ</span></a>
                                                    
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="mirora-product-list">
                                                <div class="product-img">
                                                    <img src="/WebProject${pr.anhChinh}" alt="Product" class="primary-image" />
                                                    <img src="/WebProject${pr.getAnhChinh2()}" alt="Product" class="secondary-image" />
                                                    <div class="product-img-overlay">
                                                        <span class="product-label discount">
                                                            ${pr.getProductDiscount()}%
                                                        </span>
                                                        <a href="<%=request.getContextPath()%>/getproductById.htm?productID=${pr.getProductId()}&&manufacturer=${pr.getManufacturerId()}" class="btn btn-transparent btn-fullwidth btn-medium btn-style-1">Xem ngay</a>
                                                    </div>
                                                </div>
                                                <div class="product-content">
                                                    <span>Cartier</span>
                                                    <h4><a href="<%=request.getContextPath()%>/getproductById.htm?productID=${pr.getProductId()}&&manufacturer=${pr.getManufacturerId()}">${pr.productName}</a></h4>
                                                    <div class="product-rating">
                                                        <span>
                                                            <i class="fa fa-star theme-star"></i>
                                                            <i class="fa fa-star theme-star"></i>
                                                            <i class="fa fa-star theme-star"></i>
                                                            <i class="fa fa-star theme-star"></i>
                                                            <i class="fa fa-star"></i>
                                                        </span>
                                                    </div>
                                                    <p class="product-desc">
                                                        ${pr.getProductTitle()}
                                                    </p>
                                                    <div class="product-price-wrapper">
                                                           <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${pr.getProductPriceAfterDiscount()}"></fmt:formatNumber>đ</span>
                      
                                                        <span class="product-price-old">
                                                             <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${pr.getProductPrice()}"></fmt:formatNumber>đ</span>
                                           
                                                        </span>
                                                    </div>
                                                    <div class="product-action">
                                                        <a class="add_cart cart-item action-cart" href="<%=request.getContextPath()%>/addCart.htm?productId=${pr.productId}" title="wishlist"><span>Thêm vào giỏ</span></a>
                                                        <a class="same-action" href="wishlist.html" title="wishlist">
                                                            <i class="fa fa-heart-o"></i>
                                                        </a>
                                                        <a class="same-action compare-mrg" data-toggle="modal" data-target="#productModal" href="compare.html">
                                                            <i class="fa fa-sliders fa-rotate-90"></i>
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                              
                                <!-- Main Shop wrapper End -->

                                <!-- Pagination Start -->
                                <div class="pagination-wrap mt--15 mt-md--10">
                                 
                                    <ul class="pagination">
                                        <li> ${url}</li>
                                       
                                    </ul>
                                </div>
                                <!-- Pagination End -->
                            </div>
                            <div class="col-lg-3 order-lg-1">
                                <aside class="shop-sidebar">

                                    <div class="footer-widget" style="padding-bottom: 25px" >
                                        <h3 class="filter-heading">Thương hiệu</h3>
                                        <!-- BEGIN BOX-CATEGORY -->
                                        <div class="widget-menu">
                                            <ul>
                                                <c:forEach items="${listmanu}" var="mn">
                                                <li> <a href="getShopProductByManufacruerId.htm?idtruyenvao=${mn.manufacturerId}">${mn.getManufacturerName()}</a> </li>
                                               </c:forEach>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="row"></div>   

                                    <div class="search-filter">
                                                
                                        <div class="footer-widget" " >
                                        <h3 class="filter-heading">Khoảng giá</h3>
                                        <!-- BEGIN BOX-CATEGORY -->
                                        <div class="widget-menu">
                                            <ul>
                                                
                                                <li> <a href="<%=request.getContextPath()%>/getShopProductByPrice.htm?dau=0&&cuoi=20000000">0-20 triệu    </a> </li>
                                               <li> <a href="<%=request.getContextPath()%>/getShopProductByPrice.htm?dau=20000000&&cuoi=50000000">20-50 triệu    </a> </li>
                                               <li> <a href="<%=request.getContextPath()%>/getShopProductByPrice.htm?dau=50000000&&cuoi=1000000000000000000000000000000000">>50 triệu    </a> </li>
                                            </ul>
                                        </div>
                                    </div>

                                        <div class="footer-widget" style="padding-bottom: 25px" >
                                        <h3 class="filter-heading">Loại đồng hồ</h3>
                                        <!-- BEGIN BOX-CATEGORY -->
                                        <div class="widget-menu">
                                            <ul>
                                                <c:forEach items="${listPrd}" var="listPrd">
                                                <li> <a href="getShopProductByPrd.htm?prdCategoryId=${listPrd.prdCategoryID}">${listPrd.prdCategoryTitle}</a> </li>
                                               </c:forEach>
                                            </ul>
                                        </div>
                                    </div>
                                    </div>
                                    <div class="banner-static">
                                        <a href="#">
                                            <img src="/WebProject/jsp/fontend/assets/img/banner/img-sidebar.jpg" alt="Banner">
                                        </a>
                                    </div>
                                </aside>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Main Content Wrapper Start -->

            <jsp:include page="../dungchung/footer.jsp"></jsp:include> 

    </body>


    <!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/shop.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:41 GMT -->
</html>
