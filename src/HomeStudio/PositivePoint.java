package HomeStudio;


public class PositivePoint extends Point{
	// 초기값을 부모클래스에서 가져온다 0,0
	public PositivePoint() {super(0,0);}
	//절대값이 필요하므로 음수가 없는 양수만 나올수있게 if문으로 설정해준다.
	public PositivePoint(int x, int y) {
		super(0, 0);
		if( x>0 && y >0);
	}
	
	//오버라이딩 시켜서 부모 클래스에서 move() 형식을 가져오고 그 값을 가져온다. super
	@Override
	public void move(int x, int y) {
		if( x>0 && y >0) super.move(x, y);
	}
	// 오버라이딩 시켜서 부모 클래스에서 toString() 형식을 가져오고 그 값을 가져온다. super
	@Override
	public String toString () {
		return "("+ super.getX()+","+ super.getY()+")의 점";
	}
	
	
	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); //객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "입니다.");

	}

}
