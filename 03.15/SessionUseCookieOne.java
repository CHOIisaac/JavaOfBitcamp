package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookieWriter
 */
//@WebServlet("/CookieWriter")
public class SessionUseCookieOne extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		HttpSession session = req.getSession(true);
		
		if(session.isNew()) {
			session.setAttribute("name", new String("홍길동"));
		}
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h2>SessionUseCookieOne</h2></center>");
		
		System.out.println("\nUNIQUE한 JSESSIONID는 : "+session.getId());

		if(session.isNew()) {
			out.println("세션이 새로 생성됨.<br>");
			
		}else {
			out.println("\nUNIQUE한 JSESSIONID는 : "+session.getId()+"사용 중");
		}
		out.println("<hr>");
		out.println("<a href='/edu/SessionUseCookieTwo'>링크</a>");
		out.println("</body></html>");
	
	}

}//end of class
