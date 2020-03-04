package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("        <title>Registrarse|AvisosHN</title>\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" href=\"faviconOtros/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Fonts -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core Css -->\r\n");
      out.write("        <link href=\"plugins/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Waves Effect Css -->\r\n");
      out.write("        <link href=\"plugins/node-waves/waves.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Animation Css -->\r\n");
      out.write("        <link href=\"plugins/animate-css/animate.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Css -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"signup-page\">\r\n");
      out.write("        <div class=\"signup-box\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"javascript:void(0);\">Avisos<b>HN</b></a>\r\n");
      out.write("                <small>Tu sitio de compra y venta favorito</small>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"body\">\r\n");
      out.write("                    <form id=\"sign_up\" method=\"POST\">\r\n");
      out.write("                        <div class=\"msg\">Hazte nuevo miembro</div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"material-icons\">person</i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <div class=\"form-line\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"first-name\" placeholder=\"Nombre\" required autofocus>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"material-icons\">person</i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <div class=\"form-line\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"last-name\" placeholder=\"Apellido\" required autofocus>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"material-icons\">email</i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <div class=\"form-line\">\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Correo electrónico\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"material-icons\">lock</i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <div class=\"form-line\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" minlength=\"6\" placeholder=\"Contraseña\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"material-icons\">lock</i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <div class=\"form-line\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"confirm\" minlength=\"6\" placeholder=\"Confirme contraseña\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"checkbox\" name=\"terms\" id=\"terms\" class=\"filled-in chk-col-pink\">\r\n");
      out.write("                            <label for=\"terms\">Acepto los <a href=\"javascript:void(0);\">terminos de usuario</a>.</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <button class=\"btn btn-block btn-lg bg-pink waves-effect\" type=\"submit\">Registrarse</button>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"m-t-25 m-b--5 align-center\">\r\n");
      out.write("                            <a href=\"login.jsp\">¿Ya eres miembro?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Jquery Core Js -->\r\n");
      out.write("        <script src=\"plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core Js -->\r\n");
      out.write("        <script src=\"plugins/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Waves Effect Plugin Js -->\r\n");
      out.write("        <script src=\"plugins/node-waves/waves.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Validation Plugin Js -->\r\n");
      out.write("        <script src=\"plugins/jquery-validation/jquery.validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Js -->\r\n");
      out.write("        <script src=\"js/admin.js\"></script>\r\n");
      out.write("        <script src=\"js/pages/examples/sign-up.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
