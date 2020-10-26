import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomePage extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		try
		{
			PrintWriter pwriter = response.getWriter();
			HttpSession session =request.getSession(false);
			boolean loggedIn = session!=null;
			if(!loggedIn)
			{
				pwriter.print("<p style = \"color:red;font-weight:bold\">"+"Session Timed Out!!!</p>");
				request.getRequestDispatcher("index.html").include(request, response);
			//	RequestDispatcher dis= request.getRequestDispatcher("index.html");
			//	dis.include(request, response);
			}
			response.setContentType("text/html");
			String myName = (String)session.getAttribute("uname");
			String myPass = (String)session.getAttribute("upass");
			if(!myName.isEmpty())
			{
				pwriter.print("1. Name is :" +myName+ "<br>2. Age: 22");
				pwriter.print("<br>Enter Value :<input type='text'>");
				session.setMaxInactiveInterval(3);
			}
			else
			{
				pwriter.print("Unauthorized user");
				pwriter.close();
			}
			pwriter.close();
		}catch(Exception exp){
			System.out.println(exp+"4");
		}
	}
}
