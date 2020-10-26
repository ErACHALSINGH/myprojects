import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Validation extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		if(name.equals("Benny")&& pass.equals("beni123"))
		{
			RequestDispatcher dis=request.getRequestDispatcher("welcome");
			dis.forward(request, response);
		}else
		{
			pwriter.print("<p style = \"color:red;font-weight:bold\">"+"User name or password is incorrect:</p>");
		}
		RequestDispatcher dis=request.getRequestDispatcher("index.html");
		dis.include(request, response);		
	}
}
