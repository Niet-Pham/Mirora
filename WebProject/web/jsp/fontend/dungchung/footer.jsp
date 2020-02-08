<%-- 
    Document   : footer
    Created on : Jan 3, 2019, 10:18:31 AM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
 <!-- Footer Start -->
        <footer class="footer border-top ptb--40 ptb-md--30">
            <div class="container">
                <div class="row mb--40 mb-md--30">
                    <div class="col-lg-4 col-md-6 mb-md--30">
                        <div class="footer-widget">
                            <h3 class="widget-title">Mirora Watch</h3>
                            <div class="widget-content mb--20">
                                <p>Địa chỉ: 123 Hoàng Quốc Việt, Hà Nội, <br> CA 12345 - USA.</p>
                                <p>Điện thoại: (012) 800 456 789</p>
                                <p>Fax: (012) 800 456 789</p>
                                <p>Email: Contact@plazathemes.com</p>
                            </div>
                            <ul class="social social-round">
                                <li class="social__item">
                                    <a class="social__link" href="facebook.com">
                                        <i class="fa fa-facebook"></i>
                                    </a>
                                </li>
                                <li class="social__item">
                                    <a class="social__link" href="twitter.com">
                                        <i class="fa fa-twitter"></i>
                                    </a>
                                </li>
                                <li class="social__item">
                                    <a class="social__link" href="youtube.com">
                                        <i class="fa fa-youtube"></i>
                                    </a>
                                </li>
                                <li class="social__item">
                                    <a class="social__link" href="instagram.com">
                                        <i class="fa fa-instagram"></i>
                                    </a>
                                </li>
                                <li class="social__item">
                                    <a class="social__link" href="plus.google.com">
                                        <i class="fa fa-google-plus"></i>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-6 mb-md--30">
                        <div class="footer-widget">
                            <h3 class="widget-title">VỀ CHÚNG TÔI</h3>
                            <ul class="widget-menu">
                                <li><a href="<%=request.getContextPath()%>/getData.htm">Trang chủ</a></li>
                                <li><a href="/WebProject/jsp/fontend/TinTuc/veMirora.jsp">Giới thiệu chung</a></li>
                                <li><a href="/WebProject/jsp/fontend/TinTuc/indexTintuc.jsp">Tin tức & sự kiện</a></li>
                                <li><a href="#">Hệ thống chi nhánh</a></li>
                              
                                <li><a href="#">Liên hệ</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 mb-sm--30">
                        <div class="footer-widget">
                            <h3 class="widget-title">HỖ TRỢ KHÁCH HÀNG</h3>
                            <ul class="widget-menu">
                                <li><a href="#">1. CHÍNH SÁCH BẢO HÀNH</a></li>
                                <li><a href="#">2. CHÍNH SÁCH ĐỔI TRẢ</a></li>
                                <li><a href="#">3. CHÍNH SÁCH BẢO MẬT THÔNG TIN</a></li>
                                <li><a href="#">4. CHÍNH SÁCH VẬN CHUYỂN</a></li>
                                <li><a href="#">5. HƯỚNG DẪN THANH TOÁN</a></li>
                                <li><a href="#">6. HƯỚNG DẪN MUA HÀNG</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <h3 class="widget-title">SẢN PHẨM</h3>
                            <div class="widget-product">
                                <div class="product">
                                    <div class="product-img">
                                        <img src="/WebProject/jsp/fontend/assets/img/products/11-450x450.jpg" alt="products">
                                    </div>
                                    <div class="product-content">
                                        <div class="product-rating">
                                            <span>
                                                <i class="fa fa-star theme-star"></i>
                                                <i class="fa fa-star theme-star"></i>
                                                <i class="fa fa-star theme-star"></i>
                                                <i class="fa fa-star theme-star"></i>
                                                <i class="fa fa-star"></i>
                                            </span>
                                        </div>
                                        <h4 class="product-title">
                                            <a href="product-details.html" tabindex="0">Acer Aspire E 15</a>
                                        </h4>
                                        <div class="product-price-wrapper">
                                            <span class="money">$550.00</span>
                                            <span class="product-price-old">
                                                <span class="money">$700.00</span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="product">
                                    <div class="product-img">
                                        <img src="/WebProject/jsp/fontend/assets/img/products/11-450x450.jpg" alt="products">
                                    </div>
                                    <div class="product-content">
                                        <div class="product-rating">
                                            <span>
                                                <i class="fa fa-star theme-star"></i>
                                                <i class="fa fa-star theme-star"></i>
                                                <i class="fa fa-star theme-star"></i>
                                                <i class="fa fa-star theme-star"></i>
                                                <i class="fa fa-star"></i>
                                            </span>
                                        </div>
                                        <h4 class="product-title">
                                            <a href="product-details.html" tabindex="0">Acer Aspire E 15</a>
                                        </h4>
                                        <div class="product-price-wrapper">
                                            <span class="money">$550.00</span>
                                            <span class="product-price-old">
                                                <span class="money">$700.00</span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row mb--40 mb-md--30">
                    <div class="col-12">
                        <ul class="footer-menu">
                            <li><a href="#">Home</a></li>
                            <li><a href="#">Online Store</a></li>
                            <li><a href="#">Promotion</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Terms Of Use</a></li>
                            <li><a href="#">Sitemap</a></li>
                            <li><a href="#">Support</a></li>
                            <li><a href="#">Contacts</a></li>
                        </ul>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 text-center">
                        <p class="copyright-text">Copyright &copy; 2018 <a href="#">HasTech</a> .All Right Reserved.</p>
                        <img src="/WebProject/jsp/fontend/assets/img/others/payment.png" alt="payment">
                    </div>
                </div>
            </div>
        </footer>
        <!-- Footer End -->

        <!-- Scroll To Top Start -->    
        <a class="scroll-to-top" href="#"><i class="fa fa-angle-double-up"></i></a>
        <!-- Scroll To Top End -->

        

</div>
    <!-- Main Wrapper End -->


    <!-- ************************* JS Files ************************* -->

    <!-- jQuery JS -->
    <script src="/WebProject/jsp/fontend/assets/js/vendor/jquery.min.js"></script>

    <!-- Bootstrap and Popper Bundle JS -->
    <script src="/WebProject/jsp/fontend/assets/js/bootstrap.bundle.min.js"></script>

    <!-- All Plugins Js -->
    <script src="/WebProject/jsp/fontend/assets/js/plugins.js"></script>
    <!-- Ajax Mail Js -->
    <script src="/WebProject/jsp/fontend/assets/js/ajax-mail.js"></script>

    <!-- Main JS -->
    <script src="/WebProject/jsp/fontend/assets/js/main.js"></script>

