package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta charset=\"UTF-8\">\n");
      out.write("      <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\" />\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"assest/css/materialize.css\"  media=\"screen,projection\" />\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"assest/css/style.css\" />\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("      <title>GDGJSS|feedback home</title>\n");
      out.write("      <script>\n");
      out.write("\tfunction data(x){\n");
      out.write("\t\tif(x.action.value==\"\"){\n");
      out.write("\t\t\talert(\"You have not selected any event\");\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t{\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <!-- header starts here -->\n");
      out.write("    <body background=\"assest/images/background.jpg\" >\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("                <div class=\"col s12 light-blue\" style=\"display:inline-block\"><h3 class=\"white-text center\" style=\"font-weight:500\"> Google Developers Group</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 light-blue\" style=\"display:inline-block\"><h5 class=\"white-text center\" style=\"font-weight:500\"> JSS NOIDA</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 light-blue\" >\n");
      out.write("                <div class=\"col m4 \"><h6 class=\"white-text left\"> Welcome USERNAME</h6></div>\n");
      out.write("                <div class=\"col s4\"><h6 class=\"white-text center hide-on-small-only\"> Feedback System</h6></div>\n");
      out.write("                <div class=\"col s6 m4\"><h6 class=\"right\"><a class=\"white-text hoverable\" href=\"http://gdgjss.in\">gdgjss.in</a></h6></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <form>\n");
      out.write("            <div class=\"col s12\" style=\"display:inline-block;padding-left:17px;padding-top:10px;\"><button class=\"btn waves-effect waves-light light-blue darken-3 left hoverable left\" type=\"submit\" name=\"action\">Logout</button>\n");
      out.write("            </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- header ends here -->\n");
      out.write("              <div style=\"height:320px\">\n");
      out.write("              <div class=\"center\"><img src=\"assest/images/fullgdglogo.png\" style=\" width:200px ; height:200px\"></div>\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div>\n");
      out.write("              <div class=\"input-field col s12 m6 offset-m3\">\n");
      out.write("                  <form action=\"feedbackform.jsp\">\n");
      out.write("                      <select name=\"event\" class=\"browser-default  light-blue lighten-3 hoverable\" required />\n");
      out.write("                   <option value=\"\" disabled selected>Select event to provide feedback</option>\n");
      out.write("                   <option value=\"GDG INDUCO\">GDG INDUCO</option>\n");
      out.write("                   <option value=\"LET'S TALK GSOC\">LET'S TALK GSOC</option>\n");
      out.write("                   <option value=\"EXTRA BIT WITH GIT\">EXTRA BIT WITH GIT</option>\n");
      out.write("                    <option value=\"4\">other</option> \n");
      out.write("               </select>\n");
      out.write("            </div>\n");
      out.write("              </div>\n");
      out.write("               <div class=\"col s12 m6 offset-m3\"><h6 class=\"center\" style=\"padding-top:20px\">Feedback for a particular event can be provided only once.</h6></div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- foooter starts here -->\n");
      out.write("        <footer class=\"page-footer light-blue darken-1 footer_row\" style=\"margin-bottom: 0px\">\n");
      out.write("                <div class=\"row footer_row\" style=\"margin-bottom: 0px\">\n");
      out.write("                    <div class=\"col l6 s12\">\n");
      out.write("                      <p class=\"white-text text-lighten-4\">Feedbacks helps analyse our potential and efforts , which is very important for any organization. Click the given tab to proceed.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col l4 offset-l2 s12 center-align\" id=\"social_login_button\">\n");
      out.write("                        \n");
      out.write("                      <button class=\"btn waves-effect waves-light indigo accent-4 centre-align hoverable\" type=\"submit\" name=\"action\">Proceed\n");
      out.write("                <i class=\"material-icons right\">send</i></button></form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("          </footer> \n");
      out.write("                  \n");
      out.write("        <!-- footer ends here -->\n");
      out.write("        <script src=\"assest/js/jQuery.js\"></script>\n");
      out.write("     <script src=\"assest/js/materialize.js\"></script>\n");
      out.write("        </body>\n");
      out.write("        </html>");
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
