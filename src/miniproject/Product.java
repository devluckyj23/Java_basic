package miniproject;

abstract class Product {

	 String pname;
	 int price;
	
	
	public void printDefault() {
		System.out.print("상품명 : " + pname + ",");
		System.out.print("상품명 : " + price + ",");
		printExtra();
	}
	public String toString() {
		return pname + "(" + price + ")";
	}
	
	public int getPrice() {
		return price;
	}
	
	public abstract void printExtra();


}
