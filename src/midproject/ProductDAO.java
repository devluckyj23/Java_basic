package midproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;



public class ProductDAO {
	// driver,dburl,id,pw
		static String jdbcdriver = "com.mysql.cj.jdbc.Driver";
		static String url = "jdbc:mysql://localhost:3305/mydb";
		static String id = "root";
		static String pw = "1234";
	// conn, pstmt, rs, sql
	
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rs;
		
	   Vector<String> items = null;
	   String sql;
	   
	//콤보박스의 상품 관리 번호 목록을 위한 벡터 리턴
	// == getItems : prcode 리스트를 조회하는 기능
	   public Vector<String> getItems(){
		   return items;
	   }
	   
	 //getAll : 전체 정보를 조회하는 기능
		public ArrayList<Product> getAll(){
		connectDB();
		sql = "select * from product";

			//ArrayList에 상품 정보를 모두 넣음
		   ArrayList<Product> datas = new ArrayList<Product>();
//		   
		   //관리번호 콤보박스 데이터를 위한 벡터 초기화
		   items = new Vector<String>();
		   items.add("전체");   
		  
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		while(rs.next()) {
			Product p = new Product();
			p.setPrcode(rs.getInt("prcode"));
			p.setPrname(rs.getString("prname"));
			p.setPrice(rs.getInt("price"));
			p.setManufacture(rs.getString("manufacture"));
			datas.add(p); //전체상품목록
			items.add(String.valueOf(rs.getInt("prcode")));//todo for GUI 콤보박스내의 목록
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			closeDB();
		}
		return datas;
		}
		
		//getProduct : 상품코드로 상품 정보를 조회하는 기능
		public Product getProduct(int prcode) {
			connectDB();
			sql = "select * from product where prcode = ?";
			Product p =null;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, prcode);
				rs = pstmt.executeQuery();
				rs.next(); //rs의 한줄 return
				p = new Product();
				p.setPrcode(rs.getInt("prcode"));
				p.setPrname(rs.getString("prname"));
				p.setPrice(rs.getInt("price"));
				p.setManufacture(rs.getString("manufacture"));
				
			}
			catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
			finally {
				closeDB();
			}
			return p;
		}		   

	
	//newProduct : 상품 등록 기능
	public boolean newProduct(Product product) {
		connectDB();
		sql = "insert into product(prname,price,manufacture)values (?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPrname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getManufacture());
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		return false;	
		} finally {
			closeDB();
		}
		return true;
	}
	
	//delProduct : 상품 삭제 기능
	public boolean delProduct(int prcode) {
	connectDB();
	sql = "delete from product where prcode = ?";
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, prcode);
		pstmt.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
	return false;	
	} finally {
		closeDB();
	}
	return true;
	}
	
	//updateProduct : 상품정보 업데이트 기능
	public boolean updateProduct(Product product) {
	
	connectDB();
	sql = "update product set prname=?, price=?, manufacture=? where prcode=?";
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getPrname());
		pstmt.setInt(2, product.getPrice());
		pstmt.setString(3, product.getManufacture());
		pstmt.setInt(4, product.getPrcode());
		pstmt.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
		return false;
		}finally {
			closeDB();
		}
		return false;
	}
	
	// connertDB : DB 연결
	  
		public void connectDB() {
			try {
				Class.forName(jdbcdriver);
				conn = DriverManager.getConnection(url, id, pw);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				}
			}
		// connertDB : DB 종료
		public void closeDB() {
		
		try {
			pstmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		}
	
}