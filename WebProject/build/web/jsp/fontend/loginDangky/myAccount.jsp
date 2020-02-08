<%-- 
    Document   : myAccount
    Created on : Feb 17, 2019, 10:36:59 PM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html class="no-js" lang="zxx">


<!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/my-account.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:45 GMT -->
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
                        <h1 class="page-title">Thông tin tài khoản</h1>
                        <ul class="breadcrumb justify-content-center">
                            <li><a href="index.html">Trang chủ</a></li>
                            <li class="current"><a href="my-account.html">Thông tin tài khoản</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- Breadcumb area End -->

        <!-- Main Content wrapper start -->

        <section class="main-content-wrapper">
            <div class="account-wrapper pt--40 pb--80 pt-md--30 pb-md--60">
                <div class="container">
                    <div class="user-dashboard-tab">
                        <div class="row">
                            <div class="col-lg-4 mb-md--30">
                                <div class="user-dashboard-tab__head nav flex-column" role="tablist" aria-orientation="vertical">
                                    <a class="nav-link active" data-toggle="pill" role="tab" href="#addresses" aria-controls="addresses" aria-selected="true">Thông tin tài khoản</a>
                                  
                                    <a class="nav-link" data-toggle="pill" role="tab" href="#orders" aria-controls="orders" aria-selected="true">Đơn hàng</a>
                                   
                                    
                                    <a class="nav-link" data-toggle="pill" role="tab" href="#accountdetails" aria-controls="accountdetails" aria-selected="true">Thay đổi mật khẩu</a>
                                    <a class="nav-link" href="logout.htm"">Đăng xuất</a>
                                </div>
                            </div>
                            <div class="col-lg-8">
                                <div class="user-dashboard-tab__content tab-content">
                                 
                                    <div class="tab-pane fade" id="orders">
                                        <div class="account-table table-content table-responsive">
                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th>Mã đơn hàng</th>
                                                        <th>Ngày đặt</th>
                                                        <th>Trạng thái</th>
                                                        <th>Tổng tiền</th>
                                                        <th>Actions</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    
                                                <c:forEach items="${listOr}" var="order">
                                                    <tr>
                                                        <td>${order.orderId}</td>
                                                        <td class="wide-column">${order.createDate}</td>
                                                        <td><c:if test="${order.isActive==1}">Đang chờ xử lý</c:if>
                                                            <c:if test="${order.isActive==2}">Đang giao hàng</c:if>
                                                            <c:if test="${order.isActive==3}">Hoàn thành</c:if></td>
                                                        <td class="wide-column"><fmt:formatNumber maxFractionDigits="3" value="${order.totalAmount}"></fmt:formatNumber></td>
                                                        <td><a href="viewOrder.htm?orId=${order.orderId}" class="btn btn-medium btn-style-1">Xem</a>
                                                            <c:if test="${order.isActive==1&&order.paymentId==1}"><a href="removeOrder.htm?orId=${order.orderId}" class="btn btn-medium btn-style-1">Xóa</a></c:if></td>
                                                    </tr>
                                                 </c:forEach> 
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                    
                                    <div class="tab-pane fade show active" id="addresses">
                                        <div class="billing-address mb--20">
                                            
                                            <h4>Thông tin</h4>
                                            
                                            <div class="address-form bg--2 mt--20 " id="billing_address">
                                            <f:form action="UpdateAccDetail.htm" class="form" commandName="acc">
                                                    <div class="form-row mb--20">
                                                        <div class="form__group col-md-6 mb-sm--30">
                                                            <label for="billing_fname" class="form__label">Họ <span>*</span></label>
                                                            <f:input path="firstName" type="text" name="billing_fname" id="billing_fname" class="form__input form__input--2"/>
                                                        </div>
                                                        <div class="form__group col-md-6">
                                                            <label for="billing_lname" class="form__label">Tên <span>*</span></label>
                                                            <f:input path="lastName" type="text" name="billing_lname" id="billing_lname" class="form__input form__input--2"/>
                                                        </div>
                                                    </div>
                                                  
                                                
                                                    <div class="form-row mb--20">
                                                        <div class="form__group col-12">
                                                            <label for="billing_streetAddress" class="form__label">Địa chỉ</label>
                                                            <f:input path="address" type="text" name="billing_streetAddress" id="billing_streetAddress" class="form__input form__input--2"/>
                                                        </div>
                                                    </div>
                                        
                                                    <div class="form-row mb--20">
                                                        <div class="form__group col-md-6 mb-sm--30">
                                                            <label for="billing_phone" class="form__label">Số điện thoại</label>
                                                            <f:input path="Phone" type="text" name="billing_phone" id="billing_phone" class="form__input form__input--2"/>
                                                        </div>
                                                        <div class="form__group col-md-6">
                                                            <label for="billing_email" class="form__label">Email <span>*</span></label>
                                                            <f:input path="email" type="email" name="billing_email" id="billing_email" class="form__input form__input--2"/>
                                                        </div>
                                                    </div>
                                                    <div class="form-row">
                                                        <div class="form__group col-12">
                                                            <button type="submit" class="btn btn-medium btn-style-1">Thay đổi</button>
                                                        </div>
                                                    </div>
                                                </f:form>
                                            </div>
                                        </div>
                                      </div>  
                                    
                                   <div class="tab-pane fade" id="accountdetails">
                                        <div class="account-form bg--2">
                                            <f:form action="UpdatePassword.htm" class="form" commandName="accPass">
                                            
                                              
                                                <div class="form-row">
                                                    <div class="col-12">
                                                        <h4>Thay đổi mật khẩu</h4>
                                                    </div>
                                                </div>
                                                <div class="form-row mb--20">
                                                    <div class="col-12">
                                                        <div class="form__group">
                                                            <label for="cur_password" class="form__label">Mật khẩu cũ</label>
                                                            <f:input path="passWord" type="password" name="cur_password" id="cur_password" class="form__input form__input--2"/>
                                                        </div>
                                                    </div>
                                                </div>                                             
                                                <div class="form-row mb--20">
                                                    <div class="col-12">
                                                        <div class="form__group">
                                                            <label for="new_password" class="form__label">Mật khẩu mới</label>
                                                            <f:input path="newpassWord" type="password" name="new_password" id="new_password" class="form__input form__input--2"/>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-row mb--20">
                                                    <div class="col-12">
                                                        <div class="form__group">
                                                            <label for="new_password" class="form__label">Nhập lại mật khẩu</label>
                                                            <input type="password" name="confirm_password" id="confirm_password" class="form__input form__input--2">
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-row">
                                                    <div class="col-12">
                                                        <button type="submit" class="btn btn-medium btn-style-2">Lưu thay đổi</button>
                                                    </div>
                                                </div>
                                            </f:form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div> 
                </div>    
            </div>
        </section>

        <!-- Main Content wrapper end -->

        <jsp:include page="../dungchung/footer.jsp"></jsp:include>

</body>


<!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/my-account.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:46 GMT -->
</html>
