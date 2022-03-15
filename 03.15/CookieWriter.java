package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieWriter
 */
//@WebServlet("/CookieWriter")
public class CookieWriter extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//cookie생성 (name=value) :: 한글 인코딩 후 저장 
		Cookie cookie = new Cookie("name", URLEncoder.encode("홍길동"));
		
		cookie.setMaxAge(60*60);
//		cookie.setMaxAge(-1);
//		cookie.setMaxAge(0);
		res.addCookie(cookie);
		
		out.println("<html><body>");
		out.println("Cookie complete");
		out.println("</body></html>");
	
	}


}
