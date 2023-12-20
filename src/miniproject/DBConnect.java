package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class DBConnect {
   
   static String jdbcdriver = "com.mysql.cj.jdbc.Driver";
   static String url = "jdbc:mysql://localhost:3305/mydb";
   static String id = "root";
   static String pw = "1234";
   static Vector<Test> vtest = null;

   public static void main(String args[]) throws SQLException, ClassNotFoundException {
	   
	   Scanner scan = new Scanner(System.in);
	   System.out.println("이름과 이메일(,로 구분)>>>");
	   //미션1. 이름(name)과 이메일(mail)로 분류
	   Test t = null;
	   
	   vtest = new Vector<Test>();

	   
//	   String[] line = scan.nextLine().split(","); // .trim()으로 가능할지 확인
////	   String name = line[0].trim();
////	   String mail = line[1].trim();
//	   t.setUname(line[0].trim());
//	   t.setEmail(line[1].trim());
      //0. JDBC Driver, URL, ID, PW 설정   
      //0. SQL 문 정의 
//      String sql = "insert into test values(?,?)";
      String sql = "select * from test";
	   
      //DB 연결에 필요한 객체 선언 
      Connection con = null;
      PreparedStatement pstmt = null;
      
      //1. JDBC 드라이버 로드
      Class.forName(jdbcdriver);   
      //2. Connection 연결
      con = DriverManager.getConnection(url, id, pw); 
      //3. PreparedStatement 준비   
      pstmt = con.prepareStatement(sql);
//      pstmt.setString(1, t.getUname());
//      pstmt.setString(2, t.getEmail());
      //4. SQL 전송 : executeQuery(조회)-ResultSet, executeUpdate(삽입, 삭제, 수정)-int
//      if(pstmt.executeUpdate() ==0)
//    	  System.out.println("업데이트가 안되었습니다.");
      
      
      //ResultSet으로 Transaction 처리
      ResultSet rs = pstmt.executeQuery();
      while(rs.next()) {
    	  	t=new Test();
         System.out.println(rs.getString("uname")+","+rs.getString("email"));
        		 t.setUname(rs.getString("uname")); 
        		 t.setEmail(rs.getString("email"));
        		 vtest.add(t);
        		 
//        	     for(Test tt: vtest) 
//        	    	 System.out.println(tt);
      }
      
      //6.Vector 내용 출력
//      System.out.println("Vector에 들어가 있는 값들====");
     for(Test tt: vtest) {
//    	 System.out.println(tt.getUname() + ","+tt.getEmail());
     }
      pstmt.close();
      con.close();
   }
}