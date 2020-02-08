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
                                    <f:form class="form" action="finishCheckout.htm" commandName="or" >
                                        <div class="row">
                                            <div class="col-lg-6">
                                                <div class="checkout-title">
                                                    <h2>Thông tin đặt hàng</h2>
                                                </div>
                                                <div class="checkout-form">

                                                    <div class="form-row mb--30">
                                                        <div class="form__group col-12">
                                                            <label for="name" class="form__label">Họ và tên*</label>
                                                            <input value="${hoten}" type="text" name="name1" id="name1" class="form__input form__input--2" readonly="true">
                                                        </div>
                                                    </div>


                                                    <div class="form-row mb--30">
                                                        <div class="form__group col-12">
                                                            <label for="billing_streetAddress" class="form__label">Địa chỉ</label>
                                                            <input type="text" value="${address}" readonly="true" name="billing_streetAddress" id="billing_streetAddress" class="form__input form__input--2">
                                                        </div>
                                                    </div>





                                                    <div class="form-row mb--30">
                                                        <div class="form__group col-md-6 mb-sm--30">
                                                            <label for="billing_phone" class="form__label">Điện thoại</label>
                                                            <input type="text" value="${phone}" name="billing_phone" id="billing_phone" class="form__input form__input--2" readonly="true">
                                                        </div>
                                                        <div class="form__group col-md-6">
                                                            <label for="billing_email" class="form__label">Email: <span>*</span></label>
                                                            <input type="email" readonly="true" value="${email}" name="billing_email" id="billing_email" class="form__input form__input--2">
                                                        </div>
                                                    </div>

                                                    <div class="form-row mb--30">
                                                        <div class="form__group col-12">
                                                            <div class="custom-checkbox">
                                                                <input type="checkbox" name="shipdifferetads" id="shipdifferetads" class="form__checkbox">

                                                                <label for="shipdifferetads" class="form__checkbox--label shipping-label">Ship đến địa chỉ khác</label>
                                                            </div>
                                                            <div class="ship-box-info hide-in-default mt--30">
                                                                <div class="form-row mb--30">
                                                                    <div class="form__group col-12">
                                                                        <label for="shipping_name" class="form__label">Họ và tên</label>
                                                                        <f:input path="name" type="text" name="name" id="shipping_company" class="form__input form__input--2"/>
                                                                    </div>
                                                                </div>


                                                                <div class="form-row mb--30">
                                                                    <div class="form__group col-12">
                                                                        <label for="shipping_streetAddress" class="form__label">Địa chỉ</label>
                                                                        <f:input path="address" type="text" name="shipping_streetAddress" id="shipping_streetAddress" class="form__input form__input--2"/>
                                                                    </div>
                                                                </div>



                                                                <div class="form-row mb--30">
                                                                    <div class="form__group col-md-6 mb-sm--30">
                                                                        <label for="shipping_phone" class="form__label">Điện thoại</label>
                                                                        <f:input path="phone" type="text" name="shipping_phone" id="shipping_phone" class="form__input form__input--2"/>
                                                                    </div>
                                                                    <div class="form__group col-md-6">
                                                                        <label for="shipping_email" class="form__label">Email: <span>*</span></label>
                                                                        <f:input path="email" type="email" name="shipping_email" id="shipping_email" class="form__input form__input--2"/>
                                                                    </div>
                                                                </div>
                                                            </div>
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
                                                                <c:forEach items="${listCart}" var="cart">
                                                                    <tr>
                                                                        <td>${cart.product.productName}<strong>x${cart.quantity}</strong></td>
                                                                        <td><fmt:formatNumber maxFractionDigits="3" value="${cart.product.getProductPriceAfterDiscount()}"></fmt:formatNumber>đ</td>
                                                                    </tr>
                                                                </c:forEach>
                                                            </tbody>
                                                            <tfoot>


                                                                <tr class="order-total">
                                                                    <th>Tổng tiền</th>
                                                                    <td><span class="order-total-ammount"><fmt:formatNumber maxFractionDigits="3" value="${totalAmount}"></fmt:formatNumber>đ</span></td>
                                                                </tr>
                                                            </tfoot>
                                                        </table>
                                                    </div>
                                                    <div class="checkout-payment">


                                                        <div class="payment-group">
                                                            <div class="custom-radio payment-radio">
                                                                <f:radiobutton path="paymentId"  name="payment-method" id="cash" value="1" />
                                                                <label class="payment-label" for="cash">Thanh toán khi nhận hàng</label>
                                                            </div>
                                                            <div class="payment-info">
                                                                <p>Thanh toán bằng tiền mặt khi nhận hàng.</p>
                                                            </div>
                                                        </div>
                                                        <div class="payment-group">
                                                            <div class="custom-radio payment-radio">
                                                                <f:radiobutton path="paymentId"   value="2" name="payment-method" id="paypal"/>
                                                                <label class="payment-label" for="paypal">
                                                                    Thanh toán qua ngân hàng
                                                                    <img src="/WebProject/jsp/fontend/assets/img/others/AM_mc_vs_ms_ae_UK.png" alt="payment">
                                                                   
                                                                </label>
                                                            </div>
                                                           
                                                        </div>

                                                        <div class="payment-btn-group">
                                                            <button type="submit" class="btn btn-style-3">Đặt hàng</button>
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
