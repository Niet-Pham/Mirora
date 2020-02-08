package org.apache.jsp.jsp.fontend.GioHang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaymentSucces_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/404.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:46 GMT -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"meta description\">\n");
      out.write("    <!-- Favicons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/WebProject/jsp/fontend/assets/img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"/WebProject/jsp/fontend/assets/img/icon.png\">\n");
      out.write("\n");
      out.write("    <!-- Title -->\n");
      out.write("    <title>Mirora - Watch & Luxury Store Bootstrap 4 Template</title>\n");
      out.write("\n");
      out.write("    <!-- ************************* CSS Files ************************* -->\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/WebProject/jsp/fontend/assets/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/WebProject/jsp/fontend/assets/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Elegent Icon CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/WebProject/jsp/fontend/assets/css/elegent-icons.css\">\n");
      out.write("\n");
      out.write("    <!-- All Plugins CSS css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/WebProject/jsp/fontend/assets/css/plugins.css\">\n");
      out.write("\n");
      out.write("    <!-- style css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/WebProject/jsp/fontend/assets/css/main.css\">\n");
      out.write("\n");
      out.write("    <!-- modernizr JS\n");
      out.write("    ============================================ -->\n");
      out.write("    <script src=\"/WebProject/jsp/fontend/assets/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"//oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"//oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Main Wrapper Start -->\n");
      out.write("    <div class=\"wrapper bg--shaft\">\n");
      out.write("        <!-- Header Area Start -->\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dungchung/header.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Header Area End -->\n");
      out.write("\n");
      out.write("        <!-- Main Wrapper Start -->\n");
      out.write("        <main id=\"content\" class=\"main-content-wrapper\">\n");
      out.write("            <div class=\"error-area pt--90 pb--100\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-xl-7 col-lg-8 text-center\">\n");
      out.write("                            <div class=\"error\">\n");
      out.write("                               \n");
      out.write("                                <h2>Đặt hàng thành công</h2>\n");
      out.write("                                <p>Bạn vui lòng quay trở lại trang chủ để tiếp tục</p>\n");
      out.write("                                \n");
      out.write("                                <a href=\"");
      out.print(request.getContextPath());
      out.write("/getData.htm\" class=\"btn btn-4 btn-style-3\">Quay trờ lại trang chủ</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <!-- Main Wrapper End -->\n");
      out.write("\n");
      out.write("           ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dungchung/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from d29u17ylf1ylz9.cloudfront.net/mirora-v2/mirora/404.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Nov 2018 02:31:46 GMT -->\n");
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
}
