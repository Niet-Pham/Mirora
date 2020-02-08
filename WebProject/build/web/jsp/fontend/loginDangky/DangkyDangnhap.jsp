<%-- 
    Document   : DangkyDangnhap
    Created on : Feb 12, 2019, 4:57:35 PM
    Author     : Đức Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri ="http://www.springframework.org/tags/form" prefix="f" %>
<!doctype html>
<html class="no-js" lang="zxx">


    <!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/login-register.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:33 GMT -->
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
                <div class="main-content-wrapper">
                    <div class="login-register-area">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-6 mb-md--40">
                                    <h2 class="heading-secondary mb--30">Đăng nhập</h2>
                                    <div class="login-reg-box p-4 bg--2">
                                        <f:form class="form" action="loginAccount.htm" commandName="newAcc" onsubmit="return checkDangnhap();">
                                            <div class="form__group mb--20">
                                                <label class="form__label" for="username_email">
                                                    Tên đăng nhập <span>*</span>
                                                </label>
                                                <f:input path="userName" type="text" name="username_email" id="username_email" class="form__input form__input--2"/>
                                                <br/><label for="" id="txtErrorUserlogin"></label>
                                            </div>
                                            <div class="form__group mb--20">
                                                <label class="form__label" for="password">
                                                    Mật khẩu <span>*</span>
                                                </label>
                                                <f:input path="passWord" type="password" name="password" id="password" class="form__input form__input--2"/>
                                                <br/><label for="" id="txtErrorpasslogin"></label>
                                            </div>
                                            <div class="form__group d-flex align-items-center">
                                                <button type="submit" class="btn btn-5 btn-style-1 color-1">Đăng nhập</button>
                                                
                                            </div>
                                           
                                        </f:form>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <h2 class="heading-secondary mb--30">Đăng ký</h2>
                                    <div class="login-reg-box p-4 bg--2">
                                    <f:form action="insertAccount.htm" class="form" commandName="newAcc" onsubmit="return checkDangky();">
                                        <div class="form__group mb--20">
                                            <label class="form__label" for="register_email">
                                                Tên đăng nhập <span>*</span>
                                            </label>
                                            <f:input path="userName" type="text" name="register_email" id="register_email" class="form__input form__input--2"/>
                                            <br/><label for="" id="txtErrorUserName"></label>
                                        </div>
                                        <div class="form__group mb--20">
                                            <label class="form__label" for="register_password">
                                                Mật khẩu <span>*</span>
                                            </label>
                                            <f:input path="passWord" type="password" name="register_password" id="register_password" class="form__input form__input--2"/>
                                            <br/><label for="" id="txtErrorpassword"></label>
                                        </div>
                                        <div class="form__group mb--20">
                                            <label class="form__label" for="register_password1">
                                                Nhập lại mật khẩu <span>*</span>
                                            </label>
                                            <input type="password" name="register_password1" id="register_password1" class="form__input form__input--2">
                                             <br/><label for="" id="txtErrorrepassword"></label>
                                        </div>
                                        <div class="form-row mb--30">
                                            <div class="form__group col-md-6 mb-sm--30">
                                                <label for="billing_fname" class="form__label">Họ <span>*</span></label>
                                                <f:input path="lastName" type="text" name="billing_fname" id="billing_fname" class="form__input form__input--2"/>
                                                <br/><label for="" id="txtErrorfirstname"></label>
                                            </div>
                                            <div class="form__group col-md-6">
                                                <label for="billing_lname" class="form__label">Tên <span>*</span></label>
                                                <f:input path="firstName" type="text" name="billing_lname" id="billing_lname" class="form__input form__input--2"/>
                                                <br/><label for="" id="txtErrorlastname"></label>
                                            </div>
                                        </div>
                                        <div class="form-row mb--30">
                                            <div class="form__group col-md-6 mb-sm--30">
                                                <label for="billing_phone" class="form__label">Điện Thoại</label>
                                                <f:input path="Phone" type="text" name="billing_phone" id="billing_phone" class="form__input form__input--2"/>
                                                <br/><label for="" id="txtErrorphone"></label>
                                            </div>
                                            <div class="form__group col-md-6">
                                                <label for="billing_email" class="form__label">Email <span>*</span></label>
                                                <f:input path="email" type="email" name="billing_email" id="billing_email" class="form__input form__input--2"/>
                                                <br/><label for="" id="txtErroremail"></label>
                                            </div>
                                        </div>
                                        <div class="form-row mb--30">
                                            <div class="form__group col-12">
                                                <label for="billing_country" class="form__label">Quốc gia</label>
                                                <f:select path="nation" id="billing_country" name="billing_country" class="form__input form__input--2 nice-select">
                                                    <f:option value="">Chọn quốc gia…</f:option>
                                                    <f:option value="Afghanistan">Afghanistan</f:option>
                                                    <f:option value="Albania">Albania</f:option>
                                                    <f:option value="Algeria">Algeria</f:option>
                                                    <f:option value="Argentina">Argentina</f:option>
                                                    <f:option value="Armenia">Armenia</f:option>
                                                    <f:option value="Swaziland">Swaziland</f:option>
                                                    <f:option value="Sweden">Sweden</f:option>
                                                    <f:option value="Switzerland">Switzerland</f:option>
                                                    <f:option value="Tunisia">Tunisia</f:option>
                                                    <f:option value="Turkey">Turkey</f:option>
                                                    <f:option value="Ukraine">Ukraine</f:option>
                                                    <f:option value="United Arab Emirates">United Arab Emirates</f:option>
                                                    <f:option value="United Kingdom (UK)">United Kingdom (UK)</f:option>
                                                    <f:option value="United States (US)">United States (US)</f:option>
                                                    <f:option value="Việt Nam" selected="selected">Việt Nam</f:option>
                                                </f:select>
                                                <br/><label for="" id="txtErrorcountry"></label>
                                            </div>
                                        </div>
                                        <div class="form-row mb--30">
                                            <div class="form__group col-12">
                                                <label for="billing_district" class="form__label">Tỉnh/Thành phố <span>*</span></label>
                                                <f:select path="city" name="billing_district" id="billing_district" class="form__input form__input--2 nice-select">
                                                    <f:option value="">Chọn tỉnh/thành…</f:option>

                                                    <f:option value="Điện Biên">Điện Biên</f:option>
                                                    <f:option value="Đồng Nai">Đồng Nai</f:option>
                                                    <f:option value="Đồng Tháp">Đồng Tháp</f:option>
                                                    <f:option value="Gia Lai">Gia Lai</f:option>
                                                    <f:option value="Hà Giang">Hà Giang</f:option>
                                                    <f:option value="Hà Nam">Hà Nam</f:option>
                                                    <f:option value="Hà Nội">Hà Nội</f:option>
                                                    <f:option value="Hà Tĩnh">Hà Tĩnh</f:option>
                                                    <f:option value="Hải Dương">Hải Dương</f:option>
                                                    <f:option value="Hải Phòng">Hải Phòng</f:option>

                                                </f:select>
                                                <br/><label for="" id="txtErrorcity"></label>
                                            </div>
                                        </div>

                                        <div class="form-row mb--30">
                                            <div class="form__group col-12">
                                                <label for="billing_streetAddress" class="form__label">Địa chỉ</label>
                                                <f:input title="Nhập số nhà, đường" path="address"  type="text" name="billing_streetAddress" id="billing_streetAddress" class="form__input form__input--2" />
                                                <br/><label for="" id="txtErroraddress"></label>
                                            </div>
                                        </div> 

                                        <div class="form__group">
                                            <button  type="submit" class="btn btn-5 btn-style-2"  >Đăng ký</button>
                                        </div>
                                    </f:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Main Wrapper End -->

            <jsp:include page="../dungchung/footer.jsp"></jsp:include>
            <style>
                .error{
                    color: red;
                }
            </style>
            <script type="text/javascript">
                function checkDangky() {

                    var userName = document.getElementById("register_email");
                    var password = document.getElementById("register_password");
                    var repassword = document.getElementById("register_password1");
                    var firstName = document.getElementById("billing_fname");
                    var lastName = document.getElementById("billing_lname");
                    var email = document.getElementById("billing_email");
                    var nation = document.getElementById("billing_country");
                    var city = document.getElementById("billing_district");
                    var address = document.getElementById("billing_streetAddress");


                    if (userName.value != "" && password.value != "" && repassword.value != "" && firstName.value != "" && lastName.value != "" && email.value != "" && nation.value != "" && city.value != "" && address.value != "") {
                        if (password.value != repassword.value)
                        {
                            document.getElementById("txtErrorpassword").innerHTML = "Bạn đã nhập sai mật khẩu, vui lòng kiểm tra lại!";
                            document.getElementById("txtErrorpassword").className = "error"
                            password.focus();
                            return false;
                        }
                        else {
                             alert("Bạn đã đăng ký thành công, vui lòng đăng nhập để tiếp tục");
                             
                            return true;
                            
                            
                        }
                    } else {
                        if (userName.value == "")
                        {
                            // alert("Nhap user name");
                            // document.getElementById("register_email").focus();
                            // return false;

                            document.getElementById("txtErrorUserName").innerHTML = "Bạn chưa nhập UserName!";
                            document.getElementById("txtErrorUserName").className = "error"
                            userName.focus();
                          
                            return false;
                        }
                         if(password.value == "")
                              {
                             document.getElementById("txtErrorpassword").innerHTML = "Bạn chưa nhập mật khẩu!";
                            document.getElementById("txtErrorpassword").className = "error"
                            password.focus();
                            return false;
                        }
                           if(repassword.value == "")
                              {
                             document.getElementById("txtErrorrepassword").innerHTML = "Bạn chưa nhập lại mật khẩu!";
                            document.getElementById("txtErrorrepassword").className = "error"
                            repassword.focus();
                            return false;
                        }
                          if(firstName.value == "")
                              {
                             document.getElementById("txtErrorfirstname").innerHTML = "Bạn chưa nhập họ!";
                            document.getElementById("txtErrorfirstname").className = "error"
                            firstName.focus();
                            return false;
                        }
                          if(lastName.value == "")
                              {
                             document.getElementById("txtErrorlastname").innerHTML = "Bạn chưa nhập tên!";
                            document.getElementById("txtErrorlastname").className = "error"
                            lastName.focus();
                            return false;
                        }
                            if(email.value == "")
                              {
                             document.getElementById("txtErroremail").innerHTML = "Bạn chưa nhập email!";
                            document.getElementById("txtErroremail").className = "error"
                            email.focus();
                            return false;
                        }
                           if(nation.value == "")
                              {
                             document.getElementById("txtErrorcountry").innerHTML = "Bạn chưa nhập quốc gia!";
                            document.getElementById("txtErrorcountry").className = "error"
                            nation.focus();
                            return false;
                        }
                           if(city.value == "")
                              {
                             document.getElementById("txtErrorcity").innerHTML = "Bạn chưa nhập thành phố!";
                            document.getElementById("txtErrorcity").className = "error"
                            city.focus();
                            return false;
                        }
                         if(address.value == "")
                              {
                             document.getElementById("txtErroraddress").innerHTML = "Bạn chưa nhập địa chỉ!";
                            document.getElementById("txtErroraddress").className = "error"
                            address.focus();
                            return false;
                        }
                       
                        
                       
                    }

                }
                function checkDangnhap() {
                      var userNamelogin = document.getElementById("username_email");
                    var passwordlogin = document.getElementById("password");
                     if (userNamelogin.value != "" && passwordlogin.value != "") {
                       return true;
                    } else {
                         if (userNamelogin.value == "")
                        {
                            // alert("Nhap user name");
                            // document.getElementById("register_email").focus();
                            // return false;

                            document.getElementById("txtErrorUserlogin").innerHTML = "Bạn chưa nhập tên đăng nhập hoặc email!";
                            document.getElementById("txtErrorUserlogin").className = "error"
                            userNamelogin.focus();
                          
                            return false;
                        }
                        if (passwordlogin.value == "")
                        {
                            // alert("Nhap user name");
                            // document.getElementById("register_email").focus();
                            // return false;

                            document.getElementById("txtErrorpasslogin").innerHTML = "Bạn chưa nhập mật khẩu!";
                            document.getElementById("txtErrorpasslogin").className = "error"
                            passwordlogin.focus();
                          
                            return false;
                        }
                    }
                }
                
            </script>

    </body>


    <!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/login-register.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:33 GMT -->
</html>
