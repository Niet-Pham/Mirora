<%-- 
    Document   : checkOut
    Created on : Feb 26, 2019, 9:54:04 PM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<!doctype html>
<html class="no-js" lang="zxx">


    <!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/checkout.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:35 GMT -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="meta description">
        <!-- Favicons -->
        <link rel="shortcut icon" href="/WebProject/jsp/fontend/assets/img/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon" href="/WebProject/jsp/fontend/assets/img/icon.png">

        <!-- Title -->
        <title>Đặt hàng</title>

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
                                <h1 class="page-title">Đặt hàng</h1>
                                <ul class="breadcrumb justify-content-center">
                                    <li><a href="<%=request.getContextPath()%>/getData.htm">Trang chủ</a></li>
                                <li class="current"><a href="<%=request.getContextPath()%>/checkout.htm">Đặt hàng</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Breadcumb area End -->

            <!-- Main content wrapper start -->
            <div class="main-content-wrapper">
                <div class="checkout-area pt--40 pb--80 pt-md--30 pb-md--60">
                    <div class="container">
                        <div class="row">
                            <div class="col-12">

                            </div>
                        </div> 
                        <div class="row">
                            <div class="col-12">
                                <!-- Checkout Area Start -->
                                <div class="checkout-wrapper bg--2">
                                    <f:form class="form" action="finishCheckout.htm" commandName="op" >
                                        <div class="row">
                                            <div class="col-lg-6">
                                                <div class="checkout-title">
                                                    <h2>Thông tin đặt hàng</h2>
                                                </div>
                                                <div class="checkout-form">

                                                    <div class="form-row mb--30">
                                                        <div class="form__group col-12">
                                                            <label for="name" class="form__label">Họ và tên*</label>
                                                            <input value="${op.name}" type="text" name="name1" id="name1" class="form__input form__input--2" readonly="true">
                                                        </div>
                                                    </div>


                                                    <div class="form-row mb--30">
                                                        <div class="form__group col-12">
                                                            <label for="billing_streetAddress" class="form__label">Địa chỉ</label>
                                                            <input type="text" value="${op.address}" readonly="true" name="billing_streetAddress" id="billing_streetAddress" class="form__input form__input--2">
                                                        </div>
                                                    </div>
                                                      




                                                    <div class="form-row mb--30">
                                                        <div class="form__group col-md-6 mb-sm--30">
                                                            <label for="billing_phone" class="form__label">Điện thoại</label>
                                                            <input type="text" value="${op.getPhone()}" name="billing_phone" id="billing_phone" class="form__input form__input--2" readonly="true">
                                                        </div>
                                                        <div class="form__group col-md-6">
                                                            <label for="billing_email" class="form__label">Email: <span>*</span></label>
                                                            <input type="email" readonly="true" value="${op.email}" name="billing_email" id="billing_email" class="form__input form__input--2">
                                                        </div>
                                                    </div>
                                                    <div class="form-row mb--30">
                                                        <div class="form__group col-md-6 mb-sm--30">
                                                            <label for="billing_date" class="form__label">Ngày đặt hàng</label>
                                                            <input type="text" value="${op.createDate}" name="billing_date" id="billing_date" class="form__input form__input--2" readonly="true">
                                                        </div>
                                                         <div class="form__group col-md-6 mb-sm--30">
                                                            <label for="billing_date" class="form__label">Thanh toán</label>
                                                            <input type="text" value="<c:if test="${op.paymentId==1}">Thanh toán khi giao hàng</c:if><c:if test="${op.paymentId==2}">Thanh toán qua tài khoản ngân hàng</c:if>" name="billing_date" id="billing_date" class="form__input form__input--2" readonly="true">
                                                        </div>

                                                        </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-6 mt-md--30">
                                                <div class="order-details">
                                                    <h3 class="heading-tertiary">Sản phẩm giỏ hàng</h3>
                                                    <div class="order-table table-content table-responsive mb--30">
                                                        <table class="table">
                                                            <thead>
                                                                <tr>
                                                                    <th>Sản phẩm</th>
                                                                    <th>Thành tiền</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <c:forEach items="${listod}" var="cart">
                                                                    <tr>
                                                                        <td>${cart.productName}<strong>x${cart.quantity}</strong></td>
                                                                        <td><fmt:formatNumber maxFractionDigits="3" value="${cart.priceAfterDiscount}"></fmt:formatNumber>đ</td>
                                                                        </tr>
                                                                </c:forEach>
                                                            </tbody>
                                                            <tfoot>


                                                                <tr class="order-total">
                                                                    <th>Tổng tiền</th>
                                                                    <td><span class="order-total-ammount"><fmt:formatNumber maxFractionDigits="3" value="${op.totalAmount}"></fmt:formatNumber>đ</span></td>
                                                                    </tr>
                                                                </tfoot>
                                                            </table>
                                                        </div>
                                                        <div class="checkout-payment">



                                                        <div class="payment-btn-group">
                                                            
                                                            <a href="<%=request.getContextPath()%>/accountDetail.htm" class="btn btn-style-3"> Quay lại</a>
                                                        </div>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </f:form>
                                </div>
                                <!-- Checkout Area End -->
                            </div>
                        </div>
                    </div>     
                </div>
            </div>
            <!-- Main content wrapper end -->

            <!-- Header Area Start -->
            <jsp:include page="../dungchung/footer.jsp"></jsp:include>
            <!-- Header Area End -->

    </body>


    <!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/checkout.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:35 GMT -->
</html>
