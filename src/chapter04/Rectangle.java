package chapter04;

public class Rectangle {
	
	
	
//	1. ��������
//	������ �̿��� ��
//	
	
	int w;
	int h;
	double area() { return w *h; }
	double perimeter() { return (w + h)*2 ; }
	
	public Rectangle() {} //Default ������
	public Rectangle (int w, int h) {
		this.w = w;
		this.h = h;
	}

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		rec.w = 2;
		rec.h = 10;

		System.out.println("���̴�" + rec.area());
		System.out.println("���̴�" + rec.perimeter());
		
	}

}
