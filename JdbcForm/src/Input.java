import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Input extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    			response.setContentType("text/html");
    			PrintWriter out = response.getWriter();
                String n1 = request.getParameter("txt1");
                String n2 = request.getParameter("txt2");
                String n3 = request.getParameter("txt3");
                String n4 = request.getParameter("txt4");
                String city = request.getParameter("sex");
                String Se = request.getParameter("City");
                String course = request.getParameter("Course");
                String district = request.getParameter("District");
                String state = request.getParameter("State");
                String pin = request.getParameter("pincode");
                String em = request.getParameter("emailid");
                String n5 = request.getParameter("txt5");
                String n6 = request.getParameter("txt6");
                String n7 = request.getParameter("txt7");
                String n8 = request.getParameter("txt8");
    }
}