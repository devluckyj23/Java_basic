package midproject;

public class Product {
	//컬럼 정보에 따른 필드 선언
	 private int prcode; 		//상품코드
	 private String prname;		//상품명
	 private int price;			//가격
	 private String manufacture;	//제조사
	
	//생성자
	public Product() {}
	public Product(int prcode, String prname, int price, String manufacture) {
		super();
		this.prcode = prcode;
		this.prname = prname;
		this.price = price;
		this.manufacture = manufacture;
	}


	//getters & setters
	public int getPrcode() {
		return prcode;
	}


	public void setPrcode(int prcode) {
		this.prcode = prcode;
	}


	public String getPrname() {
		return prname;
	}


	public void setPrname(String prname) {
		this.prname = prname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getManufacture() {
		return manufacture;
	}


	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
	//toString
	@Override
	public String toString() {
		return "Product [prcode=" + prcode + ", prname=" + prname + ", price=" + price + ", manufacture=" + manufacture
				+ "]";
	}
	
	
	
	
	
	
	
}
