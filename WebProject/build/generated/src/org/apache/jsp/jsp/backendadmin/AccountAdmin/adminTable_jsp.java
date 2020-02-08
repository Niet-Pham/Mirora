package org.apache.jsp.jsp.backendadmin.AccountAdmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Tables - Ace Admin</title>\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"Static &amp; Dynamic Tables\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("\n");
      out.write("        <!-- bootstrap & fontawesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"/WebProject/jsp/backendadmin/assets/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"/WebProject/jsp/backendadmin/assets/font-awesome/4.2.0/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- page specific plugin styles -->\n");
      out.write("\n");
      out.write("        <!-- text fonts -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"/WebProject/jsp/backendadmin/assets/fonts/fonts.googleapis.com.css\" />\n");
      out.write("\n");
      out.write("        <!-- ace styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"/WebProject/jsp/backendadmin/assets/css/ace.min.css\" class=\"ace-main-stylesheet\" id=\"main-ace-style\" />\n");
      out.write("\n");
      out.write("        <!--[if lte IE 9]>\n");
      out.write("                <link rel=\"stylesheet\" href=\"/WebProject/jsp/backendadmin/assets/css/ace-part2.min.css\" class=\"ace-main-stylesheet\" />\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!--[if lte IE 9]>\n");
      out.write("          <link rel=\"stylesheet\" href=\"/WebProject/jsp/backendadmin/assets/css/ace-ie.min.css\" />\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- inline styles related to this page -->\n");
      out.write("\n");
      out.write("        <!-- ace settings handler -->\n");
      out.write("        <script src=\"/WebProject/jsp/backendadmin/assets/js/ace-extra.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->\n");
      out.write("\n");
      out.write("        <!--[if lte IE 8]>\n");
      out.write("        <script src=\"/WebProject/jsp/backendadmin/assets/js/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"/WebProject/jsp/backendadmin/assets/js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body class=\"no-skin\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dungchung/header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"main-container\" id=\"main-container\">\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    try {\n");
      out.write("                        ace.settings.check('main-container', 'fixed')\n");
      out.write("                    } catch (e) {\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dungchung/menu.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"main-content\">\n");
      out.write("                    <div class=\"main-content-inner\">\n");
      out.write("                        <div class=\"breadcrumbs\" id=\"breadcrumbs\">\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                try {\n");
      out.write("                                    ace.settings.check('breadcrumbs', 'fixed')\n");
      out.write("                                } catch (e) {\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("\n");
      out.write("                            <ul class=\"breadcrumb\">\n");
      out.write("                                <li>\n");
      out.write("                                    <i class=\"ace-icon fa fa-home home-icon\"></i>\n");
      out.write("                                    <a href=\"#\">Trang chủ</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Quản lý tài khoản </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"active\">Danh sách</li>\n");
      out.write("                            </ul><!-- /.breadcrumb -->\n");
      out.write("\n");
      out.write("                            <div class=\"nav-search\" id=\"nav-search\">\n");
      out.write("                                <form class=\"form-search\">\n");
      out.write("                                    <span class=\"input-icon\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Search /WebProject/jsp/backendadmin.\" class=\"nav-search-input\" id=\"nav-search-input\" autocomplete=\"off\" />\n");
      out.write("                                        <i class=\"ace-icon fa fa-search nav-search-icon\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                </form>\n");
      out.write("                            </div><!-- /.nav-search -->\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"page-content\">\n");
      out.write("                            <div class=\"ace-settings-container\" id=\"ace-settings-container\">\n");
      out.write("                                <div class=\"btn btn-app btn-xs btn-warning ace-settings-btn\" id=\"ace-settings-btn\">\n");
      out.write("                                    <i class=\"ace-icon fa fa-cog bigger-130\"></i>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"ace-settings-box clearfix\" id=\"ace-settings-box\">\n");
      out.write("                                    <div class=\"pull-left width-50\">\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <div class=\"pull-left\">\n");
      out.write("                                                <select id=\"skin-colorpicker\" class=\"hide\">\n");
      out.write("                                                    <option data-skin=\"no-skin\" value=\"#438EB9\">#438EB9</option>\n");
      out.write("                                                    <option data-skin=\"skin-1\" value=\"#222A2D\">#222A2D</option>\n");
      out.write("                                                    <option data-skin=\"skin-2\" value=\"#C6487E\">#C6487E</option>\n");
      out.write("                                                    <option data-skin=\"skin-3\" value=\"#D0D0D0\">#D0D0D0</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                            <span>&nbsp; Choose Skin</span>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-navbar\" />\n");
      out.write("                                            <label class=\"lbl\" for=\"ace-settings-navbar\"> Fixed Navbar</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-sidebar\" />\n");
      out.write("                                            <label class=\"lbl\" for=\"ace-settings-sidebar\"> Fixed Sidebar</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-breadcrumbs\" />\n");
      out.write("                                            <label class=\"lbl\" for=\"ace-settings-breadcrumbs\"> Fixed Breadcrumbs</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-rtl\" />\n");
      out.write("                                            <label class=\"lbl\" for=\"ace-settings-rtl\"> Right To Left (rtl)</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-add-container\" />\n");
      out.write("                                            <label class=\"lbl\" for=\"ace-settings-add-container\">\n");
      out.write("                                                Inside\n");
      out.write("                                                <b>.container</b>\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div><!-- /.pull-left -->\n");
      out.write("\n");
      out.write("                                    <div class=\"pull-left width-50\">\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-hover\" />\n");
      out.write("                                            <label class=\"lbl\" for=\"ace-settings-hover\"> Submenu on Hover</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-compact\" />\n");
      out.write("                                            <label class=\"lbl\" for=\"ace-settings-compact\"> Compact Sidebar</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"ace-settings-item\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-highlight\" />\n");
      out.write("                                            <label class=\"lbl\" for=\"ace-settings-highlight\"> Alt. Active Item</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div><!-- /.pull-left -->\n");
      out.write("                                </div><!-- /.ace-settings-box -->\n");
      out.write("                            </div><!-- /.ace-settings-container -->\n");
      out.write("\n");
      out.write("                 \n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-12\">\n");
      out.write("                                    <!-- PAGE CONTENT BEGINS -->\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-12\">\n");
      out.write("                                     \n");
      out.write("\n");
      out.write("                                            <!-- div.table-responsive -->\n");
      out.write("\n");
      out.write("                                            <!-- div.dataTables_borderWrap -->\n");
      out.write("                                            <div>\n");
      out.write("                                                <table id=\"dynamic-table\" class=\"table table-striped table-bordered table-hover\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            \n");
      out.write("                                                            <th>ID</th>\n");
      out.write("                                                            <th>Tên đăng nhập</th>\n");
      out.write("                                                             <th>Email</th>\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                            <th>\n");
      out.write("                                                                <i class=\"ace-icon fa fa-clock-o bigger-110 hidden-480\"></i>\n");
      out.write("                                                                Ngày tạo\n");
      out.write("                                                            </th>\n");
      out.write("                                                              <th>Quyền hạn</th>\n");
      out.write("                                                            <th class=\"hidden-480\">Trạng thái</th>\n");
      out.write("\n");
      out.write("                                                            <th></th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("\n");
      out.write("                                                    <tbody>\n");
      out.write("                   \n");
      out.write("                                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lstAcc}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("acc");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                                        <tr>\n");
            out.write("                                                            \n");
            out.write("\n");
            out.write("                                                            <td>\n");
            out.write("                                                                <a href=\"#\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.accountId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a>\n");
            out.write("                                                            </td>\n");
            out.write("                                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                            \n");
            out.write("                                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.createDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                            <td>");
            if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                                                ");
            if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                                            </td>\n");
            out.write("                                                            <td>");
            if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                                                ");
            if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                                            </td>\n");
            out.write("\n");
            out.write("                                                            <td>\n");
            out.write("                                                                <div class=\"hidden-sm hidden-xs action-buttons\">\n");
            out.write("                                                                   \n");
            out.write("\n");
            out.write("                                                                    <a class=\"green\" href=\"");
            out.print(request.getContextPath());
            out.write("/initUpdateacc.htm?accId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.accountId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                                                                        <i class=\"ace-icon fa fa-pencil bigger-130\"></i>\n");
            out.write("                                                                    </a>\n");
            out.write("                                                                ");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_if_4.setPageContext(_jspx_page_context);
            _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.isActive==false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
            int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
            if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n");
                out.write("                                                                    <a class=\"red\" href=\"");
                out.print(request.getContextPath());
                out.write("/removeAccAdmin.htm?accId=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.accountId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\">\n");
                out.write("                                                                        <i class=\"ace-icon fa fa-trash-o bigger-130\"></i>\n");
                out.write("                                                                    </a>");
                int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
              return;
            }
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
            out.write("\n");
            out.write("                                                                </div>\n");
            out.write("\n");
            out.write("                                                                <div class=\"hidden-md hidden-lg\">\n");
            out.write("                                                                    <div class=\"inline pos-rel\">\n");
            out.write("                                                                        <button class=\"btn btn-minier btn-yellow dropdown-toggle\" data-toggle=\"dropdown\" data-position=\"auto\">\n");
            out.write("                                                                            <i class=\"ace-icon fa fa-caret-down icon-only bigger-120\"></i>\n");
            out.write("                                                                        </button>\n");
            out.write("\n");
            out.write("                                                                        <ul class=\"dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close\">\n");
            out.write("                                                                            <li>\n");
            out.write("                                                                                <a href=\"");
            out.print(request.getContextPath());
            out.write("/deletePrdCategory.htm?prdCategoryId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catalog.prdCategoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\">\n");
            out.write("                                                                                    <span class=\"blue\">\n");
            out.write("                                                                                        <i class=\"ace-icon fa fa-search-plus bigger-120\"></i>\n");
            out.write("                                                                                    </span>\n");
            out.write("                                                                                </a>\n");
            out.write("                                                                            </li>\n");
            out.write("\n");
            out.write("                                                                            <li>\n");
            out.write("                                                                                <a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\">\n");
            out.write("                                                                                    <span class=\"green\">\n");
            out.write("                                                                                        <i class=\"ace-icon fa fa-pencil-square-o bigger-120\"></i>\n");
            out.write("                                                                                    </span>\n");
            out.write("                                                                                </a>\n");
            out.write("                                                                            </li>\n");
            out.write("\n");
            out.write("                                                                            <li>\n");
            out.write("                                                                                \n");
            out.write("                                                                                <a href=\"");
            out.print(request.getContextPath());
            out.write("/deletePrdCategory.htm?prdCategoryId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catalog.prdCategoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">\n");
            out.write("                                                                                    <span class=\"red\">\n");
            out.write("                                                                                        <i class=\"ace-icon fa fa-trash-o bigger-120\"></i>\n");
            out.write("                                                                                    </span>\n");
            out.write("                                                                                </a>\n");
            out.write("                                                                            \n");
            out.write("                                                                            </li>\n");
            out.write("                                                                        </ul>\n");
            out.write("                                                                    </div>\n");
            out.write("                                                                </div>\n");
            out.write("                                                            </td>\n");
            out.write("                                                        </tr>\n");
            out.write("                                                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div><!-- /.col -->\n");
      out.write("                            </div><!-- /.row -->\n");
      out.write("                        </div><!-- /.page-content -->\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- /.main-content -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dungchung/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!--[if !IE]> -->\n");
      out.write("            <script src=\"/WebProject/jsp/backendadmin/assets/js/jquery.2.1.1.min.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- <![endif]-->\n");
      out.write("\n");
      out.write("            <!--[if IE]>\n");
      out.write("<script src=\"/WebProject/jsp/backendadmin/assets/js/jquery.1.11.1.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("            <!--[if !IE]> -->\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                                                window.jQuery || document.write(\"<script src='/WebProject/jsp/backendadmin/assets/js/jquery.min.js'>\" + \"<\" + \"/script>\");\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <!-- <![endif]-->\n");
      out.write("\n");
      out.write("            <!--[if IE]>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("window.jQuery || document.write(\"<script src='/WebProject/jsp/backendadmin/assets/js/jquery1x.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("</script>\n");
      out.write("<![endif]-->\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                if ('ontouchstart' in document.documentElement)\n");
      out.write("                    document.write(\"<script src='/WebProject/jsp/backendadmin/assets/js/jquery.mobile.custom.min.js'>\" + \"<\" + \"/script>\");\n");
      out.write("            </script>\n");
      out.write("            <script src=\"/WebProject/jsp/backendadmin/assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- page specific plugin scripts -->\n");
      out.write("            <script src=\"/WebProject/jsp/backendadmin/assets/js/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script src=\"/WebProject/jsp/backendadmin/assets/js/jquery.dataTables.bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"/WebProject/jsp/backendadmin/assets/js/dataTables.tableTools.min.js\"></script>\n");
      out.write("            <script src=\"/WebProject/jsp/backendadmin/assets/js/dataTables.colVis.min.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- ace scripts -->\n");
      out.write("            <script src=\"/WebProject/jsp/backendadmin/assets/js/ace-elements.min.js\"></script>\n");
      out.write("            <script src=\"/WebProject/jsp/backendadmin/assets/js/ace.min.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- inline scripts related to this page -->\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                jQuery(function ($) {\n");
      out.write("                    //initiate dataTables plugin\n");
      out.write("                    var oTable1 =\n");
      out.write("                            $('#dynamic-table')\n");
      out.write("                            //.wrap(\"<div class='dataTables_borderWrap' />\")   //if you are applying horizontal scrolling (sScrollX)\n");
      out.write("                            .dataTable({\n");
      out.write("                                bAutoWidth: false,\n");
      out.write("                                \"aoColumns\": [\n");
      out.write("                                    {\"bSortable\": false},\n");
      out.write("                                    null, null, null, null, null,\n");
      out.write("                                    {\"bSortable\": false}\n");
      out.write("                                ],\n");
      out.write("                                \"aaSorting\": [],\n");
      out.write("                                //,\n");
      out.write("                                //\"sScrollY\": \"200px\",\n");
      out.write("                                //\"bPaginate\": false,\n");
      out.write("\n");
      out.write("                                //\"sScrollX\": \"100%\",\n");
      out.write("                                //\"sScrollXInner\": \"120%\",\n");
      out.write("                                //\"bScrollCollapse\": true,\n");
      out.write("                                //Note: if you are applying horizontal scrolling (sScrollX) on a \".table-bordered\"\n");
      out.write("                                //you may want to wrap the table inside a \"div.dataTables_borderWrap\" element\n");
      out.write("\n");
      out.write("                                //\"iDisplayLength\": 50\n");
      out.write("                            });\n");
      out.write("                    //oTable1.fnAdjustColumnSizing();\n");
      out.write("\n");
      out.write("\n");
      out.write("                    //TableTools settings\n");
      out.write("                    TableTools.classes.container = \"btn-group btn-overlap\";\n");
      out.write("                    TableTools.classes.print = {\n");
      out.write("                        \"body\": \"DTTT_Print\",\n");
      out.write("                        \"info\": \"tableTools-alert gritter-item-wrapper gritter-info gritter-center white\",\n");
      out.write("                        \"message\": \"tableTools-print-navbar\"\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    //initiate TableTools extension\n");
      out.write("                    var tableTools_obj = new $.fn.dataTable.TableTools(oTable1, {\n");
      out.write("                        \"sSwfPath\": \"/WebProject/jsp/backendadmin/assets/swf/copy_csv_xls_pdf.swf\",\n");
      out.write("                        \"sRowSelector\": \"td:not(:last-child)\",\n");
      out.write("                        \"sRowSelect\": \"multi\",\n");
      out.write("                        \"fnRowSelected\": function (row) {\n");
      out.write("                            //check checkbox when row is selected\n");
      out.write("                            try {\n");
      out.write("                                $(row).find('input[type=checkbox]').get(0).checked = true\n");
      out.write("                            }\n");
      out.write("                            catch (e) {\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        \"fnRowDeselected\": function (row) {\n");
      out.write("                            //uncheck checkbox\n");
      out.write("                            try {\n");
      out.write("                                $(row).find('input[type=checkbox]').get(0).checked = false\n");
      out.write("                            }\n");
      out.write("                            catch (e) {\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        \"sSelectedClass\": \"success\",\n");
      out.write("                        \"aButtons\": [\n");
      out.write("                            {\n");
      out.write("                                \"sExtends\": \"copy\",\n");
      out.write("                                \"sToolTip\": \"Copy to clipboard\",\n");
      out.write("                                \"sButtonClass\": \"btn btn-white btn-primary btn-bold\",\n");
      out.write("                                \"sButtonText\": \"<i class='fa fa-copy bigger-110 pink'></i>\",\n");
      out.write("                                \"fnComplete\": function () {\n");
      out.write("                                    this.fnInfo('<h3 class=\"no-margin-top smaller\">Table copied</h3>\\\n");
      out.write("                                                                    <p>Copied ' + (oTable1.fnSettings().fnRecordsTotal()) + ' row(s) to the clipboard.</p>',\n");
      out.write("                                            1500\n");
      out.write("                                            );\n");
      out.write("                                }\n");
      out.write("                            },\n");
      out.write("                            {\n");
      out.write("                                \"sExtends\": \"csv\",\n");
      out.write("                                \"sToolTip\": \"Export to CSV\",\n");
      out.write("                                \"sButtonClass\": \"btn btn-white btn-primary  btn-bold\",\n");
      out.write("                                \"sButtonText\": \"<i class='fa fa-file-excel-o bigger-110 green'></i>\"\n");
      out.write("                            },\n");
      out.write("                            {\n");
      out.write("                                \"sExtends\": \"pdf\",\n");
      out.write("                                \"sToolTip\": \"Export to PDF\",\n");
      out.write("                                \"sButtonClass\": \"btn btn-white btn-primary  btn-bold\",\n");
      out.write("                                \"sButtonText\": \"<i class='fa fa-file-pdf-o bigger-110 red'></i>\"\n");
      out.write("                            },\n");
      out.write("                            {\n");
      out.write("                                \"sExtends\": \"print\",\n");
      out.write("                                \"sToolTip\": \"Print view\",\n");
      out.write("                                \"sButtonClass\": \"btn btn-white btn-primary  btn-bold\",\n");
      out.write("                                \"sButtonText\": \"<i class='fa fa-print bigger-110 grey'></i>\",\n");
      out.write("                                \"sMessage\": \"<div class='navbar navbar-default'><div class='navbar-header pull-left'><a class='navbar-brand' href='#'><small>Optional Navbar &amp; Text</small></a></div></div>\",\n");
      out.write("                                \"sInfo\": \"<h3 class='no-margin-top'>Print view</h3>\\\n");
      out.write("                                                                      <p>Please use your browser's print function to\\\n");
      out.write("                                                                      print this table.\\\n");
      out.write("                                                                      <br />Press <b>escape</b> when finished.</p>\",\n");
      out.write("                            }\n");
      out.write("                        ]\n");
      out.write("                    });\n");
      out.write("                    //we put a container before our table and append TableTools element to it\n");
      out.write("                    $(tableTools_obj.fnContainer()).appendTo($('.tableTools-container'));\n");
      out.write("\n");
      out.write("                    //also add tooltips to table tools buttons\n");
      out.write("                    //addding tooltips directly to \"A\" buttons results in buttons disappearing (weired! don't know why!)\n");
      out.write("                    //so we add tooltips to the \"DIV\" child after it becomes inserted\n");
      out.write("                    //flash objects inside table tools buttons are inserted with some delay (100ms) (for some reason)\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        $(tableTools_obj.fnContainer()).find('a.DTTT_button').each(function () {\n");
      out.write("                            var div = $(this).find('> div');\n");
      out.write("                            if (div.length > 0)\n");
      out.write("                                div.tooltip({container: 'body'});\n");
      out.write("                            else\n");
      out.write("                                $(this).tooltip({container: 'body'});\n");
      out.write("                        });\n");
      out.write("                    }, 200);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    //ColVis extension\n");
      out.write("                    var colvis = new $.fn.dataTable.ColVis(oTable1, {\n");
      out.write("                        \"buttonText\": \"<i class='fa fa-search'></i>\",\n");
      out.write("                        \"aiExclude\": [0, 6],\n");
      out.write("                        \"bShowAll\": true,\n");
      out.write("                        //\"bRestore\": true,\n");
      out.write("                        \"sAlign\": \"right\",\n");
      out.write("                        \"fnLabel\": function (i, title, th) {\n");
      out.write("                            return $(th).text();//remove icons, etc\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    //style it\n");
      out.write("                    $(colvis.button()).addClass('btn-group').find('button').addClass('btn btn-white btn-info btn-bold')\n");
      out.write("\n");
      out.write("                    //and append it to our table tools btn-group, also add tooltip\n");
      out.write("                    $(colvis.button())\n");
      out.write("                            .prependTo('.tableTools-container .btn-group')\n");
      out.write("                            .attr('title', 'Show/hide columns').tooltip({container: 'body'});\n");
      out.write("\n");
      out.write("                    //and make the list, buttons and checkboxed Ace-like\n");
      out.write("                    $(colvis.dom.collection)\n");
      out.write("                            .addClass('dropdown-menu dropdown-light dropdown-caret dropdown-caret-right')\n");
      out.write("                            .find('li').wrapInner('<a href=\"javascript:void(0)\" />') //'A' tag is required for better styling\n");
      out.write("                            .find('input[type=checkbox]').addClass('ace').next().addClass('lbl padding-8');\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    /////////////////////////////////\n");
      out.write("                    //table checkboxes\n");
      out.write("                    $('th input[type=checkbox], td input[type=checkbox]').prop('checked', false);\n");
      out.write("\n");
      out.write("                    //select/deselect all rows according to table header checkbox\n");
      out.write("                    $('#dynamic-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function () {\n");
      out.write("                        var th_checked = this.checked;//checkbox inside \"TH\" table header\n");
      out.write("\n");
      out.write("                        $(this).closest('table').find('tbody > tr').each(function () {\n");
      out.write("                            var row = this;\n");
      out.write("                            if (th_checked)\n");
      out.write("                                tableTools_obj.fnSelect(row);\n");
      out.write("                            else\n");
      out.write("                                tableTools_obj.fnDeselect(row);\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    //select/deselect a row when the checkbox is checked/unchecked\n");
      out.write("                    $('#dynamic-table').on('click', 'td input[type=checkbox]', function () {\n");
      out.write("                        var row = $(this).closest('tr').get(0);\n");
      out.write("                        if (!this.checked)\n");
      out.write("                            tableTools_obj.fnSelect(row);\n");
      out.write("                        else\n");
      out.write("                            tableTools_obj.fnDeselect($(this).closest('tr').get(0));\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    $(document).on('click', '#dynamic-table .dropdown-toggle', function (e) {\n");
      out.write("                        e.stopImmediatePropagation();\n");
      out.write("                        e.stopPropagation();\n");
      out.write("                        e.preventDefault();\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("                    //And for the first simple table, which doesn't have TableTools or dataTables\n");
      out.write("                    //select/deselect all rows according to table header checkbox\n");
      out.write("                    var active_class = 'active';\n");
      out.write("                    $('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function () {\n");
      out.write("                        var th_checked = this.checked;//checkbox inside \"TH\" table header\n");
      out.write("\n");
      out.write("                        $(this).closest('table').find('tbody > tr').each(function () {\n");
      out.write("                            var row = this;\n");
      out.write("                            if (th_checked)\n");
      out.write("                                $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);\n");
      out.write("                            else\n");
      out.write("                                $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    //select/deselect a row when the checkbox is checked/unchecked\n");
      out.write("                    $('#simple-table').on('click', 'td input[type=checkbox]', function () {\n");
      out.write("                        var $row = $(this).closest('tr');\n");
      out.write("                        if (this.checked)\n");
      out.write("                            $row.addClass(active_class);\n");
      out.write("                        else\n");
      out.write("                            $row.removeClass(active_class);\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    /********************************/\n");
      out.write("                    //add tooltip for small view action buttons in dropdown menu\n");
      out.write("                    $('[data-rel=\"tooltip\"]').tooltip({placement: tooltip_placement});\n");
      out.write("\n");
      out.write("                    //tooltip placement on right or left\n");
      out.write("                    function tooltip_placement(context, source) {\n");
      out.write("                        var $source = $(source);\n");
      out.write("                        var $parent = $source.closest('table')\n");
      out.write("                        var off1 = $parent.offset();\n");
      out.write("                        var w1 = $parent.width();\n");
      out.write("\n");
      out.write("                        var off2 = $source.offset();\n");
      out.write("                        //var w2 = $source.width();\n");
      out.write("\n");
      out.write("                        if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2))\n");
      out.write("                            return 'right';\n");
      out.write("                        return 'left';\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                })\n");
      out.write("            </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.userRole==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("User");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.userRole==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Admin");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.isActive==true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Kích hoạt");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.isActive==false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Không kích hoạt");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
