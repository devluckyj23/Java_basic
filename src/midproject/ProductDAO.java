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
	   
	//�޺��ڽ��� ��ǰ ���� ��ȣ ����� ���� ���� ����
	// == getItems : prcode ����Ʈ�� ��ȸ�ϴ� ���
	   public Vector<String> getItems(){
		   return items;
	   }
	   
	 //getAll : ��ü ������ ��ȸ�ϴ� ���
		public ArrayList<Product> getAll(){
		connectDB();
		sql = "select * from product";

			//ArrayList�� ��ǰ ������ ��� ����
		   ArrayList<Product> datas = new ArrayList<Product>();
//		   
		   //������ȣ �޺��ڽ� �����͸� ���� ���� �ʱ�ȭ
		   items = new Vector<String>();
		   items.add("��ü");   
		  
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		while(rs.next()) {
			Product p = new Product();
			p.setPrcode(rs.getInt("prcode"));
			p.setPrname(rs.getString("prname"));
			p.setPrice(rs.getInt("price"));
			p.setManufacture(rs.getString("manufacture"));
			datas.add(p); //��ü��ǰ���
			items.add(String.valueOf(rs.getInt("prcode")));//todo for GUI �޺��ڽ����� ���
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
		
		//getProduct : ��ǰ�ڵ�� ��ǰ ������ ��ȸ�ϴ� ���
		public Product getProduct(int prcode) {
			connectDB();
			sql = "select * from product where prcode = ?";
			Product p =null;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, prcode);
				rs = pstmt.executeQuery();
				rs.next(); //rs�� ���� return
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

	
	//newProduct : ��ǰ ��� ���
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
	
	//delProduct : ��ǰ ���� ���
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
	
	//updateProduct : ��ǰ���� ������Ʈ ���
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
	
	// connertDB : DB ����
	  
		public void connectDB() {
			try {
				Class.forName(jdbcdriver);
				conn = DriverManager.getConnection(url, id, pw);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				}
			}
		// connertDB : DB ����
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