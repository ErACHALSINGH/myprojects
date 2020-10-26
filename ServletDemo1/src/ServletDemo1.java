import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	public class ServletDemo1 extends HttpServlet{
		private String msg;
		public void init() throws ServletException
		{
			msg= "Hello Dear";
		}
		public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h2>" + msg + "<h2>");
		}
		public void destroy() {}
	}
