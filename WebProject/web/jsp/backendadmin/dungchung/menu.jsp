<%-- 
    Document   : menu
    Created on : Jan 5, 2019, 4:02:04 PM
    Author     : Đức Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id="sidebar" class="sidebar      responsive">
    <script type="text/javascript">
        try {
            ace.settings.check('sidebar', 'fixed')
        } catch (e) {
        }
    </script>

 

    <ul class="nav nav-list">
        <li class="">
            <a href="<%=request.getContextPath()%>/IndexAdmin.htm">
                <i class="menu-icon fa fa-tachometer"></i>
                <span class="menu-text"> Trang chủ </span>
            </a>

            <b class="arrow"></b>
        </li>

        <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-desktop"></i>
                <span class="menu-text">
                  Quản lý bình luận
                </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
               

                <li class="">
                    
                    <a href="<%=request.getContextPath()%>/GetAllAdminComment.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Danh sách bình luận
                    </a>

                    <b class="arrow"></b>
                </li>
 
            </ul>
        </li>
          <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-desktop"></i>
                <span class="menu-text">
                  Quản lý loại sản phẩm
                </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
               

                <li class="">
                    
                    <a href="<%=request.getContextPath()%>/getAllPrdCategory.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Danh sách loại sản phẩm
                    </a>

                    <b class="arrow"></b>
                </li>
                  <li class="">
                    
                    <a href="<%=request.getContextPath()%>/initInsertPrdCategory.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Thêm mới
                    </a>

                    <b class="arrow"></b>
                </li>
 
            </ul>
        </li>
           <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-desktop"></i>
                <span class="menu-text">
                  Quản lý đơn đặt hàng
                </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
               

                <li class="">
                    
                    <a href="<%=request.getContextPath()%>/getAllOrderAdmin.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Danh sách đơn đặt hàng
                    </a>

                    <b class="arrow"></b>
                </li>
                 
 
            </ul>
        </li>
            <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-desktop"></i>
                <span class="menu-text">
                  Quản lý sản phẩm
                </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
               

                <li class="">
                    
                    <a href="<%=request.getContextPath()%>/getAllProductAdmin.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Danh sách sản phẩm
                    </a>

                    <b class="arrow"></b>
                </li>
                  <li class="">
                    
                    <a href="<%=request.getContextPath()%>/initInsertProduct.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Thêm mới
                    </a>

                    <b class="arrow"></b>
                </li>
 
            </ul>
        </li>
            <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-desktop"></i>
                <span class="menu-text">
                  Quản lý ảnh của sản phẩm
                </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
               

                <li class="">
                    
                    <a href="<%=request.getContextPath()%>/getAllImageProductAdmin.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Danh sách ảnh phụ
                    </a>

                    <b class="arrow"></b>
                </li>
                  <li class="">
                    
                    <a href="<%=request.getContextPath()%>/initInsertImgProduct.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Thêm mới
                    </a>

                    <b class="arrow"></b>
                </li>
 
            </ul>
        </li>
             <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-desktop"></i>
                <span class="menu-text">
                  Quản lý thương hiệu
                </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
               

                <li class="">
                    
                    <a href="<%=request.getContextPath()%>/getAllManufactuerAdmin.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Danh sách thương hiệu
                    </a>

                    <b class="arrow"></b>
                </li>
                  <li class="">
                    
                    <a href="<%=request.getContextPath()%>/initInsertManufactuer.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Thêm mới
                    </a>

                    <b class="arrow"></b>
                </li>
 
            </ul>
        </li>
        <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-desktop"></i>
                <span class="menu-text">
                  Quản lý người dùng
                </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
               

                <li class="">
                    
                    <a href="<%=request.getContextPath()%>/getAllAccountAdmin.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Danh sách người dùng
                    </a>

                    <b class="arrow"></b>
                </li>
                  <li class="">
                    
                    <a href="<%=request.getContextPath()%>/initInsertAccount.htm">
                          <i class="menu-icon fa fa-list"></i>
                        Thêm mới
                    </a>

                    <b class="arrow"></b>
                </li>
 
            </ul>
        </li>


      

     





        
    </ul><!-- /.nav-list -->

    <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
        <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
    </div>

    <script type="text/javascript">
        try {
            ace.settings.check('sidebar', 'collapsed')
        } catch (e) {
        }
    </script>
</div>