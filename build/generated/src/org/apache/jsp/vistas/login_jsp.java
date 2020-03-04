package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\"/>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("        <title>Iniciar sesión|AvisosHN</title>\r\n");
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
      out.write("    <body class=\"login-page\">\r\n");
      out.write("        <div class=\"login-box\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"javascript:void(0);\">Avisos<b>HN</b></a>\r\n");
      out.write("                <small>Tu sitio de compra y venta favorito</small>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"body\">\r\n");
      out.write("                    <form id=\"sign_in\" method=\"POST\">\r\n");
      out.write("                        <div class=\"msg\">Ingresa tus datos para iniciar sesión</div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"material-icons\">person</i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <div class=\"form-line\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"correo\" name=\"correo\" placeholder=\"Correo electrónico\" required autofocus>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"material-icons\">lock</i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <div class=\"form-line\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Contraseña\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xs-8 p-t-5\">\r\n");
      out.write("                                <input type=\"checkbox\" name=\"rememberme\" id=\"Recuerdame\" class=\"filled-in chk-col-pink\">\r\n");
      out.write("                                <label for=\"rememberme\">Remember Me</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xs-4\">\r\n");
      out.write("                                <input class=\"btn btn-block bg-pink waves-effect\" onclick=\"validar();\" value=\"Ingresar\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row m-t-15 m-b--20\">\r\n");
      out.write("                            <div class=\"col-xs-6\">\r\n");
      out.write("                                <a href=\"registro.jsp\">Registrate ahora!</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xs-6 align-right\">\r\n");
      out.write("                                <a href=\"forgot-password.html\">¿Olvidaste tu contraseña?</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Jquery Core Js -->\r\n");
      out.write("        <script src=\"/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core Js -->\r\n");
      out.write("        <script src=\"/plugins/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Waves Effect Plugin Js -->\r\n");
      out.write("        <script src=\"/plugins/node-waves/waves.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Validation Plugin Js -->\r\n");
      out.write("        <script src=\"/plugins/jquery-validation/jquery.validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Js -->\r\n");
      out.write("        <script src=\"js/admin.js\"></script>\r\n");
      out.write("        <script src=\"js/pages/examples/sign-in.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            function validar(){\r\n");
      out.write("                var correo = $(\"#correo\").val();\r\n");
      out.write("                var contraseña = $(\"#password\").val();\r\n");
      out.write("                \r\n");
      out.write("                if(isValidEmail(correo) && isValidContraseña(contraseña)){\r\n");
      out.write("                    alert(\"los campos ingresados son validos\");\r\n");
      out.write("                    let datos = '{\"correo\":\"'+correo+'\",\"contraseña\":\"'+contraseña+'\"}';\r\n");
      out.write("                    var json = JSON.parse(datos);\r\n");
      out.write("                    $.get(\"loginController.jsp\",json,function (respuesta){\r\n");
      out.write("                        alert(respuesta);\r\n");
      out.write("                    });\r\n");
      out.write("                }else{\r\n");
      out.write("                    alert(\"los campos ingresados no son validos\");\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            function isValidEmail(correo) { \r\n");
      out.write("                let estado = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,4})+$/.test(correo);\r\n");
      out.write("                if (!estado) {\r\n");
      out.write("                    alert(\"El correo ingresado no es valido\");\r\n");
      out.write("                }\r\n");
      out.write("                return estado; \r\n");
      out.write("            }\r\n");
      out.write("            function isValidContraseña(password) { \r\n");
      out.write("                let estado = /^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$/.test(password);\r\n");
      out.write("                if (!estado) {\r\n");
      out.write("                    alert(\"La contraseña ingresada no es valida\");\r\n");
      out.write("                }\r\n");
      out.write("                return estado; \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
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
