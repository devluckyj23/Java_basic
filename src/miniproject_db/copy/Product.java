package miniproject_db.copy;

abstract class Product {
	int pcode;
	 String pname;
	 int price;
	 
	
	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printDefault() {
		System.out.print("상품코드 : " + pcode + ",");
		System.out.print("상품명 : " + pname + ",");
		System.out.print("상품명 : " + price + ",");
		printExtra();
	}
	
	public abstract void printExtra();
	

}
