import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;
public class ServletDemo3 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		
		 pwriter.println(" Http Header Information<br>");

		Enumeration en=request.getHeaderNames();
		while(en.hasMoreElements()) {
		   Object obj=en.nextElement();
		   String hname= (String)en.nextElement();
		   String hvalue =request.getHeader(hname);
		   pwriter.println("<br> hName : " +hname + "<br> hvalue : "+hvalue);
		}
	pwriter.close();
	}
}
