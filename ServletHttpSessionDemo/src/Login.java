import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		try 
		{
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		String name = request.getParameter("userName");
		String pass = request.getParameter("userPwd");
		if(name.equals("Benny")&& pass.equals("beni123"))
		{
			pwriter.print("Hello Mr.:" + name + "<br>");
			pwriter.print("<a href='details'>Click to see your details</a>");
			HttpSession session =request.getSession();
			session.setAttribute("uname",name);
			session.setAttribute("upass",pass);
			pwriter.close();
		}else
		{
			pwriter.print("<p style = 'color:red;font-weight:bold'>"+"User name or password is incorrect:</p>");
			RequestDispatcher dis = request.getRequestDispatcher("index.html");
			dis.include(request, response);	
		}
		}catch(Exception exp)
		{
			System.out.println(exp);
		}
	    
	}
}
