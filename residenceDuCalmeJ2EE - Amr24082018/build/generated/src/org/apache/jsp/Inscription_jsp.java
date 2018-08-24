package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inscription_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/entetePage.jspf");
  }

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css1.css\">\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Appartement, logement à louer au Québec</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/keys.png\" alt=\"images\"/></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"active\"><a href=\"index.jsp\">Recherche</a></li>\r\n");
      out.write("      <li><a style=\"margin-right: 40px\" href=\"Login.jsp\">Se connecter</a></li>\r\n");
      out.write("      <li><a style=\"margin-right: 40px\" href=\"Inscription.jsp\">S'inscrire</a></li>\r\n");
      out.write("      <li><a style=\"margin-right: 40px\" href=\"Contacts.jsp\">Contacts</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<h1 class=\"logo header__logo left\">\r\n");
      out.write("    <a href=\"index.jsp\">\r\n");
      out.write("        <img src=\"images/resCalme.php.png\"  alt=\"La plateforme de recherche d'appartements à louer à Montréal, Québec, Laval, Longueuil...\" title=\"La plateforme de recherche d'appartements à louer à Montréal, Québec, Laval, Longueuil...\">\r\n");
      out.write("    </a>\r\n");
      out.write("</h1>\r\n");
      out.write("\n");
      out.write("    <center>  \n");
      out.write("        <center><h1><u>Add User</u></h1></center>\n");
      out.write("        <center>\n");
      out.write("            <div>\n");
      out.write("                <form action=\"AdminSer\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <table>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User Name   </td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" name=\"UserName1\"  size=\"30\" placeholder=\"Username\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Password    </td>\n");
      out.write("                            <td><input type=\"password\" class=\"form-control\" name=\"PWD1\" placeholder=\"Password\" size=\"30\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Age  </td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" name=\"age1\"  size=\"30\" placeholder=\"Your Age\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Email </td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" name=\"email1\"  size=\"30\" placeholder=\"xyz@xyz.com\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" style=\"text-align:center\"><input  class=\"btn btn-success\" type=\"submit\" value=\"Save\" /></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </form>  \n");
      out.write("\n");
      out.write("                <p>");
      out.print( request.getAttribute("x"));
      out.write(" line inserted </p>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
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
