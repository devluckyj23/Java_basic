package chapter05;

class Shape{
	void draw() { System.out.println("Shape");}
}

class Line extends Shape{
	@Override
	void draw() { System.out.println("Line");} 
}
class Rect extends Shape{
	@Override
	void draw() { System.out.println("Rect");} 
}
class Circle extends Shape{
	@Override
	void draw() { System.out.println("Circle");} 
}

// ***오버라이딩을 하게되면 부모 클래스를 무시하고 자신의 클래스를 먼저 실행한다.***

public class ShapeEx {

	public static void main(String[] args) {
		Circle c = new Circle ();
		c.draw();
		Shape shape = new Line();
		shape.draw(); 
	}

}
