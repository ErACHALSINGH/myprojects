import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;
public class ServletDemo2 extends HttpServlet{
	private String msg;
	public void init() throws ServletException
	{
		msg= "Welcome to ServletDemo2";
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		response.setContentType("text/html");

		Enumeration en=request.getParameterNames();
		while(en.hasMoreElements()) {
		   Object obj=en.nextElement();
		   String param= (String)obj;
		   String pvalue =request.getParameter(param);
		   pwriter.println("<br>Parameter Name : " +param + "<br>parameter Value : "+pvalue);
		}
	pwriter.close();
	}
}
