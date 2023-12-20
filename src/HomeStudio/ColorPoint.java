package HomeStudio;

class Point{
	
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() { return x;}
	public int getY() { return y;}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
//ColorPoint ============================================
public class ColorPoint extends Point{

	public String setColor;
	
	public ColorPoint () { super(0,0); // Point(부모) 클래스에서 0,0 초기값을 가져온다
	this.setColor = "BLACK"; // color는 블랙으로 초기값
	}
	// ColorPoint 에서 사용할 매개변수를 생성해준다.
	public ColorPoint(int setXY, int setXYZ,String setColor) {
		super(setXY,setXYZ);
		this.setColor = setColor;
	}
	//main함수에서 사용할 메서드를 생성하는데, 
	//부모클래스에서 move에 값을 올리고 toString메서드의 getX()와 getY()에서 값을 가져온다. super
	void setXY(int setXY,int setXYZ) {
		super.move(setXY,setXYZ);
	}
	// ColorPoint 클래스에서 color 출력하는 메서드 생성해서 사용. this
	void setColor (String setColor) {
		this.setColor = setColor;
}
	 
	public String toString () {
		return setColor + "색의(" + getX()+","+ getY()+")의 점";
	}

	public static void main(String[] args) {
	
	ColorPoint zeroPoint = new ColorPoint();
	System.out.println(zeroPoint.toString()+"입니다.");

	ColorPoint cp = new ColorPoint(5,5,"YELOOW");
	cp.setXY(5,5);
	cp.setColor("RED");
	String str = cp.toString();
	System.out.println(str + "입니다.");
	
	}
	
}