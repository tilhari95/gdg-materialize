package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class Admin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            String g=request.getParameter("event");
            List<Responses> es = s.createCriteria(Responses.class).list();
            if (request.getParameter("data") != null) {
                es = s.createCriteria(Responses.class).addOrder(Order.asc("name")).list();
            } else {
                s.createCriteria(Responses.class).list();
            }
            out.print("<table  align=center width=80% bgcolor=lightblue><tr><td>EMPID</td>"
                    
                    + "<td>EMAIL</td><td>DESIGNATION</td>"
                    + "<td>SALARY</td><td>CITY</td><td>SELECT</td>" +"<td>SALARY</td><td>CITY</td><td>SELECT</td>" +
                    "<td>SALARY</td><td>CITY</td><td>SELECT</td>" +
                    "<td>SALARY</td><td>CITY</td><td>SELECT</td>" +
                    "<td>SALARY</td><td>CITY</td><td>SELECT</td><tr>");
            for ( Responses em : es) {
                //out.print("<form action =Teacherpage>");
                out.print("<tr bgcolor=skyblue><td>" + em.getEvent()+ "</td>"
                        + "<td>" + em.getName()+ "</td><td>" + em.getInstitute()+ "</td>"
                        + "<td>" + em.getEmail()+ "</td>"
                        + "<td>" + em.getQues1()+ "</td>"
                        + "<td>" + em.getQues2()+ "</td> <tr>");
                
                out.print("<br>");
               // out.print("</form>");
            }
            out.print("</table>");
            out.print("<br>");
            out.print("<br>");
            out.print("<br>");
            
            out.print("<center>");
            out.print("<input type=submit name=button value=Add />");
            out.print("<input type=submit name=button value=Update />");
            out.print("<input type=submit name=button value=Delete />");
            out.print("</center>");
            out.print("</form>");
            out.print(request.getParameter("ch"));
            //String a = "Add";
            //String b="Delete";
           
            
        }
    }
        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }