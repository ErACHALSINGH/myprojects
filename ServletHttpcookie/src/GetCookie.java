import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class GetCookie extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			Cookie c[] = request.getCookies();
			for(int i= 0;i<c.length;i++)
			{
				pwriter.print(c[i].getName()+":"+c[i].getValue()+"<br>");
			}
			pwriter.close();
		}catch(Exception exp){
			System.out.println(exp);
		}
	}
}
