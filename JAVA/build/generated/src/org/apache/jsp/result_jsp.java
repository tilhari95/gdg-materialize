package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.Session;
import java.util.List;
import backend.Responses;
import backend.NewHibernateUtil;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"assest/css/materialize.css\"  media=\"screen,projection\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assest/css/style.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <title>GDGJSS|feedback form</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <!-- header starts here -->\n");
      out.write("    <body background=\"assest/images/backgroundsmall.jpg\" >\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12 light-blue\" style=\"display:inline-block\"><h3 class=\"white-text center\" style=\"font-weight:500\"> Google Developers Group</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 light-blue\" style=\"display:inline-block\"><h5 class=\"white-text center\" style=\"font-weight:500\"> JSS NOIDA</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 light-blue\" ><div class=\"col s6 m4\"><h6 class=\"white-text left\">");
 String name; name=request.getParameter("event"); out.print(name); 
      out.write(" </h6></div><div class=\"col m4 hide-on-small-only\"><h6 class=\"white-text center\"> Feedback Form</h6></div><div class=\"col s6 m4\"><h6><a class=\"white-text right hoverable\" href=\"http://gdgjss.in\">gdgjss.in</a></h6></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- header ends here -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        <!-- feedback form starts here -->\n");
      out.write("        <div class=\"row  green lighten-5 hoverable\" >\n");
      out.write("            <table class=\"striped centered responsive-table\">\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("              <th data-field=\"id\">Name</th>\n");
      out.write("              <th data-field=\"name\">Item Name</th>\n");
      out.write("              <th data-field=\"price\">Item Price</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td>Alvin</td>\n");
      out.write("            <td>Eclair</td>\n");
      out.write("            <td>$0.87</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Alan</td>\n");
      out.write("            <td>Jellybean</td>\n");
      out.write("            <td>$3.76</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Jonathan</td>\n");
      out.write("            <td>Lollipop</td>\n");
      out.write("            <td>$7.00</td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("        </div>\n");
      out.write("        <!-- feedback form ends here -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- footer starts here -->\n");
      out.write("        <footer class=\"page-footer light-blue darken-1\">\n");
      out.write("            <div>\n");
      out.write("                <div class=\"row footer_row\" style=\"margin-bottom: 0px\">\n");
      out.write("                    <div class=\"col s12\">\n");
      out.write("                        <h6 class=\"white-text center\">Response to all fields is mandatory.</h6>\n");
      out.write("                        <div class=\"row container\">\n");
      out.write("                            <div class=\"col s6 center\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li></li>\n");
      out.write("                                     <button class=\"btn waves-effect waves-light light-blue darken-4 centre-align hoverable c\" type=\"submit\" name=\"action\">Submit Form</button></li>\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col s6 center\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li></li>\n");
      out.write("                                    <form action=\"feedbackform.jsp\"><li><button class=\"btn waves-effect waves-light light-blue darken-4 centre-align hoverable \" type=\"submit\" name=\"action\">Reset Form</button></li></ul>\n");
      out.write("                                    <input type=\"hidden\" name=\"event\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                </form> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- footer ends here -->\n");
      out.write("\n");
      out.write("        <script src=\"assest/js/jQuery.js\"></script>\n");
      out.write("        <script src=\"assest/js/materialize.js\"></script> \n");
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
