package miniproject;

public class CellPhone extends Product {
	private String carrier;
	

	public CellPhone(String pname, int price, String carrier) {
		this.pname=pname;
		this.price=price;
		this.carrier = carrier;
	} // 중복일 경우 super과 this를 명확하게 정해줘야한다. 

	@Override
	public void printExtra() {
		System.out.println("통신사 : " + carrier);
	}
}
