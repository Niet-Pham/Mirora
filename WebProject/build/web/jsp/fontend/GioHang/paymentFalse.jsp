<%-- 
    Document   : dathangthatbai
    Created on : Mar 1, 2019, 12:41:29 AM
    Author     : Đức Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">


<!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/404.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:46 GMT -->
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

        <!-- Main Wrapper Start -->
        <main id="content" class="main-content-wrapper">
            <div class="error-area pt--90 pb--100">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-xl-7 col-lg-8 text-center">
                            <div class="error">
                               
                                <h2>Đặt hàng thất bại</h2>
                                <p>Bạn vui lòng kiểm tra lại thông tin</p>
                                
                                <a href="<%=request.getContextPath()%>/checkout.htm" class="btn btn-4 btn-style-3">Quay trờ lại trang đặt hàng</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <!-- Main Wrapper End -->

           <jsp:include page="../dungchung/footer.jsp"></jsp:include>

</body>


<!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/404.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:46 GMT -->
</html>
