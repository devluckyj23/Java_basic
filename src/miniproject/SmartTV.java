package miniproject;

public class SmartTV extends Product{

private String resolution;
	

	public SmartTV(String pname, int price, String resolution) {
		this.pname=pname;
		this.price=price;
		this.resolution = resolution;
	} // 중복일 경우 super과 this를 명확하게 정해줘야한다. 

	@Override
	public void printExtra() {
		System.out.print("해상도 : " + resolution);
	}
}

	
