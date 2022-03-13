package CLASS0311;


import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.*;
import javax.servlet.http.*;

public class PostData extends HttpServlet{
	///Field
	///Method
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		req.setCharacterEncoding("EUC_KR");
		
		res.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = res.getWriter();

		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		System.out.println(clientName+" : "+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>PostData.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Post Test</h2>");
		out.println("<li> 이름 : "+clientName);
		out.println("<li> 주소 : "+clientAddr);
		
		out.println("<p><p><a href='/edu/postData.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
	}//end of service
}//end of class
