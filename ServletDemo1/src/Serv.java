import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	public class Serv extends HttpServlet{
		private String msg1;
		public void init() throws ServletException
		{
			msg1= "Hello mr. Benny";
		}
		public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h2>" + msg1 + "<h2>");
		}
		public void destroy() {}
	}
