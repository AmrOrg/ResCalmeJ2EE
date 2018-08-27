package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"Scripts/jquery-3.3.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("      <li><a style=\"margin-right: 40px\" href=\"srv_Inscription\">S'inscrire</a></li>\r\n");
      out.write("      <li><a style=\"margin-right: 40px\" href=\"Contacts.jsp\">Contacts</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<h1 class=\"logo header__logo left\">\r\n");
      out.write("    <a href=\"index.jsp\">\r\n");
      out.write("        <img src=\"images/resCalme.php.png\"  alt=\"La plateforme de recherche d'appartements à louer à Montréal, Québec, Laval, Longueuil...\" title=\"La plateforme de recherche d'appartements à louer à Montréal, Québec, Laval, Longueuil...\">\r\n");
      out.write("    </a>\r\n");
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("        <div  style=\" height:600px; background-color: #333; background-image: url('images/background.jpg');\">\r\n");
      out.write("            <div class='container'>\r\n");
      out.write("                <div class=\"tagline\">\r\n");
      out.write("                    <div class=\"tagline-content\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"small-17 columns large-14 small-centered\">\r\n");
      out.write("                                <p class=\"tagline__title ui-up\">Vous cherchez un <br />appartement a louer ?</p>\r\n");
      out.write("                                <br> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div id=\"div_prov\" class=\"col-sm-2\">\r\n");
      out.write("                                <input style=\"height:50px  ; \" size=\"30\" type=\"search\" id=\"prov\" name=\"prov\" placeholder=\"Province\" onkeyup=\"chercherProv(this.value)\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"div_ville\" class=\"col-sm-2\">\r\n");
      out.write("\r\n");
      out.write("                                <input  style=\"height:50px ; \" size=\"30\" type=\"search\" id=\"ville\" placeholder=\"Ville\" onkeyup=\"chercherVille(this.value)\" >\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"div_type\" class=\"col-sm-2\">\r\n");
      out.write("\r\n");
      out.write("                                <input style=\"height:50px\" size=\"30\" type=\"search\" id=\"typeApp\" placeholder=\"Type appartement\"  onclick=\"chercherTypes()\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"div_prix\" class=\"col-sm-2\">\r\n");
      out.write("\r\n");
      out.write("                                <input style=\"height:50px\" size=\"30\" type=\"search\" id=\"prix\" placeholder=\"Prix\" onkeyup=\"chercherVille(this.value)\" >\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"div_services\" class=\"col-sm-2\">\r\n");
      out.write("\r\n");
      out.write("                                <input style=\"height:50px\" size=\"30\" type=\"search\" id=\"servicesApp\" placeholder=\"Choix des services\" onclick=\"chercherServices(this.value)\" >\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"div_prix\" class=\"col-sm-2\">\r\n");
      out.write("\r\n");
      out.write("                                <button class=\"btn\"><img src=\"images/search-icon.png\" width=\"50\" height=\"38\" alt=\"search-icon\"/></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script src=\"Scripts/ScriptsJS.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
