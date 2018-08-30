package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListeAppartements_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/entetePage.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <title>Liste des appartements</title>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Appartement, logement à louer au Québec</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/keys.png\" alt=\"images\"/></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li class=\"active\"><a href=\"index.jsp\">Recherche</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <li><a style=\"margin-right: 40px;\" href=\"Contacts.jsp\">Contacts</a></li>\r\n");
      out.write("            <li>\r\n");
      out.write("            <form name=\"maForm\" action=\"srv_ControlLang\">\r\n");
      out.write("\r\n");
      out.write("                <select class=\"form-control\" name=\"lang\" onchange=\"submit()\">\r\n");
      out.write("                   \r\n");
      out.write("                    <option value=\"en_US\"> Francais</option>\r\n");
      out.write("                    <option value=\"en_US\"> English</option>\r\n");
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<h1 class=\"logo header__logo left\">\r\n");
      out.write("    <a href=\"index.jsp\">\r\n");
      out.write("        <img src=\"images/resCalme.php.png\"  alt=\"La plateforme de recherche d'appartements à louer à Montréal, Québec, Laval, Longueuil...\" title=\"La plateforme de recherche d'appartements à louer à Montréal, Québec, Laval, Longueuil...\">\r\n");
      out.write("    </a>\r\n");
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background: whitesmoke;\" >\r\n");
      out.write("        <form action=\"srv_checkout\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("            <div id=\"div_1\" class=\"row \">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"div_1_1 \"class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                    <img src=\"images/background.jpg\" width=\"950\" height=\"800\" alt=\"background\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"background: whitesmoke;margin-top:17px;\" id=\"div_1_2\" class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row center\">\r\n");
      out.write("                        <div align=\"center\"  id=\"div_annonce\" class=\"col-sm-12 \" >\r\n");
      out.write("\r\n");
      out.write("                            <a href=\"https://www.rbcroyalbank.com/personal.html\"><img src=\"images/RB_RB_FRE.png\" width=\"509\" height=\"100\" alt=\"RB_RB_FRE\"/></a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row center\">\r\n");
      out.write("                        <div align=\"center\" style=\"background:#fff ;margin-top:20px;border-color: red;width: 90%;margin-left: 40px;\" id=\"div_resTitle\" class=\"col-sm-12\" >\r\n");
      out.write("\r\n");
      out.write("                            <h2 style=\"color: #cc3300\"> Votre Recherche contient 200 </h2>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row  pre-scrollable\" style=\"max-height: 650px\" >\r\n");
      out.write("\r\n");
      out.write("                        <div  style=\"background :white;margin-top:20px;border-color: red;width: 44%;margin-left: 40px;\" id=\"div_resTitle\" class=\"col-sm-3\" >\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6\" >\r\n");
      out.write("                                    <img style=\"margin-left: -15px;\" src=\"images/appartments/14908336563phpi9LI2K.jpg\" width=\"200\" height=\"200\" alt=\"1490405228\"/>\r\n");
      out.write("                                    <img style=\"margin-left: -15px;position: absolute;\" src=\"images/appartments/14908336563phpi9LI2K.jpg\" width=\"50\" height=\"50\" alt=\"1490405228\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\" >\r\n");
      out.write("\r\n");
      out.write("                                    <h3>nom de ville ici</h3>\r\n");
      out.write("                                    <h3>prix est 9000</h3>\r\n");
      out.write("                                    <h5>adress</h5>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </form>         \r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                <li><a style=\"margin-right: 40px\" href=\"Login.jsp\">Se connecter</a></li>\r\n");
        out.write("                <li><a style=\"margin-right: 40px\" href=\"Inscription.jsp\">S'inscrire</a></li>\r\n");
        out.write("\r\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <li><a style=\"margin-right: 80px ;color: darkred; font: bold; font-size: 20px;\" href=\"/Profile.jsp\">Bienvenue  ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\r\n");
        out.write("                <li><a style=\"margin-right: 80px ;color: darkred; font: bold; font-size: 20px;\" href=\"srv_Login?logout=true\">Se déconnecter </a></li>\r\n");
        out.write("            ");
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
}
