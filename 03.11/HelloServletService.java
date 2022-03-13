package CLASS0311;


import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletService extends HttpServlet{
	///Field
	///Method
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		
		System.out.println(":: servlet service() start");
		System.out.println("Request Client IP : "+ req.getRemoteAddr());
		
		res.setContentType("text/html");
//		res.setContentType("text/html;charset=EUC-KR");
		
//		OutputStream outputStream = res.getOutputStream();
//		Writer writer = new OutputStreamWriter(outputStream);
//		PrintWriter out = new PrintWriter(writer);
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head><title>hello Servlet</title></head>");
		out.println("<body>");
		out.println("English : HelloServlet");
		out.println("<p>");
		out.println("Korea : 헬로 서블릿");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println(":: servlet service() End \n");

	}//end of service
}//end of class
