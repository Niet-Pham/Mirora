<%-- 
    Document   : getProductById
    Created on : Jan 17, 2019, 3:02:58 PM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<!doctype html>
<html class="no-js" lang="zxx">


    <!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/product-details.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:33 GMT -->
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
            <jsp:include page="../dungchung/header.jsp"></jsp:include>

                <!-- Breadcumb area Start -->
                <div class="breadcrumb-area">
                    <div class="container">
                        <div class="row">
                            <div class="col-12 text-center">
                                <h1 class="page-title">Chi tiết sản phẩm</h1>
                                <ul class="breadcrumb justify-content-center">
                                    <li><a href="<%=request.getContextPath()%>/getData.htm">Trang chủ</a></li>
                                    <li><a href="shop.html">Sản phẩm</a></li>
                                    <li class="current"><a href="<%=request.getContextPath()%>/getproductById.htm">Đồng hồ chính hãng</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Breadcumb area End -->

                <!-- Main Content Wrapper Start -->
                <div class="main-content-wrapper">
                    <div class="single-products-area section-padding section-md-padding">
                        <div class="container">
                            <!-- Single Product Start -->

                            <section class="mirora-single-product pb--80 pb-md--60">

                                <div class="row">
                                    <div class="col-lg-6">
                                        <!-- Tab Content Start -->

                                        <div class="tab-content product-details-thumb-large" id="myTabContent-3">
                                       
                                            <div class="tab-pane fade show active" id="product-large-0">

                                                <div class="product-details-img easyzoom">
                                                    <a class="popup-btn" href="/WebProject${PrbyId.getAnhChinh()}">
                                                        <img src="/WebProject${PrbyId.getAnhChinh()}" alt="product">
                                                    </a>
                                                </div>
                                            </div>
                                        
                                        <c:forEach items="${listImagebyId}" var="image">
                                            <div class="tab-pane fade" id="product-large-${image.getImageId()}">
                                                <div class="product-details-img easyzoom">
                                                    <a class="popup-btn" href="/WebProject${image.getUrl()}">
                                                        <img src="/WebProject${image.getUrl()}" alt="product">
                                                    </a>
                                                </div>
                                            </div>
                                        </c:forEach>

                                    </div>
                                    <!-- Tab Content End -->

                                    <!-- Product Thumbnail Carousel Start -->
                                    <div class="product-details-thumbnail">
                                        <div class="thumb-menu product-details-thumb-menu nav-vertical-center" id="thumbmenu-horizontal">
                                           
                                                <div class="thumb-menu-item">
                                                    <a href="#product-large-0" data-toggle="tab" class="nav-link active">
                                                        <img src="/WebProject${PrbyId.getAnhChinh()}" alt="product thumb">
                                                    </a>
                                                </div>
                                            
                                            <c:forEach items="${listImagebyId}" var="image">
                                                <div class="thumb-menu-item">
                                                    <a href="#product-large-${image.getImageId()}" data-toggle="tab" class="nav-link">
                                                        <img src="/WebProject${image.getUrl()}" alt="product thumb">
                                                    </a>
                                                </div>
                                            </c:forEach>

                                        </div>
                                    </div>
                                    <!-- Product Thumbnail Carousel End -->
                                </div>
                                <div class="col-lg-6">
                                    <!-- Single Product Content Start -->
                                    
                                        <div class="product-details-content"> 
                                            <div class="product-details-top">
                                                <h2 class="product-details-name">${PrbyId.getProductName()}</h2>
                                                <div class="ratings-wrap">
                                                    <div class="rating">
                                                          <c:if test="${comment.getAvgRatting()==0}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                    </c:if>  
                                                                    <c:if test="${comment.getAvgRatting()==0.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                    </c:if>  
                                                                    <c:if test="${comment.getAvgRatting()==1}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>  
                                                                    <c:if test="${comment.getAvgRatting()==1.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>  
                                                                    <c:if test="${comment.getAvgRatting()==2}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>  
                                                                    <c:if test="${comment.getAvgRatting()==2.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>  
                                                                    <c:if test="${comment.getAvgRatting()==3}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if> 
                                                                    <c:if test="${comment.getAvgRatting()==3.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>

                                                                    <c:if test="${comment.getAvgRatting()==4}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if> 
                                                                    <c:if test="${comment.getAvgRatting()==4.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if> 
                                                                    <c:if test="${comment.getAvgRatting()==5}">
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if> 
                                                    </div>
                                                    <span>
                                                        <a class="review-btn" href="#singleProductTab">${ListComment.size()} Đánh giá</a>
                                                        <a class="review-btn" href="#singleProductTab">Viết đánh giá</a>
                                                    </span>
                                                </div>
                                                <ul class="product-details-list list-unstyled">
                                                    <li>Loại đồng hồ: <a href="#">${PrbyId.getPrdCategoryName()}</a></li>
                                                    <li>Thương hiệu: ${PrbyId.getManufacturerName()}</li>

                                                </ul>
                                                <div class="product-details-price-wrapper">
                                                  <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${PrbyId.getProductPriceAfterDiscount()}"></fmt:formatNumber>đ</span>
                                                    <span class="product-price-old">
                                                                        <span class="money"><fmt:formatNumber maxFractionDigits="3" value="${PrbyId.getProductPrice()}"></fmt:formatNumber>đ</span>
                                                    </span>
                                                </div>                                      
                                            </div>  

                                            <div class="product-details-bottom">

                                               
                                                <div class="product-details-action-wrapper mb--20">
                                                    <div class="product-details-action-top d-flex align-items-center mb--20">
                                                     
                                                            <a class="btn btn-medium btn-style-2 add-to-cart" href="addCart.htm?productId=${PrbyId.productId}" title="wishlist"><span>Thêm vào giỏ</span></a>
                                                    </div>
                                                
                                                </div>  
                                                <p class="product-details-tags">
                                                    Tags: <a href="shop.html">Sport</a>,
                                                    <a href="shop.html">Luxury</a>
                                                </p> 
                                                <div class="social-share">
                                                    <a href="facebook.com" class="facebook share-button">
                                                        <i class="fa fa-facebook"></i>
                                                        <span>Like</span>
                                                    </a>
                                                    <a href="twitter.com" class="twitter share-button">
                                                        <i class="fa fa-twitter"></i>
                                                        <span>Tweet</span>
                                                    </a>
                                                    <a href="#" class="share share-button">
                                                        <i class="fa fa-plus-square"></i> 
                                                        <span>Share</span>
                                                    </a>
                                                </div>
                                            </div>       
                                        </div>
                                    
                                    <!-- Single Product Content End -->
                                </div>
                            </div>
                        </section>

                        <!-- Single Product End -->  

                        <!-- Single Product Tab Start -->
                        <section class="product-details-tab bg--dark-4 ptb--80 ptb-md--60">
                            <div class="row">
                                <div class="col-12">
                                    <ul class="product-details-tab-head nav nav-tab" id="singleProductTab" role="tablist">
                                        <li class="nav-item product-details-tab-item">
                                            <a class="nav-link product-details-tab-link active" id="nav-desc-tab" data-toggle="tab" href="#nav-desc" role="tab" aria-controls="nav-desc" aria-selected="true">Chi tiết sản phẩm</a>
                                        </li>


                                        <li class="nav-item product-details-tab-item">
                                            <a class="nav-link product-details-tab-link" id="nav-review-tab" data-toggle="tab" href="#nav-review" role="tab" aria-controls="nav-review" aria-selected="true">Đánh giá</a>
                                        </li>
                                    </ul>
                                    <div class="product-details-tab-content tab-content">
                                        <div class="tab-pane fade show active" id="nav-desc" role="tabpanel" aria-labelledby="nav-desc-tab">
                                            
                                                <p class="product-details-description">
                                                    ${PrbyId.getProductDescription()}
                                                </p>
                                          
                                        </div>

                                        <div class="tab-pane" role="tabpanel" id="nav-review" aria-labelledby="nav-review-tab">
                                            <div class="product-details-review-wrap">
                                                <h2 class="mb--20">${ListComment.size()} Đánh giá cho sản phẩm</h2>
                                                <c:forEach items="${ListComment}" var="ListComment">
                                                    <div class="review mb--40">
                                                        <div class="review__single">
                                                            <div class="review__meta">
                                                                <p class="review__author">${ListComment.getName()}</p>
                                                                <p class="review__date">${ListComment.getCreateDate()}</p>
                                                            </div>
                                                            <div class="review__content">
                                                                <p class="review__text">
                                                                    ${ListComment.getContent()}
                                                                </p>
                                                                <div class="rating">
                                                                    <c:if test="${ListComment.getRatting()==0}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                    </c:if>  
                                                                    <c:if test="${ListComment.getRatting()==0.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                    </c:if>  
                                                                    <c:if test="${ListComment.getRatting()==1}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>  
                                                                    <c:if test="${ListComment.getRatting()==1.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>  
                                                                    <c:if test="${ListComment.getRatting()==2}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>  
                                                                    <c:if test="${ListComment.getRatting()==2.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>  
                                                                    <c:if test="${ListComment.getRatting()==3}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if> 
                                                                    <c:if test="${ListComment.getRatting()==3.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                        <label style="color: #a8741a;"  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if>

                                                                    <c:if test="${ListComment.getRatting()==4}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if> 
                                                                    <c:if test="${ListComment.getRatting()==4.5}">
                                                                        <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if> 
                                                                    <c:if test="${ListComment.getRatting()==5}">
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>
                                                                        <label style="color: #a8741a;" class = "full" for="star5" title="Awesome - 5 stars" >  
                                                                        </label>

                                                                    </c:if> 
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>
                                                </c:forEach>
                                                <h2 class="mb--20">Viết đánh giá, bình luận</h2>
                                                <f:form action="comment.htm" commandName="cmt"  class="form form--review" onsubmit="return checkComment();">
                                                    <div class="form__group clearfix mb--20">
                                                        <label class="form__label d-block" >Chất lượng</label>
                                                        <div class="rating">
                                                            <f:radiobutton   path="ratting" id="star5" name="rating" value="5"  />
                                                            <label  class = "full" for="star5" title="Awesome - 5 stars" >  
                                                            </label>
                                                            <f:radiobutton path="ratting" id="star4half" name="rating" value="4.5" />
                                                            <label class="half" for="star4half" title="Pretty good - 4.5 stars">
                                                            </label>
                                                            <f:radiobutton path="ratting" id="star4" name="rating" value="4" />
                                                            <label class = "full" for="star4" title="Pretty good - 4 stars"> 
                                                            </label>
                                                            <f:radiobutton path="ratting" id="star3half" name="rating" value="3.5" />
                                                            <label class="half" for="star3half" title="Meh - 3.5 stars">  
                                                            </label>
                                                            <f:radiobutton path="ratting" id="star3" name="rating" value="3" />
                                                            <label class = "full" for="star3" title="Meh - 3 stars">    
                                                            </label>
                                                            <f:radiobutton path="ratting" id="star2half" name="rating" value="2.5" />
                                                            <label class="half" for="star2half" title="Kinda bad - 2.5 stars">    
                                                            </label>
                                                            <f:radiobutton path="ratting" id="star2" name="rating" value="2" />
                                                            <label class = "full" for="star2" title="Kinda bad - 2 stars">    
                                                            </label>
                                                            <f:radiobutton path="ratting" id="star1half" name="rating" value="1.5" />
                                                            <label class="half" for="star1half" title="Meh - 1.5 stars">    
                                                            </label>
                                                            <f:radiobutton path="ratting" id="star1" name="rating" value="1" />
                                                            <label class = "full" for="star1" title="Sucks big time - 1 star">    
                                                            </label>
                                                            <f:radiobutton path="ratting" id="starhalf" name="rating" value="0.5" />
                                                            <label class="half" for="starhalf" title="Sucks big time - 0.5 stars">    
                                                            </label>
                                                        </div>
                                                    </div>
                                                    <div class="form__group clearfix mb--20">
                                                        <label class="form__label d-block" for="review_name">Tên <sup>*</sup></label>
                                                        <input id="review_name" name="review_name" class="form__input" value="${hoten}" readonly="true">
                                                    </div>
                                                    <div class="form__group clearfix mb--20">
                                                        <label class="form__label d-block" for="review_email">Email <sup>*</sup></label>
                                                        <input id="review_email" name="review_email" class="form__input" value="${email}" readonly="true">
                                                    </div>
                                                    <div class="form__group clearfix mb--20">
                                                        <label class="form__label d-block" for="review">Đánh giá<sup>*</sup></label>
                                                        <f:textarea path="content" id="review" name="review" class="form__input form__input--textarea"></f:textarea>

                                                        </div>
                                                        <div class="form__group text-right">
                                                            <button type="submit" class="btn btn-medium btn-style-1">Gửi</button>
                                                        </div>
                                                </f:form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                        <!-- Single Product Tab End -->

                        <!-- Related Product Start -->
                        <section class="related-products-area pt--80 pb--20 pb-md--15 pt-md--60">
                            <div class="row">
                                <div class="col-12 mb--20">
                                    <div class="section-title">
                                        <h2>Sản phẩm cùng thương hiệu</h2>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12">
                                    <div class="product-carousel nav-top js-product-carousel-2">
                                        <c:forEach items="${ListProductByManufacturerId}" var="lstmn">
                                            <div class="mirora-product">
                                                <div class="product-img">
                                                    <img src="/WebProject${lstmn.getAnhChinh()}" alt="Product" class="primary-image" />
                                                    <img src="/WebProject${lstmn.getAnhChinh2()}" alt="Product" class="secondary-image" />
                                                    <div class="product-img-overlay">
                                                        <span class="product-label discount">
                                                            ${lstmn.getProductDiscount()};
                                                        </span>
                                                        <a a href="getproductById.htm?productID=${lstmn.getProductId()}&&manufacturer=${lstmn.getManufacturerId()}" class="btn btn-transparent btn-fullwidth btn-medium btn-style-1">Xem ngay</a>
                                                    </div>
                                                </div>
                                                <div class="product-content text-center">
                                                    <span>${lstmn.getManufacturerName()}</span>
                                                    <h4><a href="getproductById.htm?productID=${lstmn.getProductId()}&&manufacturer=${lstmn.getManufacturerId()}">${lstmn.getProductName()}</a></h4>
                                                    <div class="product-price-wrapper">
                                                        <span class="money">${lstmn.getProductPriceAfterDiscount()}</span>
                                                        <span class="product-price-old">
                                                            <span class="money">${lstmn.getProductPrice()}</span>
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
                                                        ${lstmn.getProductTitle()}
                                                    </p>
                                                    <div class="product-action">
                                                       
                                                        <a class="add_cart cart-item action-cart" href="<%=request.getContextPath()%>/addCart.htm?productId=${lstmn.productId}" title="wishlist"><span>Thêm vào giỏ</span></a>
                                                       
                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                        </section>
                        <!-- Related Product End -->
                    </div>
                </div>
            </div>
            <!-- Main Content Wrapper End -->
            <jsp:include page="../dungchung/footer.jsp"></jsp:include>
            <script type="text/javascript">
                function checkComment() {

                    var review_name = document.getElementById("review_name");
                    
                     var review = document.getElementById("review");
                    if (review_name.value == "")
                    {
                        alert("Bạn phải đăng nhập để tiếp tục:");

                        return false;




                    }else if (review.value == "")
                     {
                        alert("Bạn phải viết đánh giá để tiếp tục để tiếp tục:");

                        return false;




                    }
                    else
                    {
                        return true;

                    }




                }
            </script>


    </body>


    <!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/product-details.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:34 GMT -->
</html>
