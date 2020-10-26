import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletDemo extends HttpServlet{
	private String msg;
	public void init() throws ServletException
	{
		msg= "Welcome to ServletDemo";
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		String name =request.getParameter("uname");
		String age =request.getParameter("uage");
		pwriter.println("<h2>" + msg + "<h2>");
		pwriter.println("<h2>" +"Name :"+ name + "<h2>");
		pwriter.println("<h2>" +"Age :"+ age+ "<h2>");
	}
	public void destroy() {}
}

