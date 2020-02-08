<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html class="no-js" lang="vi">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="meta description">
        <!-- Favicons -->
        <link rel="shortcut icon" href="/WebProject/jsp/fontend/assets/img/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon" href="/WebProject/jsp/fontend/assets/img/icon.png"/>

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

    </head>


    <body>

        <div class="wrapper bg--shaft">
            <jsp:include page="../dungchung/header.jsp"></jsp:include>
                <!-- Main Content Wrapper Start -->
                <div class="main-content-wrapper">
                <jsp:include page="../dungchung/Banner.jsp"></jsp:include>

                    <!-- Products Tab area Start -->

                    <div class="product-tab pt--80 pb--60 pt-md--60 pb-md--45">
                        <div class="container">
                            <div class="row">
                                <div class="col-12 text-center">
                                    <ul class="nav nav-tabs product-tab__head" id="product-tab" role="tablist">
                                        <li class="product-tab__item nav-item active">
                                            <a class="product-tab__link nav-link active" id="nav-featured-tab" data-toggle="tab" href="#nav-featured" role="tab" aria-selected="true">Sản phẩm nổi bật</a>
                                        </li>
                                        <li class="product-tab__item nav-item">
                                            <a class="product-tab__link nav-link" id="nav-new-tab" data-toggle="tab" href="#nav-new" role="tab" aria-selected="false">Sản phẩm mới</a>
                                        </li>
                                        <li class="product-tab__item nav-item">
                                            <a class="product-tab__link nav-link" id="nav-bestseller-tab" data-toggle="tab" href="#nav-bestseller" role="tab" aria-selected="false">Sản phẩm bán chạy</a>
                                        </li>
                                        <li class="product-tab__item nav-item">
                                            <a class="product-tab__link nav-link" id="nav-onsale-tab" data-toggle="tab" href="#nav-onsale" role="tab" aria-selected="false">Sản phẩm khuyến mại</a>
                                        </li>
                                    </ul>
                                    <div class="tab-content product-tab__content" id="product-tabContent">
                                    <jsp:include page="ProductHot.jsp" ></jsp:include> 
                                    <jsp:include page="ProductBuyItem.jsp" ></jsp:include>
                                    <jsp:include page="productNew.jsp" ></jsp:include>
                                    <jsp:include page="productShare.jsp"></jsp:include>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Products Tab area End -->

                    <!-- Banner area Start -->

                    <section class="banner-area banner-bg-1 ptb--80 ptb-md--60">
                        <div class="banner-box text-center">
                            <h5 class="banner__label">Giảm 20% Toàn Bộ Sản Phẩm</h5>
                            <h2 class="banner__name">Bộ Sưu Tập Mới</h2>
                            <p class="banner__text mb--50 mb-md--20">Đây Là Những Thiết Kế Hot Nhất TRong Năm</p>
                            <a href="shop.html" class="btn btn-bordered btn-style-1">Khám Phá</a>
                        </div>
                    </section>      

                    <!-- Banner area End -->

                    <!-- Most Viewed Product area Start -->

                    <section class="mostviewed-product-area border-bottom pt--80 pb--60 pt-md--60 pb-md--50">
                        <div class="container">
                            <div class="row">
                                <div class="col-12">
                                    <div class="section-title mb--15">
                                        <h2 class="color--white">Sản Phẩm Được Xem Nhiều Nhất</h2>
                                    </div>
                                </div>
                            </div>
                            <div class="row no-gutters">
                                <div class="col-12">
                                    <div class="product-carousel nav-top js-product-carousel-2">
                                    <jsp:include page="ProductHotView.jsp"></jsp:include>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </section> 

                    <!-- Most Viewed Product area End -->

                    <!-- Blog area Start -->

                    <section class="blog-area pt--80 pb--40 pt-md--60 pb-md--30">
                        <div class="container">
                            <div class="row">
                                <div class="col-12">
                                    <div class="section-title mb--30">
                                        <h2>Tin tức - Sự kiện</h2>
                                    </div>
                                </div>
                            </div>  
                            <div class="row">
                                <div class="col-12">
                                    <div class="blog-carousel nav-top slick-item-gutter">
                                        <article class="blog">
                                            <a href="/WebProject/jsp/fontend/TinTuc/Tintuc1.jsp" class="blog__thumb">
                                                <img src="/WebProject/jsp/fontend/assets/img/blog/554786812_Tin.jpg" alt="Blog">
                                            </a>
                                            <div class="blog__content">
                                                <div class="blog__meta">
                                                    <p class="blog__author">Đăng bởi: <a href="blog.html">Mirora</a></p>
                                                    <p class="blog__date"><a href="blog.html">20 Oct 2018</a></p>
                                                </div>

                                                <h3 class="blog__title"><a href="/WebProject/jsp/fontend/TinTuc/Tintuc1.jsp">Big sale – Chào năm mới giảm giá đến 30% - Cơ hội nhận lì xì X5 giá trị hóa đơn.</a></h3>
                                                <div class="blog__text">
                                                    <p>
                                                        Song song với chương trình tặng vé Vip tham dự sự kiện tri ân khách hàng Mirora Show 04. Mirora tiếp tục triển khai ưu đãi hoàn tiền X5 giá trị sản phẩm cho khách hàng của Mirora qua 100 showroom bán lẻ trực tiếp trên toàn quốc.
                                                    </p>
                                                    <a class="read-more" href="/WebProject/jsp/fontend/TinTuc/Tintuc1.jsp">Truy cập</a>
                                                </div>

                                            </div>
                                        </article>
                                        <article class="blog">
                                            <a href="/WebProject/jsp/fontend/TinTuc/tintuc2.jsp" class="blog__thumb">
                                                <img src="/WebProject/jsp/fontend/assets/img/blog/1321500678_tin-cyber.jpg" alt="Blog">
                                            </a>
                                            <div class="blog__content">
                                                <div class="blog__meta">
                                                    <p class="blog__author">Đăng bởi <a href="blog.html">Mirora</a></p>
                                                    <p class="blog__date"><a href="blog.html">20 Oct 2018</a></p>
                                                </div>

                                                <h3 class="blog__title"><a href="/WebProject/jsp/fontend/TinTuc/tintuc2.jsp">Cơn Lốc Cyber Monday Thứ 2 Điện Tử  - sale khủng lên tới 40%.</a></h3>
                                                <div class="blog__text">
                                                    <p>Thật là đáng tiếc nếu như bạn quá bận rộn và trót bỏ lỡ bão sale Black Friday nhưng thật tuyệt vời vì cơ hội săn sale vẫn còn chưa kết thúc vì sau Black Friday còn có Cyber Monday nữa.</p>
                                                    <a class="read-more" href="/WebProject/jsp/fontend/TinTuc/tintuc2.jsp">Truy cập</a>
                                                </div>

                                            </div>
                                        </article>
                                        <article class="blog">
                                            <a href="/WebProject/jsp/fontend/TinTuc/tintuc3.jsp" class="blog__thumb">
                                                <img src="/WebProject/jsp/fontend/assets/img/blog/1566250881_tin-qq20.jpg" alt="Blog">
                                            </a>
                                            <div class="blog__content">
                                                <div class="blog__meta">
                                                    <p class="blog__author">Đăng bởi: <a href="blog.html">Mirora</a></p>
                                                    <p class="blog__date"><a href="blog.html">20 Oct 2018</a></p>
                                                </div>

                                                <h3 class="blog__title"><a href="/WebProject/jsp/fontend/TinTuc/tintuc3.jsp">Ưu đãi giảm giá ngay 20% đồng hồ Q&Q Jappan tại Đăng Quang Watch.</a></h3>
                                                <div class="blog__text">
                                                    <p>Tưng bừng khuyến mãi giảm giá ngay 20% cho tất cả sản phẩm đồng hồ Q&Q Jappan. Chương trình áp dụng từ 21/10 đến 31/10/2018.</p>
                                                    <a class="read-more" href="/WebProject/jsp/fontend/TinTuc/tintuc3.jsp">Truy cập</a>
                                                </div>

                                            </div>
                                        </article>
                                        <article class="blog">
                                            <a href="blog-details-image.html" class="blog__thumb">
                                                <img src="/WebProject/jsp/fontend/assets/img/blog/446858387_tin-kt.jpg" alt="Blog">
                                            </a>
                                            <div class="blog__content">
                                                <div class="blog__meta">
                                                    <p class="blog__author">Đăng bởi: <a href="blog.html">Mirora</a></p>
                                                    <p class="blog__date"><a href="blog.html">20 Oct 2018</a></p>
                                                </div>

                                                <h3 class="blog__title"><a href="/WebProject/jsp/fontend/TinTuc/tintuc4.jsp">Cùng U23 Việt Nam Dự Khai Trương Đăng Quang Watch Cần Thơ.</a></h3>
                                                <div class="blog__text">
                                                    <p>
                                                        Đồng hồ, món phụ kiện không thể thiếu trong cuộc sống thường ngày và cũng là trợ thủ đắc lực giúp hoàn thiện phong cách cũng như khẳng định cá tính của mỗi người. 
                                                    </p>
                                                    <a class="read-more" href="/WebProject/jsp/fontend/TinTuc/tintuc4.jsp">Truy cập</a>
                                                </div>

                                            </div>
                                        </article>
                                    </div>
                                </div>
                            </div>
                          
                        </div>
                    </section>

                    <!-- Blog area End -->

                    <!-- Newsletter area End -->

                  

                    <!-- Newsletter area End -->

                    <!-- Promo Box area Start -->

                    <div class="promo-box-area">
                        <div class="container-fluid p-0">
                            <div class="row no-gutters">
                                <div class="col-md-6 mb-sm--20">
                                    <div class="promo">
                                        <a href="shop.html" class="promo__box promo__box-2">
                                            <img src="/WebProject/jsp/fontend/assets/img/banner/img1-bottom-mirora1.jpg" alt="Product Category">
                                            <span class="promo__content promo__content-2">
                                                <span class="promo__label">New Arrivals 2018</span>
                                                <span class="promo__name">Luxury Perfume 2018</span>
                                                <span class="promo__price">Men's and Woman's Accessories</span>
                                                <span class="promo__link">Discover Now</span>
                                            </span>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="promo">
                                        <a href="shop.html" class="promo__box promo__box-2">
                                            <img src="/WebProject/jsp/fontend/assets/img/banner/img2-bottom-mirora1.jpg" alt="Product Category">
                                            <span class="promo__content promo__content-2">
                                                <span class="promo__label">Trending Products 2018</span>
                                                <span class="promo__name">Maurice Lacroix Watch</span>
                                                <span class="promo__price">Only  from  $162.00 - Sale 20% Off</span>
                                                <span class="promo__link">Discover Now</span>
                                            </span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Promo Box area End -->
                </div>
            <jsp:include page="../dungchung/footer.jsp"></jsp:include>


    </body>
</html>
