package CLASS0311;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserPoolDao {

	
	public UserPoolDao() {
	}

	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
//			Class.forName(jdbcDriver);
//			con = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
			
			con = OracleConnectionPool.getInstance().getConnection();
			
			pStmt = con.prepareStatement("SELECT id, pwd FROM users WHERE ID = ? AND pwd=?");
			pStmt.setString(1, userVO.getId());
			pStmt.setString(2, userVO.getPwd());
			
			rs = pStmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("db에서 확인한 id,pwd ==> "+ userVO.getId() + " : "+userVO.getPwd());
				userVO.setActive(true);
			}else {
				System.out.println("db에 <"+userVO.getId()+">에 해당하는 자료가 없습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				}catch (Exception e) {
					
				}
				if(pStmt != null) {
					try {
						pStmt.close();
					} catch (Exception e) {
					}
					if(con != null) {
						try {
							con.close();
						} catch (Exception e) {
						}
					}
				}
			}
		}
	}//end of getUser()
	
}
