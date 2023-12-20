package chapter04;

public class Rectangle {
	
	
	
//	1. 변수선언
//	변수를 이용한 식
//	
	
	int w;
	int h;
	double area() { return w *h; }
	double perimeter() { return (w + h)*2 ; }
	
	public Rectangle() {} //Default 생성자
	public Rectangle (int w, int h) {
		this.w = w;
		this.h = h;
	}

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		rec.w = 2;
		rec.h = 10;

		System.out.println("넓이는" + rec.area());
		System.out.println("넓이는" + rec.perimeter());
		
	}

}
