package miniproject;

public class CellPhone extends Product {
	private String carrier;
	

	public CellPhone(String pname, int price, String carrier) {
		this.pname=pname;
		this.price=price;
		this.carrier = carrier;
	} // �ߺ��� ��� super�� this�� ��Ȯ�ϰ� ��������Ѵ�. 

	@Override
	public void printExtra() {
		System.out.println("��Ż� : " + carrier);
	}
}
