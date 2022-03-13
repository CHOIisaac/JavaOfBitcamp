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

public class Login extends HttpServlet{
	///Field
	///Method
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = res.getWriter();

		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		
		//JDBC Start============================

		String fromDbId = null;
		String fromDbPwd = null;
		
		try {
			String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbuser = "scott";
			String dbpwd = "tiger";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
			PreparedStatement pStmt = con.prepareStatement("SELECT id, pwd FROM users WHERE ID = ?");
			pStmt.setString(1, id);
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next()) {
				fromDbId = rs.getString("id");
				fromDbPwd = rs.getString("pwd");
				System.out.println("db에서 확인한 id,pwd ==> "+ fromDbId + " : "+fromDbPwd);
				
			}else {
				System.out.println("db에 client에서 입력한 <"+id+">와 <"+pwd+">가 없습니다.");
			}
			rs.close();
			pStmt.close();
			con.close();

		}catch (Exception e) {
			System.out.println("===> JDBC관련 Exception이 발생한 모양 <===");
		}
		
		
		out.println("<html>");
		out.println("<head><title></title></head>");
		out.println("<body>");
		out.println("<h2>Login 화면</h2>");

		if(fromDbId != null && fromDbPwd != null && fromDbId.equals(id) && fromDbPwd.endsWith(pwd)) {
			out.println("id, pwd를 확인하세요.");
		}
		
		out.println("<p><p><a href='/edu/jw02/login.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
	}//end of service
}//end of class
