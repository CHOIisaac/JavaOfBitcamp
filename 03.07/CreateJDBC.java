package test;

import java.sql.*;

/*
 *	1. JDBC Programming  절차
 *  2. 각각의 JDBC Programming 절차에서 발생하는 Exception 이해
 *  3. executeQuery(SQL) , executeUpdate(SQL) Method 이해
 */
public class CreateJDBC {

    ///Main Method
    public static void main(String[] args) throws Exception {

        // JDBC 절차에 필요한 인스턴스 및 정보 선언
        Connection con = null;
        Statement stmt = null;
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";


        // 1. Connection : Login 과정을 추상화한 Interface
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("1. driver loading OK");
        } catch (ClassNotFoundException e) {
            System.out.println("\n -> Driver Loading 시 Exception 발생\n");
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(url, "scott", "tiger");
            System.out.println("2. connection 인스턴스 생성 완료");
        } catch (SQLException e) {
            System.out.println("\n -> JDBC 절차 중 Exception 발생 : " + e.getErrorCode());
            e.printStackTrace();
        }

        //2. Statement : Query 전송을 추상화한 interface
        try {
            stmt = con.createStatement();
            System.out.println("3. statement 객체 생성 완료");
        } catch (SQLException e) {
            System.out.println("\n -> JDBC 절차 중 Exception 발생 : " + e.getErrorCode());
            e.printStackTrace();
        }

        //Create Query 만들기
        String createSql = "CREATE TABLE firstJDBC " +
                "(no   NUMBER(3), " +
                "name    VARCHAR2(20), " +
                "email    VARCHAR2(30), " +
                "address VARCHAR2(50))";
        
        String deleteSql = "DROP TABLE firstJDBC";

        try {
            System.out.println("QUERY 전송결과 : " + stmt.executeUpdate(createSql));
            System.out.println("4. query 전송완료");
        } catch (SQLException e) {
            System.out.println("\n -> JDBC 절차 중 Exception 발생 : " + e.getErrorCode());
            e.printStackTrace();
        }

        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("\n -> JDBC 절차 중 Exception 발생 : " + e.getErrorCode());
            e.printStackTrace();
        }

    }//end of main

}//end of class