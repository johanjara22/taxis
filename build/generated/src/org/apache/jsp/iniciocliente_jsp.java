package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Beans.BeanCarreraCliente;

public final class iniciocliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\">\n");
      out.write("        <link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\"></link>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"login\">\n");
      out.write("            <form action=\"faces/ValidarCliente\" method=\"POST\" name='form-login'>\n");
      out.write("                <h2>Ingreso Para Clientes</h2>\n");
      out.write("                <span class=\"fontawesome-user\"></span>\n");
      out.write("                <input type=\"text\" placeholder=\"Usuario\" required=\"\" name=\"txt_usuario\"/>\n");
      out.write("                <span class=\"fontawesome-lock\"></span>\n");
      out.write("                <input type=\"password\" placeholder=\"Cedula\" required=\"\" name=\"txt_cedula\"/>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Iniciar Sesion\"/>\n");
      out.write("                <a href=\"inicio taxista.jsp\">Si eres taxista click aqui!</a><br /><br />\n");
      out.write("\n");
      out.write("                <a href=\"faces/RegistrarCliente.xhtml\" > No estas registrado? Registrate Aquí</a>!<br /><br />\n");
      out.write("                ");

                    session.setAttribute("ROL", "CLIENTE");
                   
                BeanCarreraCliente  bc= new BeanCarreraCliente();
                bc.setEstado(true);               
                    
             
      out.write("   \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
