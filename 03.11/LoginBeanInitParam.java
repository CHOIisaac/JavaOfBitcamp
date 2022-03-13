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

public class LoginBeanInitParam extends HttpServlet{
	///Field
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPassword;
	
	public void init(ServletConfig sc) throws ServletException{
		super.init(sc);;
		jdbcDriver = sc.getInitParameter("jdbcDriver");
		jdbcURL = sc.getInitParameter("jdbcURL");
		jdbcUser = sc.getInitParameter("jdbcUser");
		jdbcPassword = sc.getInitParameter("jdbcPassword");
		
		System.out.println("web.xml에 등록된 InitParam값을 추출유무 확인");
		System.out.println("jdbcDriver : "+jdbcDriver);
		System.out.println("jdbcURL : "+jdbcURL);
		System.out.println("jdbcPassword : "+jdbcPassword);
	}
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
		
		UserInitParamDao dao = new UserInitParamDao();
		dao.setJdbcDriver(jdbcDriver);
		dao.setJdbcURL(jdbcURL);
		dao.setJdbcUser(jdbcUser);
		dao.setJdbcPassword(jdbcPassword);
		
		dao.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login 화면</h2>");
		
		if(userVO.isActive()) {
			out.println(id+"님 환영합니다.");
		}else {
			out.println("Login 실패 id.pwd를 확인하세요.");
		}

		out.println("<p><p><a href='/edu/jw04/loginBeanInitParam.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
	}//end of service
}//end of class
