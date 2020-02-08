<%-- 
    Document   : cart
    Created on : Feb 25, 2019, 10:11:10 PM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!doctype html>
<html class="no-js" lang="zxx">


<!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/cart.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:35 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="meta description">
    <!-- Favicons -->
    <link rel="shortcut icon" href="/WebProject/jsp/fontend/assets/img/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="/WebProject/jsp/fontend/assets/img/icon.png">

    <!-- Title -->
    <title>Giỏ hàng</title>

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
                        <h1 class="page-title">Giỏ hàng</h1>
                        <ul class="breadcrumb justify-content-center">
                            <li><a href="<%=request.getContextPath()%>/getData.htm">Trang chủ</a></li>
                            <li class="current"><a href="<%=request.getContextPath()%>/cart.html">Giỏ hàng</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- Breadcumb area End -->

        <!-- Main content wrapper start -->

        <div class="main-content-wrapper">
            <div class="cart-area pt--40 pb--80 pt-md--30 pb-md--60">
                <div class="container">
                    <div class="cart-wrapper bg--2 mb--80 mb-md--60">
                        <div class="row">
                            <div class="col-12">
                                <!-- Cart Area Start -->
                                <form action="updateCart.htm" class="form cart-form">
                                    <div class="cart-table table-content table-responsive">
                                        <table class="table mb--30">
                                            <thead>
                                                <tr>
                                                    <th>Xóa</th>
                                                    <th>Ảnh sản phẩm</th>
                                                    <th>Tên sản phẩm</th>
                                                    <th>Giá</th>
                                                    <th>Số lượng</th>
                                                    <th>Thành tiền</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${listCart}" var="cart">
                                                <tr>
                                                    <td><a class="delete" href="<%=request.getContextPath()%>/removeCart.htm?productId=${cart.product.getProductId()}"><i class="fa fa-times"></i></a></td>
                                                    <td>
                                                        <a href="<%=request.getContextPath()%>/getproductById.htm?productID=${cart.product.getProductId()}&&manufacturer=${cart.product.getManufacturerId()}">
                                                            <img src="/WebProject${cart.product.anhChinh}" alt="product">
                                                        </a>
                                                    </td>
                                                    <td class="wide-column">
                                                        <h3><a href="<%=request.getContextPath()%>/getproductById.htm?productID=${cart.product.getProductId()}&&manufacturer=${cart.product.getManufacturerId()}">${cart.product.productName}</a></h3>
                                                    </td>
                                                    <td class="cart-product-price"><strong><fmt:formatNumber maxFractionDigits="3" value="${cart.product.getProductPriceAfterDiscount()}"></fmt:formatNumber>đ</strong></td>
                                                    <td>
                                                        <div class="quantity">
                                                            <input type="number" class="quantity-input" name="qty" id="pro_qty" value="${cart.quantity}" min="1">
                                                        </div>
                                                    </td>
                                                    <td class="cart-product-price"><strong><fmt:formatNumber maxFractionDigits="3" value="${(cart.product.getProductPriceAfterDiscount())*cart.quantity}"></fmt:formatNumber></strong></td>
                                                </tr>
                                             </c:forEach>  
                                            </tbody>
                                        </table>
                                    </div>

                                    <div class="row">
                                       
                                        <div class="col-12 text-md-right">
                                            <div class="cart-btn-group">
                                                <input type="submit" class="btn btn-medium btn-style-3" value="Cập nhật giỏ hàng"/>
                                                      <a href="<%=request.getContextPath()%>/getShopProduct.htm" class="btn btn-medium btn-style-3">Quay lại trang sản phẩm</a>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <!-- Cart Area End --> 
                            </div>
                        </div>
                    </div>
                    <div class="cart-page-total-wrapper">
                        <div class="row justify-content-end">
                            <div class="col-xl-6 col-lg-8 col-md-10">
                                <div class="cart-page-total bg--dark-3">
                                    
                                    <div class="cart-calculator-table table-content table-responsive">
                                        <table class="table">
                                            <tbody>
                                               
                                              
                                                <tr class="cart-total">
                                                    <th>Tổng tiền</th>
                                                    <td><span class="price-ammount"><fmt:formatNumber maxFractionDigits="3" value="${totalAmount}"></fmt:formatNumber>đ</span></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <a href="<%=request.getContextPath()%>/checkout.htm" class="btn btn-medium btn-style-3">Tiếp tục đặt hàng</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>      
            </div>
        </div>

        <!-- Main content wrapper end -->

        <jsp:include page="../dungchung/footer.jsp"></jsp:include>

</body>


<!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/cart.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:35 GMT -->
</html>
