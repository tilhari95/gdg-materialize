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
public class Feedback extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        	response.setContentType("text/html;charset=UTF-8");
          
  	      String name=request.getParameter("name");
  	      String email=request.getParameter("email");
  	      String institute=request.getParameter("institute");
  	      String trade=request.getParameter("trade");
  	      String year=request.getParameter("year");
  	      int eval1=Integer.parseInt(request.getParameter("eval1"));
  	      int eval2=Integer.parseInt(request.getParameter("eval2"));
  	      int eval3=Integer.parseInt(request.getParameter("eval3"));
  	      int eval4=Integer.parseInt(request.getParameter("eval4"));
  	      String ques1=request.getParameter("ques1");
  	      String ques2=request.getParameter("ques2");
  	      String ques3=request.getParameter("ques3");
  	      String suggestion=request.getParameter("suggestion");
  	      String event1=request.getParameter("event1");
            Session s=NewHibernateUtil.getSessionFactory().openSession();
            
            Responses e=new Responses();
            e.setName(name);
            e.setEmail(email);
            e.setInstitute(institute);
            e.setTrade(trade);
            e.setYear(year);
            e.setEval1(eval1);
            e.setEval2(eval2);
            e.setEval3(eval3);
            e.setEval4(eval4);
            e.setQues1(ques1);
            e.setQues2(ques2);
            e.setQues3(ques3);
            e.setSuggestion(suggestion);
            e.setEvent(event1);
            e.setId(11);
            
            s.save(e);
            s.beginTransaction().commit();
            response.sendRedirect("response.jsp");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
