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
	
	public ColorPoint () { super(0,0); // Point(�θ�) Ŭ�������� 0,0 �ʱⰪ�� �����´�
	this.setColor = "BLACK"; // color�� ������ �ʱⰪ
	}
	// ColorPoint ���� ����� �Ű������� �������ش�.
	public ColorPoint(int setXY, int setXYZ,String setColor) {
		super(setXY,setXYZ);
		this.setColor = setColor;
	}
	//main�Լ����� ����� �޼��带 �����ϴµ�, 
	//�θ�Ŭ�������� move�� ���� �ø��� toString�޼����� getX()�� getY()���� ���� �����´�. super
	void setXY(int setXY,int setXYZ) {
		super.move(setXY,setXYZ);
	}
	// ColorPoint Ŭ�������� color ����ϴ� �޼��� �����ؼ� ���. this
	void setColor (String setColor) {
		this.setColor = setColor;
}
	 
	public String toString () {
		return setColor + "����(" + getX()+","+ getY()+")�� ��";
	}

	public static void main(String[] args) {
	
	ColorPoint zeroPoint = new ColorPoint();
	System.out.println(zeroPoint.toString()+"�Դϴ�.");

	ColorPoint cp = new ColorPoint(5,5,"YELOOW");
	cp.setXY(5,5);
	cp.setColor("RED");
	String str = cp.toString();
	System.out.println(str + "�Դϴ�.");
	
	}
	
}