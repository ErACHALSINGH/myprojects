import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SetCookie extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		try 
		{
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		String name = request.getParameter("uName");
		String password = request.getParameter("uPass");
	    pwriter.print("Hello Mr.:" + name + "<br>");
		Cookie c1 = new Cookie("usrName",name);
		Cookie c2 = new Cookie("usrPassword",password);
		response.addCookie(c1);
		response.addCookie(c2);
		pwriter.print("<br> <a href = 'welcome'> View Cookie Details</a>");
		pwriter.close();
		}catch(Exception exp)
		{
			System.out.println(exp);
		}
	    
	}
}
