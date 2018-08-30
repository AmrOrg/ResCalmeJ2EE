package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestSlide_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body class=\"container\">\n");
      out.write("\n");
      out.write("        <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("            <!-- Indicators -->\n");
      out.write("            <ul class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("                <li data-target=\"#demo\" data-slide-to=\"3\"></li>\n");
      out.write("                <li data-target=\"#demo\" data-slide-to=\"4\"></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <!-- The slideshow -->\n");
      out.write("            <div class=\"carousel-inner\" style=\"margin-top: 200px;\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"images/appartments/14908336563phpi9LI2K.jpg\" alt=\"Los Angeles\" width=\"1100\" height=\"500\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"images/appartments/14908336564phpvciH6392cd.jpg\" alt=\"Chicago\" width=\"1100\" height=\"500\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"images/appartments/14908336565phpNq1NNb.jpg\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"images/appartments/14908336565phpNq1NNbb856.jpg\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"images/appartments/14908336567phpQeJi5r92cd.jpg\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Left and right controls -->\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
}
