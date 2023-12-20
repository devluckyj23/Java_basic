package chapter05;

abstract class Shape2{

abstract void draw(); 


}

class Circle1 extends Shape2{
	@Override
	void draw() { System.out.println("원그리기");}
}

class Line1 extends Shape2{
	@Override
	void draw() {System.out.println("선 그리기");}
}
class Rect1 extends Shape2{
	@Override
	void draw() {System.out.println("사각형 그리기");}
}

public class ShapeEx1 {
	
	public static void main(String[] args) {
		Shape2 s = new Circle1();
		s.draw();

	}

}
