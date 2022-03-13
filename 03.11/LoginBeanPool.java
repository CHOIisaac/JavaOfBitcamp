package CLASS0311;


import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginBeanPool extends HttpServlet{
	///Field
	///Method
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = res.getWriter();

		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		UserVO userVO = new UserVO();
		userVO.setId(id);;
		userVO.setPwd(pwd);
		
		UserPoolDao userPoolDao = new UserPoolDao();
		userPoolDao.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login 화면</h2>");
		
		if(userVO.isActive()) {
			out.println(id+"님 환영합니다.");
		}else {
			out.println("Login 실패 id.pwd를 확인하세요.");
		}

		out.println("<p><p><a href='/edu/jw04/loginBeanVODao.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
}//end of class
