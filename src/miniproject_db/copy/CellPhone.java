package miniproject_db.copy;

public class CellPhone extends Product {
	private String mf;
	

	public CellPhone(String pname, int price, String mf) {
		this.pname=pname;
		this.price=price;
		this.mf = mf;
	} // �ߺ��� ��� super�� this�� ��Ȯ�ϰ� ��������Ѵ�. 

	
	public String getMf() {
		return mf;
	}

	public void setMf(String mf) {
		this.mf = mf;
	}

	@Override
	public void printExtra() {
		System.out.println("��Ż� : " + mf);
	};
}
