package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedbackform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"assest/css/materialize.css\"  media=\"screen,projection\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assest/css/style.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <title>GDGJSS|feedback form</title>\n");
      out.write("        <script>\n");
      out.write("\tfunction data(x){\n");
      out.write("\t\tif(x.action.value===\"\"){\n");
      out.write("\t\t\talert(\"You have not filled this legend\");\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t{\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
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
      out.write("            <form action=\"home.jsp\">\n");
      out.write("                <div class=\"col s12\" style=\"display:inline-block;padding-left:17px\"><button class=\"btn waves-effect waves-light light-blue darken-3 left hoverable left\" type=\"submit\" name=\"action\">Home</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- feedback form starts here -->\n");
      out.write("        <div class=\"row container green lighten-5 hoverable\" >\n");
      out.write("            <form action=\"Feedback\" class=\"col s12\" style=\"padding-top:30px\" method=\"post\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s12 m6 \">\n");
      out.write("                        <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                        <input id=\"icon_prefix\" type=\"text\" class=\"validate\" name=\"name\" required />\n");
      out.write("                        <label for=\"icon_prefix\">Full Name</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col m6 s12 \">\n");
      out.write("                        <i class=\"material-icons prefix\">email</i>\n");
      out.write("                        <input id=\"icon_prefix\" type=\"email\" class=\"validate\" name=\"email\" required />\n");
      out.write("                        <label for=\"icon_prefix\">Email Id</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s12 m6 \">\n");
      out.write("                        <i class=\"material-icons prefix\">school</i>\n");
      out.write("                        <input id=\"icon_prefix\" type=\"text\" class=\"validate\" name=\"institute\" required />\n");
      out.write("                        <label for=\"icon_prefix\">Institute Name</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s12 m3\"> \n");
      out.write("                        <select class=\"browser-default light-blue lighten-3\" name=\"trade\" required />\n");
      out.write("                            <option value=\"\" disabled selected>Choose your trade</option>\n");
      out.write("                            <option value=\"CSE\">BTECH CSE</option>\n");
      out.write("                            <option value=\"IT\">BTECH IT</option>\n");
      out.write("                            <option value=\"EC\">BTECH EC</option>\n");
      out.write("                            <option value=\"EE\">BTECH EE</option>\n");
      out.write("                            <option value=\"ME\">BTECH ME</option>\n");
      out.write("                            <option value=\"CE\">BTECH CE</option>\n");
      out.write("                            <option value=\"IC\">BTECH IC</option>\n");
      out.write("                            <option value=\"EEE\">BTECH EEE</option>\n");
      out.write("                            <option value=\"MT\">BTECH MT</option>\n");
      out.write("                            <option value=\"MTECH\">MTECH</option>\n");
      out.write("                            <option value=\"MCA\">MCA</option>\n");
      out.write("                            <option value=\"OTHERS\">OTHERS</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12 m3\">\n");
      out.write("                        <select class=\"browser-default  light-blue lighten-3\" name=\"year\" required />\n");
      out.write("                            <option value=\"\" disabled selected>Year</option>\n");
      out.write("                            <option value=\"I\">I</option>\n");
      out.write("                            <option value=\"II\">II</option>\n");
      out.write("                            <option value=\"III\">III</option>\n");
      out.write("                            <option value=\"IV\">IV</option>\n");
      out.write("                            <option value=\"OTHER\">OTHER</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s12 m6 \">\n");
      out.write("                        <p class=\"black-text \"><i class=\"material-icons prefix\">swap_horiz</i>Score the presenter(s)/speaker(s) of the event :</p> \n");
      out.write("                        <p class=\"range-field\">\n");
      out.write("                            <input type=\"range\" min=\"40\" max=\"100\" name=\"eval1\" required />\n");
      out.write("                        </p> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col s12 m6 \">\n");
      out.write("                        <p class=\"black-text\"><i class=\"material-icons prefix\">swap_horiz</i>Score the content (presentation/videos etc) used in event :</p> \n");
      out.write("                        <p class=\"range-field\">\n");
      out.write("                            <input type=\"range\" min=\"40\" max=\"100\"name=\"eval2\" required />\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s12 m6 \">\n");
      out.write("                        <p class=\"black-text\"><i class=\"material-icons prefix\">swap_horiz</i>Was the event intersting and informative :</p> \n");
      out.write("                        <p class=\"range-field\">\n");
      out.write("                            <input type=\"range\" min=\"40\" max=\"100\" name=\"eval3\" required/>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col s12 m6 \">\n");
      out.write("                        <p class=\"black-text\"><i class=\"material-icons prefix\">swap_horiz</i>Overall environment and experience of the event :</p>   \n");
      out.write("\n");
      out.write("                        <p class=\"range-field\">\n");
      out.write("                            <input type=\"range\"  min=\"40\" max=\"100\" name=\"eval4\" required />\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s12 m4 \">\n");
      out.write("                        <p> <i class=\"material-icons prefix tiny\">label</i>  Was the event well synchronised:</p>\n");
      out.write("                        <p>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques1\" type=\"radio\" id=\"test3\" value=\"YES\" /><label for=\"test3\">Yes,It was well organized!</label></br>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques1\" type=\"radio\" id=\"test4\"  value=\"NO\"/><label for=\"test4\">Sorry,It all messed up!</label></br>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques1\" type=\"radio\" id=\"test0\"  value=\"MAYBE\"/><label for=\"test0\">Satisfactory.</label>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col s12 m4 \">\n");
      out.write("                        <p><i class=\"material-icons prefix tiny\">label</i>  Will you participate in upcoming events:</p>\n");
      out.write("                        <p>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques2\" type=\"radio\" id=\"test146\"  value=\"YES\"/><label for=\"test146\">Yes,I will. </label></br>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques2\" type=\"radio\" id=\"test14\"   value=\"NO\"/><label for=\"test14\">Sorry,not interested. </label></br>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques2\" type=\"radio\" id=\"test10\"   value=\"MAYBE\"/><label for=\"test10\">It depends on my schedule.</label>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col s12 m4 \">\n");
      out.write("                        <p> <i class=\"material-icons prefix tiny \">label</i>  Will you like to join GDG JSS Noida:</p>\n");
      out.write("                        <p>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques3\" type=\"radio\" id=\"test21\"  value=\"YES\"/><label for=\"test21\">Yes,feeling excited about it!</label></br>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques3\" type=\"radio\" id=\"test141\"  value=\"NO\"/><label for=\"test141\">Sorry,I have other plans!</label></br>\n");
      out.write("                            <input class=\"with-gap\" name=\"ques3\" type=\"radio\" id=\"test15\"  value=\"MAYBE\"/><label for=\"test15\">Still confused.</label>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s12 \">\n");
      out.write("                        <i class=\"material-icons prefix\">mode_edit</i>\n");
      out.write("                        <textarea id=\"textarea1\" class=\"materialize-textarea\" name=\"suggestion\" required ></textarea>\n");
      out.write("                        <label for=\"textarea1\">Suggestions please..! This will help us improve our upcoming events:</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- feedback form ends here -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
 String name1; name1=request.getParameter("event"); request.setAttribute("name1", name1); 
      out.write("\n");
      out.write("        <input type=\"hidden\" name=\"event1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
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
      out.write("                                    </form>\n");
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
