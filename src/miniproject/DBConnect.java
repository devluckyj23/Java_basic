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
	   System.out.println("�̸��� �̸���(,�� ����)>>>");
	   //�̼�1. �̸�(name)�� �̸���(mail)�� �з�
	   Test t = null;
	   
	   vtest = new Vector<Test>();

	   
//	   String[] line = scan.nextLine().split(","); // .trim()���� �������� Ȯ��
////	   String name = line[0].trim();
////	   String mail = line[1].trim();
//	   t.setUname(line[0].trim());
//	   t.setEmail(line[1].trim());
      //0. JDBC Driver, URL, ID, PW ����   
      //0. SQL �� ���� 
//      String sql = "insert into test values(?,?)";
      String sql = "select * from test";
	   
      //DB ���ῡ �ʿ��� ��ü ���� 
      Connection con = null;
      PreparedStatement pstmt = null;
      
      //1. JDBC ����̹� �ε�
      Class.forName(jdbcdriver);   
      //2. Connection ����
      con = DriverManager.getConnection(url, id, pw); 
      //3. PreparedStatement �غ�   
      pstmt = con.prepareStatement(sql);
//      pstmt.setString(1, t.getUname());
//      pstmt.setString(2, t.getEmail());
      //4. SQL ���� : executeQuery(��ȸ)-ResultSet, executeUpdate(����, ����, ����)-int
//      if(pstmt.executeUpdate() ==0)
//    	  System.out.println("������Ʈ�� �ȵǾ����ϴ�.");
      
      
      //ResultSet���� Transaction ó��
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
      
      //6.Vector ���� ���
//      System.out.println("Vector�� �� �ִ� ����====");
     for(Test tt: vtest) {
//    	 System.out.println(tt.getUname() + ","+tt.getEmail());
     }
      pstmt.close();
      con.close();
   }
}