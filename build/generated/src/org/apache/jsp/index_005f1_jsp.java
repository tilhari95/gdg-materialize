package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"assest/css/materialize.css\"  media=\"screen,projection\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assest/css/style.css\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <title>GDGJSS|feedback system</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"assest/images/background.jpg\">\n");
      out.write("        <!-- header starts here  -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col s12\" style=\"height:570px\">\n");
      out.write("                <div  style=\"margin-top:80px\">\n");
      out.write("                    <table>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"hide-on-med-and-down\" style=\" width:200px ; height:300px\"></td>\n");
      out.write("                                <td>\n");
      out.write("                                    <h4 class=\"center-align black-text text-darken-4 \">Feedback System</h4>\n");
      out.write("                                    <h1 class=\"center-align black-text text-darken-4\">Google Developers Group</h1>\n");
      out.write("                                    <h3 class=\"center-align black-text text-darken-4\">JSS NOIDA</h3>\n");
      out.write("                                    <h6 class=\"center-align black-text text-darken-4\"><a class=\"black-text text-darken-4 hoverable\" href=\"http://gdgjss.in\">gdgjss.in</a></h6>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"hide-on-med-and-down\"><img src=\"assest/images/semigdglogo.png\" style=\" width:200px ; height:300px\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"hide-on-large-only center\"><img src=\"assest/images/fullgdglogo.png\" style=\" width:100px ; height:100px\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- header ends here -->\n");
      out.write("\n");
      out.write("        <!-- foooter starts here -->\n");
      out.write("        <footer class=\"page-footer light-blue darken-1 footer_row\">\n");
      out.write("            <div class=\"row footer_row\">\n");
      out.write("                <div class=\"col l6 s12\">\n");
      out.write("                    <p class=\"white-text text-lighten-4\">Your feedbacks are important for us. Thats how we improve..!  Click the given tab to feedback our events.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col l4 offset-l2 s12 center-align\" id=\"social_login_button\">\n");
      out.write("                    <button class=\"btn waves-effect waves-light indigo accent-4 centre-align hoverable\" type=\"submit\" name=\"action\">Log in with facebook\n");
      out.write("                        <i class=\"material-icons right\">send</i></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\t\n");
      out.write("        <!-- footer ends here -->\n");
      out.write("    </body>\n");
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
